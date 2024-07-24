package esercizio3;

public class Articolo {
    private int codiceArticolo;
    private String descrizioneArticolo;
    private int prezzo;
    private int numeroPezziDisponibili;

    public Articolo(String codiceArticolo, String descrizioneArticolo, int prezzo, int numeroPezziDisponibili) {
        this.codiceArticolo = Integer.parseInt(codiceArticolo);
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    public int getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public int getNumeroPezziDisponibili() {
        return numeroPezziDisponibili;
    }

    public void setNumeroPezziDisponibili(int numeroPezziDisponibili) {
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codiceArticolo=" + codiceArticolo +
                ", descrizioneArticolo='" + descrizioneArticolo + '\'' +
                ", prezzo=" + prezzo +
                ", numeroPezziDisponibili=" + numeroPezziDisponibili +
                '}';
    }
}
