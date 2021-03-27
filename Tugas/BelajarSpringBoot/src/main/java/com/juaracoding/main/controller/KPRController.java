package com.juaracoding.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.main.model.KPR;
import com.juaracoding.main.model.KPRDataPost;
import com.juaracoding.main.model.KPRRowMapper;

@RestController
@RequestMapping("/")
public class KPRController {
	
	@Autowired
	JdbcTemplate jdbc;

	public List<KPR> getKPR() {

		String sql = "CALL `ulangBulan2`(2021-03-24', 20000000, 1.2, 15);";

		List<KPR> kpr = jdbc.query(sql, new KPRRowMapper());

		return kpr;

	}
	
	@PostMapping("/showkpr")
    public List<KPR> lstKpr(@RequestBody KPRDataPost dataKpr) {
	 
    	 String sql = " CALL `ulangBulan2`('"+dataKpr.getDateFrom()+"', "+dataKpr.getPlatfond()+", "+dataKpr.getBunga()+", "+dataKpr.getLamaPinjam()+");";

		List<KPR> kpr = jdbc.query(sql, new KPRRowMapper());

		return kpr;
		
    }
	
	@GetMapping("/")
    public List<KPR> kpr() {
        return getKPR();
    }
	

	
}
