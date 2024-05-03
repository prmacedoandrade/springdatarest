package com.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datarest.model.Client;

public interface ClientRepository extends JpaRepository<Client,Integer>{
    
}
