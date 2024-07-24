package esercizio2;

public class Main {
    public static void main(String[] args) {

        Chiamata[] chiamate = new Chiamata[5];

        Chiamata chiamata1 = new Chiamata(2, 345345623);
        Chiamata chiamata2 = new Chiamata(4, 645645667);
        Chiamata chiamata3 = new Chiamata(1, 435345354);
        Chiamata chiamata4 = new Chiamata(3, 536345675);
        Chiamata chiamata5 = new Chiamata(1, 356345346);

        chiamate[0] = chiamata1;
        chiamate[1] = chiamata2;
        chiamate[2] = chiamata3;
        chiamate[3] = chiamata4;
        chiamate[4] = chiamata5;

        for (int i = 0; i < chiamate.length; i++) {
            System.out.println(chiamate[i]);
        }

    }
}
