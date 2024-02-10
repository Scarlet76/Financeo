package com.example.financeo;

import java.util.ArrayList;
import java.util.List;

public class Annee {

	private int date;
    private static final int NB_MOIS =12;
    private ArrayList<Mois> ensMois;
    private Mois moisSelectionne;

    public Annee( int date ) {
		this.date = date;
        this.ensMois = new ArrayList<Mois>();
    }

    public void setMoisSelectionne(Mois m) {
        this.moisSelectionne=m;
    }

    public void addMois(Mois m) {
        if(this.ensMois.size()<NB_MOIS)
            this.ensMois.add(m);
    }

    public List<Mois> getEnsMois() {
        return this.ensMois;
    }

    public int getDate() {
        return this.date;
    }
}
