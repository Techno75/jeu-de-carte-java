package app;

public class Carte {
    private int valeur;
    private String couleur;
    private static String[] couleurList = new String[] {"trèfle", "coeur", "pique","carreau"};
    private static int[] valeurList = new int[] {2,3,4,5,6,7,8,9,10,11,12,13,1};

    public Carte(int vlr, String clr){
        this.valeur = vlr;
        this.couleur = clr;

    }

    public int getValue() {
        return valeur;
    }

    public String getColor(){
        return couleur;
    }
}
