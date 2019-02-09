package Bataille;
import java.util.ArrayList;
import java.util.Collections;

public class Bataille {
    public static void main (String args[]){
        //Création des joueurs
        Player player1 = new Player("Jean");
        Player player2 = new Player("Paul");

        //Création du jeu de carte
        ArrayList<Card> cardGame = new ArrayList<Card>();
        for(int i = 0 ; i < Card.colorList.length ; i++) {
            for(int j = 0 ; j < Card.valueList.length; j++) {
                Card card = new Card(Card.valueList[j], Card.colorList[i]);
                cardGame.add(card);
            }
        }

        // On mélange les cart
        Collections.shuffle(cardGame);

        // On distribue les carte
        for(int i = 0 ; i < cardGame.size(); i = i + 2) {
            player1.addACard(cardGame.get(i));
            player2.addACard(cardGame.get(i+1));
        }

        // on tire des cartes
        while(player1.getCard().size() != 0 && player2.getCard().size() != 0) {

            // Le premier joueur Tire une carte
            Card cardOfPlayeur1 = player1.getCard().get(0);
            player1.takeACard(cardOfPlayeur1);
            // Le second joueur Tire une carte
            Card cardOfPlayeur2 = player2.getCard().get(0);
            player1.takeACard(cardOfPlayeur1);

            // Résultat

            if(cardOfPlayeur1.toCompare(cardOfPlayeur2) == "win") {
                System.out.println(cardOfPlayeur1.getCardInformation() + " contre " + cardOfPlayeur2.getCardInformation());
                player1.addACard(cardOfPlayeur1);
                player1.addACard(cardOfPlayeur2);
                player1.win();
                System.out.println(player1.getName() + " gagné ! Score : " + player1.getScore());
                System.out.println(player2.getName() + " perdu ! Score : " + player2.getScore());
            }
            else if(cardOfPlayeur1.toCompare(cardOfPlayeur2) == "loose") {
                System.out.println(cardOfPlayeur1.toString() + " contre " + cardOfPlayeur2.toString());
                player2.addACard(cardOfPlayeur2);
                player2.addACard(cardOfPlayeur1);
                player2.win();
                System.out.println(player1.getName() + " perdu ! Score : " + player1.getScore());
                System.out.println(player2.getName() + " gagné ! Score : " + player2.getScore());
            }
        }
    }
}
