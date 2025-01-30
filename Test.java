//Boo!!

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Mensch> gruppe = new ArrayList<>();
        Prof richter = new Prof("T. Richter", "männlich", 44);
        Prof greveler = new Prof("U. Greveler", "männlich", 52);
        Prof zimmer = new Prof("F. Zimmer", "männlich", 55);
        
        Student warpstar = new Student("WARPSTAR", 18, "weiberlich");
        Student herbert = new Student("Herbert", 19, "männlich");
        Student bomboclaat = new Student("Bomboclaat", 21, "männlich");
        
        Mitarbeiter lennartz = new Mitarbeiter("F. Lennartz", 31, "männlich");

        gruppe.add(richter);
        gruppe.add(greveler);
        gruppe.add(zimmer);
        gruppe.add(warpstar);
        gruppe.add(herbert);
        gruppe.add(bomboclaat);
        gruppe.add(lennartz);

        for(int i = 0; i < gruppe.size(); i++){
            System.out.println(gruppe.get(i).toString());
        }

        System.out.println("\n------------------------------\n");

        ArrayList<Prof> proflist = new ArrayList<>();
        ArrayList<Student> studentlist = new ArrayList<>();

        for(int i = 0; i < gruppe.size(); i++){
            if(gruppe.get(i) instanceof Prof){
                proflist.add((Prof) gruppe.get(i));
            } else if (gruppe.get(i) instanceof Student){
                studentlist.add((Student) gruppe.get(i));
            }
        }

        for(int i = 0; i < proflist.size(); i++){
            System.out.println(proflist.get(i).vorstellen());
        }

        for(int i = 0; i < studentlist.size(); i++){
            System.out.println(studentlist.get(i).vorstellen());
        }
    }
}

interface introducable {
    String vorstellen();
}

abstract class Mensch {
    private int alter;
    private String name;
    private String geschlecht;

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

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

    public Mensch(){
        this(null, null, 0);
    }

    public Mensch(String name, String geschlecht, int alter) {
        this.alter = alter;
        this.name = name;
        this.geschlecht = geschlecht;
    }

    @Override
    public String toString(){
        return getName() + " / " + getAlter() + " / " + getGeschlecht();
    }
}

class Prof extends Mensch implements introducable {
    private static int nextNr = 1;
    private int nr;

    public int getNr() {
        return nr;
    }

    public Prof() {
        super();
        this.nr = nextNr++;
    }

    public Prof(String name, String geschlecht, int alter) {
        super(name, geschlecht, alter);
        this.nr = nextNr++;
    }

    @Override
    public String toString() {
        return super.toString() + " / Prof-Nr: " + nr;
    }

    @Override
    public String vorstellen() {
        return "Hallo, ich bin Professor, ich heiße " + getName() + ", ich bin " + getAlter() + " Jahre alt und bin " + getGeschlecht() + ". Meine Prof-Nummer ist " + nr + ".";
    }
}

class Student extends Mensch implements introducable {
    private static int nextMatnr = 1;
    private int matnr;

    public int getMatnr(){
        return matnr;
    }

    public void setMatnr(int matnr){
        this.matnr = nextMatnr++;
    }

    public Student() {
        super();
        this.matnr = nextMatnr++;
    }

    public Student(String name, int alter, String geschlecht){
        super(name, geschlecht, alter);
        this.matnr = nextMatnr++;
    }

    @Override
    public String toString(){
        return super.toString() + " / Matrikelnummer: " + getMatnr();
    }

    @Override
    public String vorstellen(){
        return "Hallo, ich bin Student, ich heiße " + getName() + ", ich bin " + getAlter() + " Jahre alt und bin " + getGeschlecht() + ". Meine Matrikelnummer ist " + getMatnr() + ".";
    }
}

class Mitarbeiter extends Mensch implements introducable {
    public Mitarbeiter(){
        super();
    }

    public Mitarbeiter(String name, int alter, String geschlecht){
        super(name, geschlecht, alter);
    }

    @Override
    public String vorstellen(){
        return "Hallo, ich bin Mitarbeiter, ich heiße " + getName() + ", ich bin " + getAlter() + " Jahre alt und bin " + getGeschlecht();
    }
}