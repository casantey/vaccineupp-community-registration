package com.casantey.registration.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.casantey.registration.model.Citizen;
import com.casantey.registration.repository.CitizenRepository;




@Service
public class CitizenService {
	
	@Autowired
	private CitizenRepository repository;
	
	
	
	public List<Citizen> getAll() {
		List<Citizen> list = new ArrayList<>();
		repository.findAll().forEach(list::add);
		return list;
	}
	
	public Citizen getByID(String phone) {
		return repository.findById(phone).get();
	}
	
	public Citizen getByPhoneAndPassword(String phone, String password) {
		return repository.findByPhoneAndPassword(phone, password);
	}
	
	public List<Citizen> getByName(String name) {
		return repository.findByName(name);
	}
	
	public List<Citizen> getByNationatlity(String nationality) {
		return repository.findByNationality(nationality);
	}
	
	public List<Citizen> getByRegion(String region) {
		return repository.findByRegion(region);
	}
	
	public long countByNationality(String nationality) {
		return repository.findByNationality(nationality).size();
	}
	
	public long countByRegion(String region) {
		return repository.findByRegion(region).size();
	}
	
	public long countByGender(String gender) {
		return repository.findByGender(gender).size();
	}
	
	public Citizen save (Citizen entity) {
		return repository.save(entity);
	}
	
	public Citizen delete(Citizen entity) {
		try {
		 repository.delete(entity);
		 return entity;
		}catch(Exception e) {
			return null;
		}
	}
	

}
