//Boo!!

package Miniprojekt4;

public class Getraenk extends Artikel{
    private double pfand;

    public Getraenk(){
        super();
        this.pfand = 0;
    }

    public Getraenk(String name, double preis, double mwstsatz, double pfand){
        super(name, preis, mwstsatz);
        this.pfand = pfand;
    }

    public double getPfand(){
        return this.pfand;
    }

    private void setPfand(double pfand){
        this.pfand = pfand;
    }

    @Override
    
}
