//Boo!!

//package Miniprojekt4;

import java.util.Arrays;

public class Rechnung {
    private Artikel[] artikel;

    public Rechnung(){
        this.artikel = new Artikel[100];
        Artikel zero = new Artikel();
        Arrays.fill(artikel, zero);

        
    }

    public Artikel[] getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel[] artikel) {
        this.artikel = artikel;
    }

    public void neuerArtikel(Artikel artikel){
        int index = 0;
        while(!(this.artikel[index].getName().equals("N/A"))){
            index++;
        }

        this.artikel[index ] = artikel;
    }

    public double getBetrag(){
        double betrag = 0;

        for(int i = 0; i < this.artikel.length; i++){
            if(!(this.artikel[i].getName().equals("N/A"))){
                betrag += this.artikel[i].getPreis();
            }
        }

        return betrag;
    }
}
