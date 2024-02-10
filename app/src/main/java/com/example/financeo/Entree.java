package com.example.financeo;

public class Entree {
    private String date;
    private int montant;
    private boolean type;
    private String lieu;
    private String commentaire;
    public Entree(boolean type, int montant, String date,  String lieu, String commentaire)
    {
        this.date=date;
        this.montant=montant;
        this.type=type;
        this.lieu=lieu;
        this.commentaire=commentaire;
    }

    public String getDate() {
        return date;
    }

    public int getMontant() {
        return montant;
    }

    public boolean isType() {
        return type;
    }

    public String getLieu() {
        return lieu;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        return "Entree{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                ", type=" + type +
                ", lieu='" + lieu + '\'' +
                ", commentaire='" + commentaire + '\'' +
                '}';
    }
}
