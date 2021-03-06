package com.foodlasso.repository;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractJdbcDao {
	protected final Log logger = LogFactory.getLog(getClass());
	@Autowired
	protected JdbcTemplate jdbcTemplate;
}
