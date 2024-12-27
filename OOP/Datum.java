package OOP;

public class Datum {
    String name;
    int tag;
    int monat;
    int jahr;

    public Datum(){
        this("Montag", 1, 1, 1970);
    }

    public Datum(String tagName, int tag, int monat, int jahr){
        this.name = tagName;
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public String toString(){
        return name + ", den " + tag + "." + monat + "." + jahr;
    }
}
