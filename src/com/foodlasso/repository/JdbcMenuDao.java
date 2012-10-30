package com.foodlasso.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.foodlasso.domain.Category;
import com.foodlasso.domain.Menu;

public class JdbcMenuDao extends JdbcDaoSupport implements IMenuDao {
	@Override
	public List<Menu> getMenuList(int companyId) {
		logger.info("Getting Menus");
		String sql = "select * from menu_tbl where company_id = " + companyId;
		List<Menu> menus = getJdbcTemplate().query(sql, new MenuMapper());
		return menus;
	}
	
	@Override
	public Menu getMenuById(int companyId, int menuId) {
		String sql = "select * from menu_tbl where company_id = " + companyId + " and id = " + menuId;
		List<Menu> menus = getJdbcTemplate().query(sql, new MenuMapper());
		if (menus.size() == 0) return new Menu();
		return menus.get(0);
	}

	@Override
	public List<Category> getCategories(int companyId, int menuId) {
		return null;//List<Category> cats = 
	}
	
	@Override
	public void saveMenu(Menu menu) {
		// TODO Auto-generated method stub
	}
	
	private static class MenuMapper implements ParameterizedRowMapper<Menu> {

        public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
            Menu menu = new Menu();
            menu.setId(rs.getInt("id"));
            menu.setName(rs.getString("name"));
            menu.setDescription(rs.getString("description"));
            menu.setChildMenuId(rs.getInt("original_menu_id"));
            menu.setPublished(rs.getBoolean("published"));
            menu.setCompanyId(rs.getInt("company_id"));
            return menu;
        }
    }
}
