//Boo!!

//package Miniprojekt4;

public class Artikel {
    private String name;
    private double preis;
    private double mwstsatz;

    public Artikel(){
        this.name = "N/A";
        this.preis = 0;
        this.mwstsatz = 0;
    }

    public Artikel(String name, double preis, double mwstsatz){
        this.name = name;
        this.preis = preis;
        this.mwstsatz = mwstsatz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getMwstsatz() {
        return mwstsatz;
    }

    public void setMwstsatz(double mwstsatz) {
        this.mwstsatz = mwstsatz;
    }

    public double berechneMwst() {
        double mwst = this.preis * this.mwstsatz;
        return Math.round(mwst * 100.0) / 100.0;
    }

    @Override
    public String toString(){
        return String.format("%s - %.2f Euro (inkl. %.2f Euro Mwst.)", this.name, this.preis, berechneMwst());
    }
}
