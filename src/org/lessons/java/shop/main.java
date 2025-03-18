package org.lessons.java.shop;

import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {


        Prodotto cappello = new Prodotto( "Fedora",  "Fedora", new BigDecimal(130), new BigDecimal(0.22));

        // Prodotto giacca = new Prodotto( "Giacca Gucci", "Gucci", new BigDecimal(230), new BigDecimal(0.17));

        // test Overload costruttore che ritorna un prodotto con variabili d'istanza null
        Prodotto farro = new Prodotto();

        System.out.println("");


        // farro\
        System.out.println("test Overload costruttore che ritorna un prodotto con variabili d'istanza null (eccetto il codice)");
        System.out.println("Codice: " + farro.getCodice() + " " + "Prezzo: " + farro.getPrezzo() + " Nome: " + farro.getNome());

        System.out.println("");

        // Cappello
        System.out.println("Prodotto (cappello) istanziato dal costruttore");
        System.out.println("Nome: " + cappello.getNome());
        System.out.println("Nome esteso prodotto: " + cappello.getNomeEsteso());
        System.out.println("Marca: " + cappello.getMarca());
        System.out.println("prezzo: " + cappello.getPrezzo() + "$");
        System.out.println("prezzo con iva al " + cappello.getIva() + "% : " + cappello.getPrezzoConIva() + "$");


        // // Giacca
        // System.out.println("Nome esteso prodotto: " + giacca.getNomeEsteso());
        // System.out.println("prezzo: " + giacca.getPrezzo() + "$ con iva: " + giacca.getPrezzoConIva() + "$");

        // modifica cappello
        System.out.println("");

        cappello.setNome("Cappello elegante");
        cappello.setMarca("Prada");
        cappello.setPrezzo(new BigDecimal(170.00));
        cappello.setIva(new BigDecimal(0.18));

        // cappello modificato
        System.out.println("Cappello aggiornato");
        System.out.println("Nome: " + cappello.getNome());
        System.out.println("Nome esteso prodotto: " + cappello.getNomeEsteso());
        System.out.println("Marca: " + cappello.getMarca());
        System.out.println("prezzo: " + cappello.getPrezzo() + "$");
        System.out.println("prezzo con iva al " + cappello.getIva() + "% : " + cappello.getPrezzoConIva() + "$");

        System.out.println("");

    }
}
