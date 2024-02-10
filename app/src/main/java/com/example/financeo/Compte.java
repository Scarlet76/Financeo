package com.example.financeo;

import java.util.ArrayList;
import java.util.List;

public class Compte {
    private List<Annee> ensAnnee ;

    public Compte() {
        this.ensAnnee = new ArrayList<>();
    }

    public Annee getAnnee( int date ) {
        for( Annee annee : this.ensAnnee ){
            if( annee.getDate() == date ){
                return annee;
            }
        }
        return null;
    }

    public void addAnnee(Annee a) {
        this.ensAnnee.add(a);
    }

    public void deleteAnnee(Annee a) {
        if(this.ensAnnee.contains(a))
            this.ensAnnee.remove(a);
    }
}