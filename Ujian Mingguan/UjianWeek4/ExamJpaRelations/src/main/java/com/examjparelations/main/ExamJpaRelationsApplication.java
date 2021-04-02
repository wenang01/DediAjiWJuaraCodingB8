package com.examjparelations.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examjparelations.main.entity.Admin;
import com.examjparelations.main.entity.Dosen;
import com.examjparelations.main.entity.Mahasiswa;
import com.examjparelations.main.entity.MataKuliah;
import com.examjparelations.main.entity.Nilai;
import com.examjparelations.main.entity.Pertanyaan;
import com.examjparelations.main.entity.PlotMataKuliah;
import com.examjparelations.main.entity.Soal;
import com.examjparelations.main.repositories.AdminRepository;
import com.examjparelations.main.repositories.DosenRepository;
import com.examjparelations.main.repositories.MahasiswaRepository;
import com.examjparelations.main.repositories.MataKuliahRepository;
import com.examjparelations.main.repositories.NilaiRepository;
import com.examjparelations.main.repositories.PertanyaanRepository;
import com.examjparelations.main.repositories.PlotMataKuliahRepository;
import com.examjparelations.main.repositories.SoalRepository;

@SpringBootApplication
public class ExamJpaRelationsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ExamJpaRelationsApplication.class, args);
	}

	@Autowired
	MahasiswaRepository mahasiswaRepository;
	
	@Autowired
	DosenRepository dosenRepository;
	
	@Autowired
	MataKuliahRepository mataKuliahRepository;
	
	@Autowired
	PlotMataKuliahRepository plotMataKuliahRepository;
	
	@Autowired
	SoalRepository soalRepository;
	
	@Autowired
	PertanyaanRepository pertanyaanRepository;
	
	@Autowired
	NilaiRepository nilaiRepository;
	
	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public void run(String... args) throws Exception {

				
		//==MataKuliah==//
		MataKuliah matkul1 = new MataKuliah();
		matkul1.setId(234);
		matkul1.setNamaMataKuliah("Data Minning");
	
		MataKuliah matkul2 = new MataKuliah();
		matkul2.setId(334);
		matkul2.setNamaMataKuliah("Algoritma");
		
		List<MataKuliah> lstMataKuliah = new ArrayList<MataKuliah>();
		lstMataKuliah.add(matkul1);
		lstMataKuliah.add(matkul2);

		this.mataKuliahRepository.saveAll(lstMataKuliah);

		//==Mahasiswa==//
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setId(12345);
		mahasiswa.setNamaMahasiswa("Dedi Aji Wenang");
		mahasiswa.setJenisKelamin("Laki-Laki");
		mahasiswa.setPassword("1234567");
		
		Mahasiswa mahasiswa2 = new Mahasiswa();
		mahasiswa2.setId(334455);
		mahasiswa2.setNamaMahasiswa("Imam Ajie");
		mahasiswa2.setJenisKelamin("Laki-Laki");
		mahasiswa2.setPassword("123123");
		
		List<Mahasiswa> lstMahasiswa = new ArrayList<Mahasiswa>();
		lstMahasiswa.add(mahasiswa);
		lstMahasiswa.add(mahasiswa2);

		this.mahasiswaRepository.saveAll(lstMahasiswa);
		
		//==Dosen==//
		Dosen dosen = new Dosen();
		dosen.setId(56789);
		dosen.setNamaDosen("Pak De");
		dosen.setUsername("pakdemin");
		dosen.setPassword("333333333");
		
		Dosen dosen2 = new Dosen();
		dosen2.setId(33542);
		dosen2.setNamaDosen("Pak Le");
		dosen2.setUsername("pakdele");
		dosen2.setPassword("123123123");
		
		List<Dosen> lstDosen = new ArrayList<Dosen>();
		lstDosen.add(dosen);
		lstDosen.add(dosen2);

		this.dosenRepository.saveAll(lstDosen);
		
		//==PlotMataKuliah==//
		PlotMataKuliah plotMataKuliah = new PlotMataKuliah();
		plotMataKuliah.setMatkul_id(matkul1.getId());
		plotMataKuliah.setMatkul_id(matkul2.getId());
		
		plotMataKuliah.setNim(mahasiswa.getId());
		plotMataKuliah.setNim(mahasiswa2.getId());
		
		plotMataKuliah.setDosen_id(dosen.getId());
		plotMataKuliah.setDosen_id(dosen2.getId());
		
		List<PlotMataKuliah> lstPlotsMataKuliah = new ArrayList<PlotMataKuliah>();
		lstPlotsMataKuliah.add(plotMataKuliah);
		
		matkul1.setLstPlotMataKuliah(lstPlotsMataKuliah);
		matkul2.setLstPlotMataKuliah(lstPlotsMataKuliah);
		
		mahasiswa.setLstPlotMataKuliah(lstPlotsMataKuliah);
		mahasiswa2.setLstPlotMataKuliah(lstPlotsMataKuliah);
		
		dosen.setLstPlotMataKuliah(lstPlotsMataKuliah);
		dosen2.setLstPlotMataKuliah(lstPlotsMataKuliah);
		
		this.plotMataKuliahRepository.saveAll(lstPlotsMataKuliah);
		

		//==Soal==//
		Soal soal = new Soal();
		soal.setNama_soal("Matematika");
		soal.setStatus("Tugas Harian");

		List<Soal> lstSoal = new ArrayList<Soal>();
		lstSoal.add(soal);		
		soal.setPlot_id(plotMataKuliah.getId());
		
		this.soalRepository.saveAll(lstSoal);
		
		
		//==Pertanyaan==//
		Pertanyaan pertanyaan = new Pertanyaan();
		pertanyaan.setSoal_id(soal.getId());
		pertanyaan.setPertanyaan("Siapakah siapakah ?");
		pertanyaan.setJawaban("aaa");
		pertanyaan.setJawaban2("bbb");
		pertanyaan.setJawaban3("ccc");
		pertanyaan.setJawaban4("ddd");
		pertanyaan.setJawaban_benar("Betuuulll..!!!");
		pertanyaan.setStatus_gambar("bloob text");

		List<Pertanyaan> lstPertanyaan = new ArrayList<Pertanyaan>();
		lstPertanyaan.add(pertanyaan);

		this.pertanyaanRepository.saveAll(lstPertanyaan);
		
		
		//==Nilai==//
		Nilai nilai = new Nilai();
		nilai.setSoal_id(pertanyaan.getSoal_id());
		nilai.setNilai(100);
//		nilai.setLstPertanyaan(lstPertanyaan);
		
		List<Nilai> lstNilai= new ArrayList<Nilai>();
		lstNilai.add(nilai);
		
		this.nilaiRepository.saveAll(lstNilai);
		
		
		Admin admin = new Admin();
		admin.setUsername("username");
		admin.setPassword("password");
		
		List<Admin> lstAdmin = new ArrayList<Admin>();
		lstAdmin.add(admin);
		
		this.adminRepository.saveAll(lstAdmin);
		
		
	}

}
