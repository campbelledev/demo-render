package com.example.demo_render.controller;

import com.example.demo_render.model.Etudiant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController = @Controller + @ResponseBody
// Chaque méthode retourne directement du JSON (pas une vue HTML)
@RestController
public class EtudiantController {

//Quand quelqu'un visite /, réponds avec ce message. permet que le lien sur render renvoit un msg
    @GetMapping("/")
    public String accueil() {
        return "API Demo Render opérationnelle 🚀";
    }
    // @GetMapping("/etudiants") écoute les requêtes HTTP GET sur /etudiants
    // List.of(...) crée une liste immutable en Java 9+
    @GetMapping("/etudiants")
    public List<Etudiant> getEtudiants() {
        return List.of(
                new Etudiant(1L, "Alice Nkomo",   "Informatique"),
                new Etudiant(2L, "Bob Tchamda",   "Réseaux"),
                new Etudiant(3L, "Carole Mbida",  "Génie Civil"),
                new Etudiant(4L, "David Essama",  "Informatique")
        );
    }
}