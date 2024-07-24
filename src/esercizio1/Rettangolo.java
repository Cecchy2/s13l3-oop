package esercizio1;


public class Rettangolo {
    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2) {
        System.out.println("rettangolo1 : ");
        rett1.stampaRettangolo();

        System.out.println("rettangolo2 : ");
        rett2.stampaRettangolo();

        int sommaArea = rett1.getAreaRettangolo() + rett2.getAreaRettangolo();
        int sommaPerimetri = rett1.getPerimetroRettangolo() + rett2.getPerimetroRettangolo();

        System.out.println("La somma delle Aree è : " + sommaArea);
        System.out.println("La somma dei perimetri è : " + sommaPerimetri);
    }

    public void stampaRettangolo() {
        System.out.println("l' area del rettangolo è " + getAreaRettangolo());
        System.out.println("il suo perimetro è" + getPerimetroRettangolo());

    }

    public int getAreaRettangolo() {
        return this.altezza * this.larghezza;
    }

    public int getPerimetroRettangolo() {
        return (this.altezza + this.larghezza) * 2;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "altezza=" + altezza +
                ", larghezza=" + larghezza +
                '}';
    }
}
