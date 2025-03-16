package org.lessons.java.shop;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random random = new Random();

        int numero = random.nextInt(1001); // Genera un numero tra 0 e 99

        int numero2 = random.nextInt(1001); // Genera un numero tra 0 e 99


        Prodotto cappello = new Prodotto(numero, "Fedora",  "Fedora elegante per tutte le occasioni", 130, 22);

        Prodotto giacca = new Prodotto(numero2, "Giacca Gucci", "Giacca Griffata Gucci di ottima fattura, in pelle eco", 230, 17);

        // Cappello
        float prezzoConIva = cappello.getPrezzoConIva();

        prezzoConIva = Math.round(prezzoConIva * 100.0f) / 100.0f;

        float prezzo = cappello.getPrezzo();

        String nomeEsteso = cappello.getNomeEsteso();

        // Giacca

        float prezzoConIva2 = giacca.getPrezzoConIva();

        prezzoConIva2 = Math.round(prezzoConIva2 * 100.0f) / 100.0f;

        float prezzo2 = giacca.getPrezzo();

        String nomeEsteso2 = giacca.getNomeEsteso();


        // Cappello
        System.out.println("Nome esteso prodotto: " + nomeEsteso);
        System.out.println("prezzo: " + prezzo + "$ con iva: " + prezzoConIva + "$");

        // Giacca
        System.out.println("Nome esteso prodotto: " + nomeEsteso2);
        System.out.println("prezzo: " + prezzo2 + "$ con iva: " + prezzoConIva2 + "$");
    }
}
