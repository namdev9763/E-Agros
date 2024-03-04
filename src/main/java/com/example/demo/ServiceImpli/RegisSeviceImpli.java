package com.example.demo.ServiceImpli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Registration;
import com.example.demo.Repo.RegistrRepo;
import com.example.demo.ServiceInter.RegistaServiceInter;

@Service
public class RegisSeviceImpli  implements RegistaServiceInter 
{
	@Autowired
	RegistrRepo registrRepo;

	@Override
	public void saveRegistration(Registration registration)
	{
		registrRepo.save(registration);
		
	}	
	

}
