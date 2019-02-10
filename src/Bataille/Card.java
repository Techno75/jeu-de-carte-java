package Bataille;

public class Card {

    // Les propriétés

    private int value;
    private String color;
    public static String[] colorList = new String[] {"trèfle", "coeur", "pique","carreau"};
    public static int[] valueList = new int[] {2,3,4,5,6,7,8,9,10,11,12,13,14};

    // Le constructeur

    public Card(int vlr, String clr){
        this.value = vlr;
        this.color = clr;
    }

    // Les méthodes

    public int getValue() {
        return value;
    }

    public String getColor(){
        return color;
    }

    public String toCompare(Card cardToCompare) {
        if(this.value > cardToCompare.getValue()){
            return "win";
        }
        else if(this.value == cardToCompare.getValue()){
            return "eguale";
        }
        else if(this.value < cardToCompare.getValue()) {
            return "loose";
        }
        else{
            return "false";
        }
    }
}
