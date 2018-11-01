package app;

import java.util.ArrayList;

public class Jeu {
    private ArrayList <Carte> carteList ;

    public Jeu(ArrayList <Carte> crtList){
        this.carteList = crtList;
    }

    public ArrayList getCarteList(){
        return carteList;
    }
}
