package app;

import java.util.ArrayList;

public class Joueur {
    private Jeu jeu;
    private String nom;
    private int score;

    public Joueur(Jeu j, String n, int s){
        this.jeu = j;
        this.nom = n;
        this.score = s;
    }

    public Jeu getJeu() {
        return jeu;
    }
    public String getNom() {
        return nom;
    }
    public int getScore() {
        return score;
    }
}
