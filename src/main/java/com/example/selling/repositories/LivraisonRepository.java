package com.example.selling.repositories;

import com.example.selling.entities.Client;
import com.example.selling.entities.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivraisonRepository extends JpaRepository<Livraison, Long> {
    List<Livraison> findByArticle(String article);
    List<Livraison> findByDestination_Id(Long clientId);
    List<Livraison> findByDestination_RaisonSocial(String raisonSocial);


}
