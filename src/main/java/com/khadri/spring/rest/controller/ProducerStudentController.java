package com.khadri.spring.rest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerStudentController {

	private static HashMap<Integer, String> hashMap = new HashMap<>();

	@PostMapping("/register/add")
	public String registerStudent(Integer id, String name) {

		hashMap.put(id, name);

		return id + " Student Added";
	}

	@GetMapping(value = "/register/view")
	public HashMap<Integer, String> readAllRegisteredStudents() {
       System.out.println("Invoked readAllRegisteredStudents()");
		return hashMap;
	}

	@PutMapping("/register/update")
	public HashMap<Integer, String> registerUpdateStudent(Integer id, String name) {

		if (hashMap.containsKey(id)) {
			hashMap.put(id, name);
		} else {
			hashMap.put(id, name);
		}

		return hashMap;
	}

	@DeleteMapping("/register/delete")
	public HashMap<Integer, String> registerDeleteStudent(Integer id) {

		hashMap.remove(id);

		return hashMap;
	}

}
