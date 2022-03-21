package com.example.selling.repositories;

import com.example.selling.entities.Client;
import com.example.selling.entities.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findByIfu(String ifu);
    List<Client>findByAdresse(String adresse);
    List<Client>findByRaisonSocial(String raisonSociale);
}
