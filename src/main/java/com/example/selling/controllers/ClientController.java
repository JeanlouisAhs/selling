package com.example.selling.controllers;

import com.example.selling.entities.Client;
import com.example.selling.repositories.ClientRepository;
import com.example.selling.repositories.LivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/")

public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private LivraisonRepository livraisonRepository;

    @PostMapping(value = "/client/create")
    public ResponseEntity<?> createClient(@RequestBody Client client) {
        Client toSave = clientRepository.save(client);
        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("client/{id}")
                .buildAndExpand(toSave.getId()).toUri();
        return ResponseEntity.created(location).body("Client ajouté avec succès");

    }

    @GetMapping(value = "/client")
    public List<Client> afficherTousLesClient() {
        List<Client> clients = clientRepository.findAll();
        return clients;
    }

    @GetMapping(value = "/client/{raisonSociale}")
    public List<Client>  afficherParRaisonSociale(@PathVariable String raisonSociale) {

        List<Client> clients = clientRepository.findByRaisonSocial(raisonSociale);
        return clients;
    }
}
