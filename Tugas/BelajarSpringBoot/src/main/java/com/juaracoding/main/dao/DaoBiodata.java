package com.juaracoding.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.juaracoding.main.model.Biodata;
import com.juaracoding.main.model.BiodataRowMapper;


@Repository
public class DaoBiodata {
	
	@Autowired
	JdbcTemplate jdbc ;
	
	public int insertBiodata(Biodata biodata) {
		return jdbc.update("insert into biodata(nik,nama,alamat,id_salary) values ("+biodata.getNik()+",'"+biodata.getNama()+"','"+biodata.getAlamat()+"',"+biodata.getId_salary()+")");
		
	}
	
	public int updateBiodata(Biodata biodata) {
		return jdbc.update("update biodata set nama='"+biodata.getNama()+"',nama='"+biodata.getNama()+"',alamat='"+biodata.getAlamat()+"',id_salary="+biodata.getId_salary()+" where nik="+biodata.getNik()+"");
	}

	public int deleteBiodata(Biodata biodata) {
		return jdbc.update("DELETE FROM `biodata` WHERE nik = "+biodata.getNik()+"");
	}

	
	public List<Biodata> getBiodata() {
		
		String sql = "Select * from Biodata";
		
		List <Biodata> biodata =  jdbc.query(sql,new BiodataRowMapper());
		
		return biodata;
		
		
	}

}
