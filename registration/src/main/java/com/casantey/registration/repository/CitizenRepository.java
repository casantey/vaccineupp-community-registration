package com.casantey.registration.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.casantey.registration.model.Citizen;

@Repository
public interface CitizenRepository extends CrudRepository<Citizen, String> {
	
	Citizen findByPhoneAndPassword(String phone, String password);
	List<Citizen> findByName(String name);
	List<Citizen> findByNationality(String nationality);
	List<Citizen> findByRegion(String region);
	List<Citizen> findByGender(String gender);
	

}
