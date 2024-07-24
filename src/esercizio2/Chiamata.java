package esercizio2;

public class Chiamata {
    private int durataInMinuti;
    private int numeroChiamato;


    public Chiamata(int durataInMinuti, int numeroChiamato) {
        this.durataInMinuti = durataInMinuti;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurataInMinuti() {
        return durataInMinuti;
    }

    public void setDurataInMinuti(int durataInMinuti) {
        this.durataInMinuti = durataInMinuti;
    }

    public int getNumeroChiamato() {
        return numeroChiamato;
    }

    public void setNumeroChiamato(int numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "durataInMinuti=" + durataInMinuti +
                ", numeroChiamato=" + numeroChiamato +
                '}';
    }
}
