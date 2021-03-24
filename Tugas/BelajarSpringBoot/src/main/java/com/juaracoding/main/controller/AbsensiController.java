package com.juaracoding.main.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.main.model.Absensi;
import com.juaracoding.main.model.AbsensiRowMapper;
import com.juaracoding.main.model.Biodata;
import com.juaracoding.main.model.BiodataRowMapper;

@RestController
@RequestMapping("/absensi")
public class AbsensiController {
	
	@Autowired
	JdbcTemplate jdbc;
		
	public List<Absensi> getAbsensi() {
		
		String sql = "Select * from Absensi";
		
		List <Absensi> absensi =  jdbc.query(sql,new AbsensiRowMapper());
		
		return absensi;
		
		
	}
	
	public int insertAbsensi(Absensi absensi) {
		return jdbc.update("insert into absensi(nik,nama,startDate,endDate) values ('"+absensi.getNik()+"','"+absensi.getNama()+"','"+absensi.getStartDate()+"','"+absensi.getEndDate()+"')");
		
	}
	
	public int updateAbsensi(String nik, Absensi absensi) {
		return jdbc.update("update absensi set nama='"+absensi.getNama()+"',startDate='"+absensi.getStartDate()+"',startDate='"+absensi.getEndDate()+"' where nik='"+absensi.getNik()+"'");
	}
	
	public int deleteAbsensi(String nik) {
		return jdbc.update("DELETE FROM `absensi` WHERE nik = '"+nik+"'");
		
	}
	
	 @PostMapping("/")
	    public String add(@RequestBody Absensi absensi) {
		 

			if (this.insertAbsensi(absensi) == 1) {
				return "Insert data berhasil";
			} else {
				return "Insert data gagal";
			}
	    }
	 
	 @DeleteMapping("/{nik}")
	    public void delete(@PathVariable String nik) {
		 	deleteAbsensi(nik);
	 }
	 
	 
	 @GetMapping("/")
	    public List<Absensi> list() {
	        return getAbsensi();
	    }
	 
	 @PutMapping("/{nik}")
	    public ResponseEntity<?> update(@RequestBody Absensi absensi, @PathVariable String nik) {
		 try {
	            updateAbsensi(nik, absensi);
	            return new ResponseEntity<>(HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
		 
	 }
}
