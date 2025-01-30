//Boo!!

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Mensch p = new Mensch("Philip Amthor", "Blau", 32);
        Mensch t = new Mensch("Olaf Scholz", "Rot", 66);

        Mensch[] gruppeArray = new Mensch[2];

        gruppeArray[0] = p;
        gruppeArray[1] = t;

        for(int i = 0; i < gruppeArray.length; i++){
            System.out.println(gruppeArray[i].toString());
        }

        System.out.println("\n----------------------\n");

        ArrayList<Mensch> gruppe = new ArrayList<>(Arrays.asList(gruppeArray));

        gruppe.add(new Prof("Thomas Richter", "Hellblau", 44, 1213));

        for(int i = 0; i < gruppe.size(); i++){
            System.out.println(gruppe.get(i));
        }
    }
}

class Mensch {
    private int alter;
    private String name;
    private String farbe;

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public Mensch(){
        this(null, null, 0);
    }

    public Mensch(String name, String farbe, int alter) {
        this.alter = alter;
        this.name = name;
        this.farbe = farbe;
    }

    @Override
    public String toString(){
        return getName() + " / " + getAlter() + " / " + getFarbe();
    }
}

class Prof extends Mensch {
    private int nr;
    
    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public Prof(){
        super();
        this.nr = 0;
    }

    public Prof(String name, String farbe, int alter, int nr){
        super(name, farbe, alter);
        this.nr = nr;
    }

    @Override
    public String toString(){
        return super.toString() + " / " + getNr();
    }
}