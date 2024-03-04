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
	public String saveRegistration(Registration registration)
	{
		try
		{
			Registration exstingEmail=registrRepo.findByEmail(registration.getEmail());
			if(exstingEmail!=null)
			{
				throw new RuntimeException("Email already exists");
			}
			if (!registration.getPassword().equals(registration.getConfirm_password())) 
			{
	            throw new RuntimeException("Passwords do not match");
	        }
			registrRepo.save(registration);
			return "Registration has Successfuly";	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return "Missing Some data";
		}


	}	


}
