package com.casantey.registration.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casantey.registration.model.Citizen;
import com.casantey.registration.service.CitizenService;

@RestController
@RequestMapping("/registration-api")
public class CitizenController {

	@Autowired
	private CitizenService service;

	// Fetches all
	@GetMapping("/citizens")
	public List<Citizen> getAll() {
		return service.getAll();
	}

	// Fetches by id
	@GetMapping("/citizen/phone/{phone}")
	public Citizen getById(@PathVariable String phone) {
		return service.getByID(phone);
	}

	// Authenticate citizen
	@PostMapping("/citizen/authenticate")
	public Citizen authenticateCitizen(@RequestBody Citizen entity) {
		Citizen citizen = new Citizen();
		citizen = service.getByPhoneAndPassword(entity.getPhone(), entity.getPassword());
		if (citizen==null) {
			Citizen c = new Citizen();
			c.setPhone("0000");
			return c;
		}
		return citizen;
	}

	// Create citizen
	@PostMapping("/citizen/create")
	public Citizen createCitizen(@RequestBody Citizen entity) {
		entity.setCreate_time(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		return service.save(entity);
	}

	// Create citizen list
	@PostMapping("/citizen/createList")
	public List<Citizen> createCitizenList(@RequestBody List<Citizen> entity) {
		List<Citizen> citizen = new ArrayList<>();

		if (entity != null) {
			for (Citizen c : entity) {
				c.setCreate_time(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
				citizen.add(service.save(c));

			}
		}

		return citizen;
	}

	// Edit citizen
	@PutMapping("/citizen/edit")
	public Citizen editCitizen(@RequestBody Citizen entity) {
		return service.save(entity);
	}

	// Delete citizen
	@DeleteMapping("/citizen/delete")
	public Citizen deleteCitizen(@RequestBody Citizen entity) {
		return service.delete(entity);
	}

}
