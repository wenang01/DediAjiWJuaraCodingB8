package com.juaracoding.main.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AbsensiRowMapper implements RowMapper<Absensi>{

	@Override
	public Absensi mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Absensi absensi = new Absensi();
		absensi.setNik(rs.getString("nik"));
		absensi.setNama(rs.getString("nama"));
		absensi.setStartDate(rs.getString("startDate"));
		absensi.setEndDate(rs.getString("endDate"));
		
		// TODO Auto-generated method stub
		return absensi;
	}

}