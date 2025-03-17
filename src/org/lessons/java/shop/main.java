package org.lessons.java.shop;

import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {


        Prodotto cappello = new Prodotto( "Fedora",  "Fedora elegante per tutte le occasioni", new BigDecimal(130), new BigDecimal(0.22));

        Prodotto giacca = new Prodotto( "Giacca Gucci", "Giacca Griffata Gucci di ottima fattura, in pelle eco", new BigDecimal(230), new BigDecimal(0.17));

        // Cappello
        System.out.println("Nome esteso prodotto: " + cappello.getNomeEsteso());
        System.out.println("prezzo: " + cappello.getPrezzo() + "$ con iva: " + cappello.getPrezzoConIva() + "$");

        // Giacca
        System.out.println("Nome esteso prodotto: " + giacca.getNomeEsteso());
        System.out.println("prezzo: " + giacca.getPrezzo() + "$ con iva: " + giacca.getPrezzoConIva() + "$");
    }
}
