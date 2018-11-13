package app;

import java.util.ArrayList;

public class Joueur {
    private String nom;
    private int score;

    public Joueur(String n, int s){
        this.nom = n;
        this.score = s;
    }


    public String getNom() {
        return nom;
    }
    public int getScore() {
        return score;
    }
}
