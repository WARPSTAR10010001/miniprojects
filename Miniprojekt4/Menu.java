//Boo!!

//package Miniprojekt4;

public class Menu extends Artikel{
    private boolean vegetarisch;
    private int kalorien;
    private Getraenk getraenk;
    private String beschreibung;

    public Menu(){
        super();
        this.vegetarisch = false;
        this.kalorien = 0;
        this.getraenk = null;
        this.beschreibung = null;
    }

    public Menu(String name, double preis, double mwstsatz, boolean vegetarisch, int kalorien, Getraenk getraenk, String beschreibung){
        super(name, preis, mwstsatz);
        this.vegetarisch = vegetarisch;
        this.kalorien = kalorien;
        this.getraenk = getraenk;
        this.beschreibung = beschreibung;
    }

    public boolean getVegetarisch(){
        return this.vegetarisch;
    }

    public void setVegetarisch(boolean vegetarisch){
        this.vegetarisch = vegetarisch;
    }

    public int getKalorien(){
        return this.kalorien;
    }

    public void setKalorien(int kalorien){
        this.kalorien = kalorien;
    }

    public Getraenk getGetraenk(){
        return this.getraenk;
    }

    public void setGetraenk(Getraenk getraenk){
        this.getraenk = getraenk;
    }

    public String getBeschreibung(){
        return this.beschreibung;
    }

    public void setBeschreibung(String beschreibung){
        this.beschreibung = beschreibung;
    }

    public String getEmpfehlung(){
        if(this.kalorien > 750){
            return "rot";
        } else if (this.kalorien > 500 && this.kalorien <= 750){
            return "gelb";
        } else {
            return "gruen";
        }
    }

    @Override
    public String toString(){
        if(this.vegetarisch){
            return getName() + " - " + this.beschreibung + " (vegetarisch) (" + getPreis() + " Euro)";
        } else {
            return getName() + " - " + this.beschreibung + " (" + getPreis() + " Euro)";
        }
    }
}   
