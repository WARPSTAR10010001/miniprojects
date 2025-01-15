//Boo!!

//package Miniprojekt4;

public class Getraenk extends Artikel {
    private double pfand;

    public Getraenk(){
        super();
        this.pfand = 0;
    }

    public Getraenk(String name, double preis, double mwstsatz, double pfand){
        super(name, preis, mwstsatz);
        this.pfand = pfand;
    }

    public double getPfand() {
        return pfand;
    }

    public void setPfand(double pfand) {
        this.pfand = pfand;
    }

    @Override
    public String toString(){
        return String.format("%s - %.2f Euro (inkl. %.2f Euro Pfand) (inkl. %.2f Euro Mwst.)", getName(), getPreis(), this.pfand, berechneMwst());
    }
}
