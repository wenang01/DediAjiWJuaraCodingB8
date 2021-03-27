package com.juaracoding.main.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BonusRowMapper implements RowMapper<Bonus>{

	@Override
	public Bonus mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Bonus bonus = new Bonus();
		
		bonus.setWORKER_REF_ID(rs.getInt("WORKER_REF_ID"));
		bonus.setBONUS_DATE(rs.getString("BONUS_DATE"));
		bonus.setBONUS_AMOUNT(rs.getString("BONUS_AMOUNT"));
		
		return bonus;
	}

}
