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

        // On distribue les cartes

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
            player2.takeACard(cardOfPlayeur2);

            // affiche le resultat

            System.out.print(player1.getName() + " a tiré " + cardOfPlayeur1.getValue() + " de " + cardOfPlayeur1.getColor());
            System.out.print(" et ");
            System.out.print(player2.getName() + " a tiré " + cardOfPlayeur2.getValue() + " de " + cardOfPlayeur2.getColor());

            // Résultat

            if(cardOfPlayeur1.toCompare(cardOfPlayeur2) == "win") {

                player1.addACard(cardOfPlayeur1);
                player1.addACard(cardOfPlayeur2);
                player1.win();
                System.out.print(",\n" + player1.getName() + " a gagné la main !");
            }
            else if(cardOfPlayeur1.toCompare(cardOfPlayeur2) == "loose") {

                player2.addACard(cardOfPlayeur2);
                player2.addACard(cardOfPlayeur1);
                player2.win();
                System.out.print("\n" + player2.getName() + " a gagné la main !");
            }
            else if(cardOfPlayeur1.toCompare(cardOfPlayeur2) == "eguale"){
                System.out.print("\nil y a égalité.\n");
                if(player1.getCard().size() >= 2 && player2.getCard().size() >= 2) {

                    Card card1 = player1.getCard().get(0);
                    Card card2 = player1.getCard().get(1);
                    player1.takeACard(card1);
                    player1.takeACard(card2);
                    Card card3 = player2.getCard().get(0);
                    Card card4 = player2.getCard().get(1);
                    player2.takeACard(card3);
                    player2.takeACard(card4);

                    if(card2.toCompare(card4) == "win") {
                        System.out.println(player1.getName() + " a tiré " + card2.getValue() + " de " + card2.getColor() + " et " + player2.getName() + " a tiré " + card4.getValue() + " de " + card4.getColor());
                        System.out.print(player1.getName() + " a gagné la main !");
                        player1.addACard(cardOfPlayeur1);
                        player1.addACard(cardOfPlayeur2);
                        player1.addACard(card1);
                        player1.addACard(card2);
                        player1.addACard(card3);
                        player1.addACard(card4);
                        player1.win();
                    }

                    else if(card2.toCompare(card4) == "loose") {
                        System.out.println(player1.getName() + " a tiré " + card2.getValue() + " de " + card2.getColor() + " et " + player2.getName() + " a tiré " + card4.getValue() + " de " + card4.getColor());
                        System.out.print(player2.getName() + " a gagné la main !");
                        player2.addACard(cardOfPlayeur1);
                        player2.addACard(cardOfPlayeur2);
                        player2.addACard(card1);
                        player2.addACard(card2);
                        player2.addACard(card3);
                        player2.addACard(card4);
                        player2.win();
                    }
                    else if (card2.toCompare(card4) == "eguale"){
                        System.out.println(player1.getName() + " a tiré " + card2.getValue() + " de " + card2.getColor() + " et " + player2.getName() + " a tiré " + card4.getValue() + " de " + card4.getColor());
                        System.out.print("Il y a à nouveau égalité ! Personne n'a gagné.");
                    }
                }
                else {

                    if(player1.getCard().size() < 2) {
                        player2.win();
                        System.out.print(player1.getName() + " n'a plus de cartes. " + player2.getName() + " a gagné ! ");
                    }
                    else if(player2.getCard().size() < 2) {
                        player1.win();
                        System.out.print(player2.getName() + " n'a plus de cartes. " + player1.getName() + " a gagné ! ");
                    }
                }
            }

            // Récapitulatif de la main

            System.out.print("\n\nLe score :\n");
            System.out.print(player1.getName() + " à " + player1.getScore() + " points  et " + player2.getName() + " à " + player2.getScore() + " points.");
            System.out.print("\n________________________________________________________\n\n");
        }

        // Affiche le gagnant

        if (player1.getCard().size() == 0){
            System.out.print(player2.getName() + " à gagné la partie !!!\n");
        }

        if (player2.getCard().size() == 0){
            System.out.print(player1.getName() + " à gagné la partie !!!\n");
        }
    }
}
