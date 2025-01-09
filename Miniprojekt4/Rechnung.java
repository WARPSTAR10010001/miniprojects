//Boo!!

package Miniprojekt4;

public class Rechnung {
    private Artikel[] artikel;

    public Rechnung(){
        this.artikel = new Artikel[Integer.MAX_VALUE];
    }

    public Artikel[] getArtikel(){
        return this.artikel;
    }

    public void setArtikel(Artikel[] artikel){
        this.artikel = artikel;
    }

    public void neuerArtikel(Artikel artikel){
        
    }

    public double getBetrag(){
        double betrag = 0;
        for(int i = 0; i < artikel.length; i++){
            betrag += artikel[i].getPreis();
        }

        return betrag;
    }
}
