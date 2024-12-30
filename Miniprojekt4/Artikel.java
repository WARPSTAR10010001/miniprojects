//Boo!!

package Miniprojekt4;

public class Artikel {
    private String name;
    private double preis;
    private double mwstsatz;

    public Artikel(){
        this.name = null;
        this.preis = 0;
        this.mwstsatz = 0;
    }

    public Artikel(String name, double preis, double mwstsatz){
        this.name = name;
        this.preis = preis;
        this.mwstsatz = mwstsatz;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPreis(){
        return this.preis;
    }

    public void setPreis(double preis){
        this.preis = preis;
    }

    public double getMwstsatz(){
        return this.mwstsatz;
    }

    public void setMwstsatz(double mwstsatz){
        this.mwstsatz = mwstsatz;
    }

    public double berechneMwst() {
        double mwst = this.preis * (this.mwstsatz / 100);
        return Math.round(mwst * 100.0) / 100.0;
    }

    @Override
    public String toString(){
        return this.name + " - " + this.preis + " Euro (inkl. " + berechneMwst() + " Euro Mwst.)";
    }
}
