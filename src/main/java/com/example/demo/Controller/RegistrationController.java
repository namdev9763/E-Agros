package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Registration;
import com.example.demo.ServiceInter.RegistaServiceInter;

@RestController
@RequestMapping("/api/registration/")
@CrossOrigin
public class RegistrationController{
	@Autowired
	RegistaServiceInter registaServiceInter;
	@PostMapping("/register")
	public String register(@RequestBody Registration registration)
	{
		return registaServiceInter.saveRegistration(registration);
	}

}
