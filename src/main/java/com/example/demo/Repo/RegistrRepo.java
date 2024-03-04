package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Registration;

public interface RegistrRepo extends JpaRepository<Registration, Long> 
{

}
