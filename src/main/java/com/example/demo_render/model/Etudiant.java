package com.example.demo_render.model;



// Classe modèle simple — PAS de @Entity, PAS de JPA
public class Etudiant {

    private Long   id;
    private String nom;
    private String filiere;

    // Constructeur avec paramètres — utilisé pour créer nos données
    public Etudiant(Long id, String nom, String filiere) {
        this.id      = id;
        this.nom     = nom;
        this.filiere = filiere;
    }

    // Getters — requis par Jackson pour sérialiser en JSON
    public Long   getId()      { return id; }
    public String getNom()     { return nom; }
    public String getFiliere() { return filiere; }
}
