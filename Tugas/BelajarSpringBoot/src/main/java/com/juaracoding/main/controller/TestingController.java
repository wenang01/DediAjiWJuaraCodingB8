package com.juaracoding.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.main.dao.DaoBiodata;
import com.juaracoding.main.model.Biodata;
import com.juaracoding.main.model.BiodataRowMapper;

@RestController
public class TestingController {
	
	@Autowired
	JdbcTemplate jdbc ;
		
	public List<Biodata> getBiodata() {
		
		String sql = "Select * from Biodata";
		
		List <Biodata> biodata =  jdbc.query(sql,new BiodataRowMapper());
		
		return biodata;
		
		
	}
	
	public int insertBiodata(Biodata biodata) {
		return jdbc.update("insert into biodata(nik,nama,alamat,id_salary) values ("+biodata.getNik()+",'"+biodata.getNama()+"','"+biodata.getAlamat()+"',"+biodata.getId_salary()+")");
		
	}
	
	public int updateBiodata(Biodata biodata) {
		return jdbc.update("update biodata set nama='"+biodata.getNama()+"',alamat='"+biodata.getAlamat()+"',id_salary="+biodata.getId_salary()+" where nik="+biodata.getNik()+"");
	}
	
	public int deleteBiodata(Biodata biodata) {
		return jdbc.update("DELETE FROM `biodata` WHERE nik = "+biodata.getNik()+"");
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String homeIndex() {
		return "<html><body><h1><b>Hello World</b></body></h1></html>";
	}
	
	@RequestMapping("/testing")
	public String testPage() {
		
		//DaoBiodata tblBiodata = new DaoBiodata();
		
		List<Biodata> lstbiodata = getBiodata();
		
		String dummy ="";
		for(int x =0 ; x< lstbiodata.size();x++) {
			
			dummy += lstbiodata.get(x).getNama() +",";
			
		}
		return dummy;
		
	}
	
	@RequestMapping("/insert")
	public String insertBiodata () {
		
		Biodata biodata = new Biodata();
		biodata.setNik(2222222);
		biodata.setNama("Chelsea");
		biodata.setAlamat("Bogor");
		biodata.setId_salary(123);
		
		if(this.insertBiodata(biodata) == 1) {
			return "Insert data berhasil";
		}else {
			return "Insert data gagal";
		}
		
		
	}
	
	@RequestMapping("/update")
	public String updateBiodata () {
		
		Biodata biodata = new Biodata();
		biodata.setNik(2222222);
		biodata.setNama("Peterson");
		biodata.setAlamat("jl. jalan");
		biodata.setId_salary(123);
		
		if(this.updateBiodata(biodata) == 1) {
			return "Update data berhasil";
		}else {
			return "Update data gagal";
		}
		
		
	}
	
	@RequestMapping("/delete")
	public String deleteBiodata () {
		
		Biodata biodata = new Biodata();
		biodata.setNik(2222222);
		biodata.setNama("Peterson");
		biodata.setAlamat("jl. jalan");
		biodata.setId_salary(123);
		
		if(this.deleteBiodata(biodata) == 1) {
			return "Delete data berhasil";
		}else {
			return "Delete data gagal";
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
