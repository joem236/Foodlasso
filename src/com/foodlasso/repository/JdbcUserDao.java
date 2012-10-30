package com.foodlasso.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.foodlasso.domain.Permission;
import com.foodlasso.domain.User;

public class JdbcUserDao extends JdbcDaoSupport implements IUserDao {

	@Override
	public List<User> getUsers() {
		String sql = "select * from user_tbl";
		List<User> users = getJdbcTemplate().query(sql, new UserMapper());
		return users;
	}

	@Override
	public User getUserById(int id) {
		String sql = "select * from user_tbl where id = " + id;
		List<User> users = getJdbcTemplate().query(sql, new UserMapper());
		if (users.size() > 0) return users.get(0);
		return null;
	}

	@Override
	public User authenticateUser(String username, String password) {
		String sql = "select * from user_tbl where username = '" + username + "' and password = '" + password + "'";
		List<User> users = getJdbcTemplate().query(sql, new UserMapper());
		if (users.size() > 0) {
			User user = users.get(0);
			sql = "select a.id as object_id, a.name as object_name, b.permission from object_tbl as a join user_permission_map as b on (a.id = b.object_id) where b.user_id = " + user.getId();
			List<Permission> perms = getJdbcTemplate().query(sql, new PermissionMapper());
			Map<Integer, Integer> perMap = new HashMap<Integer, Integer>();
			Integer mask = 0;
			for (Permission p : perms) {
				mask = perMap.get(p.getPermissionId());
				if (mask == null) mask = p.getPermissionMask();
				else mask = mask | p.getPermissionMask();
				perMap.put(p.getPermissionId(), mask);
			}
			user.setPermissions(perMap);
			return user;
		}
		return null;
	}
	private static class PermissionMapper implements ParameterizedRowMapper<Permission> {
		public Permission mapRow(ResultSet rs, int rowNum) throws SQLException {
			Permission p = new Permission();
			p.setPermissionId(rs.getInt("object_id"));
			p.setPermissionMask(rs.getInt("permission"));
			p.setPermissionName(rs.getString("object_name"));
			return p;
		}
	}
	private static class UserMapper implements ParameterizedRowMapper<User> {
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User u = new User();
			u.setCompanyId(rs.getInt("company_id"));
			u.setUsername(rs.getString("username"));
			u.setId(rs.getInt("id"));
			u.setFirstName(rs.getString("first_name"));
			u.setLastName(rs.getString("last_name"));
			u.setEmail(rs.getString("email"));
			u.setOwner(rs.getBoolean("is_owner"));
			return u;
		}
	}
}
