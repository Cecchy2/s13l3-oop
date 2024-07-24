package esercizio1;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(30, 40);
        rettangolo.stampaRettangolo();

        Rettangolo rettangolo2 = new Rettangolo(25, 45);
        rettangolo2.stampaRettangolo();

        Rettangolo.stampaDueRettangoli(rettangolo, rettangolo2);
    }
}