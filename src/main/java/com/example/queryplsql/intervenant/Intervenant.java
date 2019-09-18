package com.example.queryplsql.intervenant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "intr_tbl_intr")
public class Intervenant {

    @Column(name = "inte_no")
    @Id
    private int id;

    @Column(name = "inte_nom_dnm")
    private String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
