package com.juaracoding.main.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.main.model.Bonus;
import com.juaracoding.main.model.BonusRowMapper;
import com.juaracoding.main.model.Title;
import com.juaracoding.main.model.TitleRowMapper;
import com.juaracoding.main.model.Worker;
import com.juaracoding.main.model.WorkerRowMapper;

@RestController
@RequestMapping("/")
public class WorkersController {
	
	@Autowired
	JdbcTemplate jdbc;
	
	//[Start Soal No. 1]============================================================
	
	//Table Title
	public List<Title> getTitle(){
		
		String sql = "Select * from title";
		List <Title> title =  jdbc.query(sql,new TitleRowMapper());
		return title;

	}
	
	@GetMapping("/title")
    public List<Title> listTitle() {
        return getTitle();
    }
	
	public int insertWorkerTitle(Title title) {
		return jdbc.update("insert into title(WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM) values ("+title.getWORKER_REF_ID()+",'"+title.getWORKER_TITLE()+"','"+title.getAFFECTED_FROM()+"')");
		
	}
	
	public int updateWorkerTitle(String WORKER_REF_ID, Title title) {
		return jdbc.update("update `title` set WORKER_TITLE='"+title.getWORKER_TITLE()+"',AFFECTED_FROM='"+title.getAFFECTED_FROM()+"' where WORKER_REF_ID="+title.getWORKER_REF_ID());
	}
	
	public int deleteWorkerTitle(String WORKER_REF_ID) {
		return jdbc.update("DELETE FROM `title` WHERE WORKER_REF_ID ='"+WORKER_REF_ID+"'");
		
	}
	
	@PostMapping("/title")
    public String addTitle(@RequestBody Title title) {
	 
		if (this.insertWorkerTitle(title) == 1) {
			return "Insert data berhasil";
		} else {
			return "Insert data gagal";
		}
    }
	
	@PutMapping("/title/{WORKER_REF_ID}")
    public ResponseEntity<?> updateTitle(@RequestBody Title title, @PathVariable String WORKER_REF_ID) {
	 try {
            updateWorkerTitle(WORKER_REF_ID, title);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	 
	}
	
	@DeleteMapping("/title/{WORKER_REF_ID}")
    public void deleteTitle(@PathVariable String WORKER_REF_ID) {
	 	deleteWorkerTitle(WORKER_REF_ID);
	}
	
	//Table Bonus
		public List<Bonus> getBonus(){
			
			String sql = "Select * from bonus";
			List <Bonus> bonus =  jdbc.query(sql,new BonusRowMapper());
			return bonus;

		}
		
		@GetMapping("/bonus")
	    public List<Bonus> listBonus() {
	        return getBonus();
	    }
		
		public int insertWorkerBonus(Bonus bonus) {
			return jdbc.update("insert into bonus(WORKER_REF_ID, BONUS_DATE, BONUS_AMOUNT) values ("+bonus.getWORKER_REF_ID()+",'"+bonus.getBONUS_DATE()+"','"+bonus.getBONUS_AMOUNT()+"')");
			
		}
		
		public int updateWorkerBonus(String WORKER_REF_ID, Bonus bonus) {
			return jdbc.update("update `bonus` set BONUS_DATE='"+bonus.getBONUS_DATE()+"',AFFECTED_FROM='"+bonus.getBONUS_AMOUNT()+"' where WORKER_REF_ID="+bonus.getWORKER_REF_ID());
		}
		
		public int deleteWorkerBonus(String WORKER_REF_ID) {
			return jdbc.update("DELETE FROM `bonus` WHERE WORKER_REF_ID ='"+WORKER_REF_ID+"'");
			
		}
		
		@PostMapping("/bonus")
	    public String addBonus(@RequestBody Bonus bonus) {
		 
			if (this.insertWorkerBonus(bonus) == 1) {
				return "Insert data berhasil";
			} else {
				return "Insert data gagal";
			}
	    }
		
		@PutMapping("/bonus/{WORKER_REF_ID}")
	    public ResponseEntity<?> updateBonus(@RequestBody Bonus bonus, @PathVariable String WORKER_REF_ID) {
		 try {
	            updateWorkerBonus(WORKER_REF_ID, bonus);
	            return new ResponseEntity<>(HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
		 
		}
		
		@DeleteMapping("/bonus/{WORKER_REF_ID}")
	    public void deleteBonus(@PathVariable String WORKER_REF_ID) {
		 	deleteWorkerTitle(WORKER_REF_ID);
	 }
	
	//[End Soal No. 1]==============================================================
	
	
	//[Start Soal No. 2]============================================================
	public List<Worker> getWorkerLimitBySalary() {
		
		//SELECT * FROM `worker` ORDER BY SALARY DESC LIMIT 5
		String sql = "SELECT * FROM `worker` ORDER BY SALARY DESC LIMIT 5";		
		List <Worker> worker =  jdbc.query(sql,new WorkerRowMapper());
		return worker;

	}
	
	@GetMapping("/worker/limitbysalary")
    public List<Worker> listLimitBySalary() {
        return getWorkerLimitBySalary();
    }
	//[End Soal No. 2]============================================================
	
	//[Start Soal No. 3]============================================================
	public List<Worker> getWorkerBySalary() {

		//SELECT Count(*) AS DistinctCountries FROM (SELECT DISTINCT Country FROM Customers);
		String sql = "SELECT * FROM `worker` WHERE SALARY = '500000'";		
		List <Worker> worker =  jdbc.query(sql,new WorkerRowMapper());
		return worker;

	}
	
	@GetMapping("/worker/bysalary")
    public List<Worker> listByDistinct() {
        return getWorkerBySalary();
    }
	//[End Soal No. 3]============================================================
	
	
	//[Start Soal No. 4]============================================================
		public List<Worker> getCountDepartment() {

			//"SELECT DEPARTMENT, COUNT(*) AS COUNT_BY FROM `worker` GROUP BY DEPARTMENT"
			String sql = "SELECT *, COUNT(*) AS PEOPLE_IN_DEPT FROM `worker` GROUP BY DEPARTMENT";		
			List<Worker> worker = jdbc.query(sql,new WorkerRowMapper());
			
			return worker;
		}
		
		@GetMapping("/worker/countbydepartment")
	    public List<Worker> listByDepartment() {
	        return getCountDepartment();
	    }
		//[End Soal No. 4]============================================================
}
