package com.foodlasso.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.foodlasso.domain.Company;

public class JdbcCompanyDao extends JdbcDaoSupport implements ICompanyDao {
	@Override
	public List<Company> getCompanyList() {
		List<Company> companies = getJdbcTemplate().query("select * from company_tbl", new CompanyMapper());
		return companies;
	}
	
	@Override
	public List<Company> getPagedCompanies(int currentPage, int pageSize) {
		String sql = "select * from company_tbl limit " + pageSize + " offset " + (currentPage * pageSize);
		List<Company> companies = getJdbcTemplate().query(sql, new CompanyMapper());
		return companies;
	}
	
	@Override
	public Company getCompanyById(int id) {
		String sql = "select * from company_tbl where id = " + id;
		List<Company> companies = getJdbcTemplate().query(sql, new CompanyMapper());
		if (companies.size() == 0) return new Company();
		return companies.get(0);
	}

	@Override
	public void saveCompany(Company c) {
		// TODO Auto-generated method stub

	}
	
	private static class CompanyMapper implements ParameterizedRowMapper<Company> {
		public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
			Company c = new Company();
			c.setId(rs.getInt("id"));
			c.setFactualId(rs.getString("factual_id"));
			c.setName(rs.getString("name"));
			c.setAddress(rs.getString("address"));
			c.setLocality(rs.getString("locality"));
			c.setRegion(rs.getString("region"));
			c.setCountry(rs.getString("country"));
			c.setPostcode(rs.getString("postcode"));
			c.setTel(rs.getString("tel"));
			c.setCategory(rs.getString("category"));
			c.setWebsite(rs.getString("website"));
			c.setLatitude(rs.getDouble("latitude"));
			c.setLongitude(rs.getDouble("longitude"));
			c.setAlcohol(rs.getString("alcohol"));
			c.setTakeout(rs.getString("takeout"));
			c.setDelivery(rs.getString("delivery"));
			c.setAlcohol_bool(rs.getString("alcohol_bool"));
			c.setDistance(rs.getString("distance"));
			c.setParking(rs.getString("parking"));
			c.setGood_for_kids(rs.getString("good_for_kids"));
			c.setCash_only(rs.getString("cash_only"));
			c.setParking_bool(rs.getString("parking_bool"));
			c.setMeals(rs.getString("meals"));
			c.setLunch(rs.getString("lunch"));
			c.setDinner(rs.getString("dinner"));
			c.setBar(rs.getString("bar"));
			c.setParking_garage(rs.getString("parking_garage"));
			c.setParking_good(rs.getString("parking_good"));
			c.setParking_lot(rs.getString("parking_lot"));
			c.setEmail(rs.getString("email"));
			c.setParking_free(rs.getString("parking_free"));
			c.setBreakfast(rs.getString("breakfast"));
			c.setVegan_options(rs.getString("vegan_options"));
			c.setVegetarian_options(rs.getString("vegetarian_options"));
			c.setWifi(rs.getString("wifi"));
			c.setAlcohol_beer_wine(rs.getString("alcohol_beer_wine"));
			c.setAddress_extended(rs.getString("address_extended"));
			c.setReservations(rs.getString("reservations"));
			c.setAlcohol_byob(rs.getString("alcohol_byob"));
			c.setWheelchair_access(rs.getString("wheelchair_access"));

			return c;
		}
	}

}
