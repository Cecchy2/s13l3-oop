package esercizio2;

public class Sim {
    private int numeroTelefono;
    private double credito;
    private Chiamata[] chiamate;


    public Sim(int numeroTelefono) {
        this.credito = 0;
        this.chiamate = new Chiamata[5];
    }


}
