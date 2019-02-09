package Bataille;

import java.util.ArrayList;

public class Player {
    private String name;
    private int score;
    private ArrayList<Card> cardList;

    public Player(String n){
        this.name = n;
        this.score = 0;
        this.cardList = new ArrayList<Card>();
    }


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
    public void win(){this.score = this.score + 1;}
    public void addACard(Card card){this.cardList.add(card);}
}
