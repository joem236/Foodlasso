package com.foodlasso.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.foodlasso.domain.Category;

public class JdbcCategoryDao extends JdbcDaoSupport implements ICategoryDao {

	@Override
	public List<Category> getCategoryList(int companyId, int menuId) {
		String sql = "select * from category_tbl where company_id = " + companyId + " and menu_id = " + menuId + " order by position";
		return getJdbcTemplate().query(sql, new CategoryMapper());
	}
	
	@Override
	public HashMap<Integer, Category> getCategoryMap(int companyId, int menuId) {
		List<Category> cats = getCategoryList(companyId, menuId);
		HashMap<Integer,Category> catMap = new HashMap<Integer,Category>();
		for (int c = 0; c < cats.size(); c++) {
			catMap.put(new Integer(cats.get(c).getId()), cats.get(c));
		}
		return catMap;
	}

	@Override
	public Category getCategoryById(int companyId, int menuId, int categoryId) {
		String sql = "select * from category_tbl where company_id = " + companyId + " and menu_id = " + menuId + " and id = " + categoryId;
		List<Category> cats = getJdbcTemplate().query(sql, new CategoryMapper());
		if (cats.size() == 0) return new Category();
		return cats.get(0);
	}

	@Override
	public void saveCategory(Category c) {
		// TODO Auto-generated method stub
		
	}
	
	private static class CategoryMapper implements ParameterizedRowMapper<Category> {

        public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
            Category menu = new Category();
            menu.setId(rs.getInt("id"));
            menu.setName(rs.getString("name"));
            menu.setDescription(rs.getString("description"));
            menu.setCompanyId(rs.getInt("company_id"));
            menu.setMenuId(rs.getInt("menu_id"));
            return menu;
        }
    }
	
}
