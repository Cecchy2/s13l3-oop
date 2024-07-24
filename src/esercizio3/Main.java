package esercizio3;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        // Generazione del codice cliente casuale
        int codiceCliente = (random.nextInt(1000));
        Cliente cliente1 = new Cliente(codiceCliente, "Dario", "Cecchinato", "dariocecchinato@xxxxx.com", LocalDate.now());

        // Generazione dei codici articolo casuali
        int codiceArticolo1 = random.nextInt(1000);
        int codiceArticolo2 = random.nextInt(1000);
        int codiceArticolo3 = random.nextInt(1000);

        Articolo articolo1 = new Articolo(codiceArticolo1, "Orologio", 90, 4);
        Articolo articolo2 = new Articolo(codiceArticolo2, "LongBoard", 120, 2);
        Articolo articolo3 = new Articolo(codiceArticolo3, "Phone", 600, 40);

        Carrello carrello = new Carrello(cliente1);
        carrello.aggiungiArticolo(articolo1, 1);
        carrello.aggiungiArticolo(articolo2, 1);
        carrello.aggiungiArticolo(articolo3, 1);

        carrello.stampaCarrello();
    }
}
