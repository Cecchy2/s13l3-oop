package esercizio2;

public class Chiamata {
    private int durata;
    private int numeroChiamato;


    public Chiamata(int durata, int numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
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
                "durata=" + durata +
                ", numeroChiamato=" + numeroChiamato +
                '}';
    }
}
