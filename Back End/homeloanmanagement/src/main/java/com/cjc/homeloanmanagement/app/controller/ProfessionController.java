package com.cjc.homeloanmanagement.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeloanmanagement.app.model.Profession;
import com.cjc.homeloanmanagement.app.serviceI.ProfessionServiceI;

@CrossOrigin("*")
@RestController

public class ProfessionController {
	  @Autowired
		ProfessionServiceI psi;
		
		
		@PostMapping(value = "/profession")
		public Profession saveProfession(@RequestBody Profession profession) {
		Profession p = psi.saveProfession(profession);
		return p;
		}
		
		@GetMapping(value = "/professions")
		public List<Profession> getProfessions() {
			List<Profession> professions = psi.getProfessions();
			return professions;
		}

		
		
		@PutMapping(value = "/profession/{professionId}")
		public Profession updateProfession(@PathVariable Integer professionId,@RequestBody Profession p) {
			Profession professions=psi.updateProfession(professionId,p);
			return professions;
		}
		
		
		@DeleteMapping(value = "/profession/{professionId}")
		public void deleteProfession(@PathVariable Integer professionId) {
			psi.deleteProfession(professionId);
			
		}
		
		

		
}
