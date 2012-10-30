package com.foodlasso.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.foodlasso.domain.Price;

public class JdbcPriceDao extends JdbcDaoSupport implements IPriceDao {

	@Override
	public List<Price> getPrices(int company_id, int menu_id) {
		String sql = "select * from pricing_tbl where company_id = " + company_id + " and menu_id = " + menu_id + " order by item_id, position";
		List<Price> prices = getJdbcTemplate().query(sql, new PriceMapper());
		return prices;
	}

	@Override
	public void savePrice(Price price) {
		// TODO Auto-generated method stub

	}
	
	private static class PriceMapper implements ParameterizedRowMapper<Price> {

        public Price mapRow(ResultSet rs, int rowNum) throws SQLException {
            Price menu = new Price();
            menu.setId(rs.getInt("id"));
            menu.setName(rs.getString("name"));
            menu.setCompanyId(rs.getInt("company_id"));
            menu.setMenuId(rs.getInt("menu_id"));
            menu.setItemId(rs.getInt("item_id"));
            menu.setPrice(rs.getDouble("price"));
            menu.setPosition(rs.getInt("position"));
            return menu;
        }
    }

}
