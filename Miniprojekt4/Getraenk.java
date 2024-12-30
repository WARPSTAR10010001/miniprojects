//Boo!!

package Miniprojekt4;

public class Getraenk extends Artikel{
    private double pfand = 0.25;

    public Getraenk(){
        super();
        this.pfand = 0;
    }

    public Getraenk(String name, double preis, double mwstsatz){
        super(name, preis, mwstsatz);
        this.pfand = 0.25;
    }

    private double getPfand(){
        return this.pfand;
    }

    private void setPfand(double pfand){
        this.pfand = pfand;
    }

    @Override
    public String toString(){
        return getName() + " - " + getPreis() +  " Euro (inkl. " + this.pfand + ") (inkl. " + berechneMwst() + " Euro Mwst.)";
    }
}
