package com.example.selling.controllers;


import com.example.selling.entities.Client;
import com.example.selling.entities.Livraison;
import com.example.selling.repositories.ClientRepository;
import com.example.selling.repositories.LivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FrontController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private LivraisonRepository livraisonRepository;

    @GetMapping(value = "/client/new")
    public String clientForm (Model model) {

//        model.addAttribute("client", schoolRepo.findAll());
        model.addAttribute("client", new Client());
        return "createClient";
    }

    @PostMapping(value = "/client/save")
    public String saveStudiant(@ModelAttribute("client") Client client) {
        clientRepository.save(client);
        return "redirect:/client";
    }

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public String listClient(Model model) {

        List<Client> clients = clientRepository.findAll();
        model.addAttribute("clients", clients);
        return "clients";
    }

//    @RequestMapping(value = "/client/{raisonSociale}", method = RequestMethod.GET)
//    public String listClientParRaisonSociale(@PathVariable String raisonSociale , Model model) {
//
//        List<Client> clients = clientRepository.findByRaisonSocial(raisonSociale);
//        model.addAttribute("clients", clients);
//        return "clients";
//    }

    @RequestMapping(value = "/livraison", method = RequestMethod.GET)
    public String listLivraison(Model model) {

        List<Livraison> livraisons = livraisonRepository.findAll();
        model.addAttribute("livraisons", livraisons);
        return "livraisons";
    }
    @RequestMapping(value = "/livraison/{raisonSociale}", method = RequestMethod.GET)
    public String getAllLivraisonsByClient(@PathVariable String raisonSociale , Model model) {

        List<Livraison> livraisons = livraisonRepository.findByDestination_RaisonSocial(raisonSociale);
        model.addAttribute("livraisons", livraisons);
        return "livraisons";
    }
}
