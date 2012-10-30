package com.foodlasso.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.foodlasso.domain.Item;

public class JdbcItemDao extends JdbcDaoSupport implements IItemDao {

	@Override
	public List<Item> getItemList(int companyId, int menuId) {
		String sql = "select * from item_tbl where company_id = " + companyId + " and menu_id = " + menuId + " order by category_id, position";
		List<Item> items = getJdbcTemplate().query(sql, new ItemMapper());
		return items;
	}
	
	@Override
	public HashMap<Integer, Item> getItemMap(int companyId, int menuId) {
		List<Item> items = getItemList(companyId, menuId);
		HashMap<Integer, Item> map = new HashMap<Integer, Item>();
		for (int i = 0; i < items.size(); i++) {
			map.put(new Integer(items.get(i).getId()), items.get(i));
		}
		return map;
	}

	@Override
	public Item getItemById(int companyId, int menuId, int categoryId, int itemId) {
		String sql = "select * from item_tbl where company_id = " + companyId + " and menu_id = " + menuId + " and category_id = " + categoryId + " and id = " + itemId;
		List<Item> items = getJdbcTemplate().query(sql, new ItemMapper());
		if (items.size() == 0) return new Item();
		return items.get(0);
	}
	
	@Override
	public void saveItem(Item i) {
		// TODO Auto-generated method stub
		
	}
	
	private static class ItemMapper implements ParameterizedRowMapper<Item> {

        public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
            Item menu = new Item();
            menu.setId(rs.getInt("id"));
            menu.setName(rs.getString("name"));
            menu.setDescription(rs.getString("description"));
            menu.setCompanyId(rs.getInt("company_id"));
            menu.setMenuId(rs.getInt("menu_id"));
            menu.setCategoryId(rs.getInt("category_id"));
            return menu;
        }
    }

}
