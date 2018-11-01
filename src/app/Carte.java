package app;

public class Carte {
    private int valeur;
    private String couleur;
    private String forme;

    public Carte(int vlr, String clr, String frm){
        this.valeur = vlr;
        this.couleur = clr;
        this.forme = frm;
    }

    public int getValue() {
        return valeur;
    }

    public String getColor(){
        return couleur;
    }

    public String getShape(){
        return forme;
    }
}
