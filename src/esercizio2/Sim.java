package esercizio2;

import java.util.Random;

public class Sim {
    private int numeroDiTelefono;
    private int creditoDisponibile = 0;
    private Chiamata[] ultimeChiamate;
    private int chiamateEffettuate;


    public Sim(int numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.creditoDisponibile = 0;
        this.ultimeChiamate = new Chiamata[5];
        this.chiamateEffettuate=0;

    }

    public void aggiungiChiamata(Chiamata chiamata) {
        if (chiamateEffettuate < 5) {
            ultimeChiamate[chiamateEffettuate] = chiamata;
            chiamateEffettuate++;
        }




}
