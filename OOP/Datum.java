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

    @Override
    public String toString(){
        return name + ", den " + tag + "." + monat + "." + jahr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getMonat() {
        return monat;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }
}
