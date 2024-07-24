package esercizio3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private int numeroArticoli;
    private int costoTotale;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new Articolo[3]; // Limitiamo il carrello a 3 articoli per semplicità
        this.numeroArticoli = 0;
        this.costoTotale = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public int getNumeroArticoli() {
        return numeroArticoli;
    }

    public int getCostoTotale() {
        return costoTotale;
    }

    public void aggiungiArticolo(Articolo articolo, int quantita) {
        if (numeroArticoli < articoli.length) {
            if (articolo.getNumeroPezziDisponibili() >= quantita) {
                articoli[numeroArticoli] = articolo;
                numeroArticoli++;
                costoTotale += articolo.getPrezzo() * quantita;
                articolo.setNumeroPezziDisponibili(articolo.getNumeroPezziDisponibili() - quantita);
            } else {
                System.out.println("Quantità richiesta non disponibile in magazzino.");
            }
        } else {
            System.out.println("Il carrello è pieno.");
        }
    }

    public void stampaCarrello() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Articoli nel carrello:");
        for (int i = 0; i < numeroArticoli; i++) {
            System.out.println(articoli[i]);
        }
        System.out.println("Totale costo: " + costoTotale + " euro");
    }
}
