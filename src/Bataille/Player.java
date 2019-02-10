package Bataille;

import java.util.ArrayList;

public class Player {

    // Les propriétés

    private String name;
    private int score;
    private ArrayList<Card> cardList;

    // Le constructeur

    public Player(String n){
        this.name = n;
        this.score = 0;
        this.cardList = new ArrayList<Card>();
    }

    // Les méthodes

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public ArrayList<Card> getCard() {
        return this.cardList;
    }

    public void  takeACard(Card card){this.cardList.remove(card);}

    public void win(){this.score++;}

    public void addACard(Card card){this.cardList.add(card);}
}
