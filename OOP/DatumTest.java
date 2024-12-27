package OOP;

public class DatumTest {
    public static void main(String[] args){
        Datum heute = new Datum("Freitag", 27, 12, 2024);
        Datum unix = new Datum();

        System.out.println(heute);
        System.out.println(unix);
    }
}
