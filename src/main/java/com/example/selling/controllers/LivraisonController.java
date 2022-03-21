package com.example.selling.controllers;
import com.example.selling.entities.Livraison;
import com.example.selling.repositories.ClientRepository;
import com.example.selling.repositories.LivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class LivraisonController {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private LivraisonRepository livraisonRepository;

    @GetMapping(value = "/livraison")
    public List<Livraison> getAllLivraisons() {

        List<Livraison> livraisons = livraisonRepository.findAll();
        return livraisons;
    }
    @GetMapping(value = "/livraison/{raisonSociale}")
    public List<Livraison> getAllLivraisonsByClient(@PathVariable String raisonSociale) {

        List<Livraison> livraisons = livraisonRepository.findByDestination_RaisonSocial(raisonSociale);
        return livraisons;
    }
}
