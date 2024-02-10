package com.example.financeo;

import java.util.ArrayList;
import java.util.List;

public class Mois {

    private List<Entree> ensEntree;

    public Mois() {
        this.ensEntree = new ArrayList<>();
    }

    public List<Entree> getEnsEntree() {
        return this.ensEntree;
    }

}