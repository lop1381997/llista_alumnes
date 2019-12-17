package com.example.llistaalumnesv1;

public class Alumne {
    String nom;
    String cognoms;
    int id;

    public Alumne(String nom, String cognoms, int id) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
