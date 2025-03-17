package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;


public class Prodotto {

    Random random = new Random();

    // attributi
    public int codice;
    public String nome;
    public String descrizione;
    public BigDecimal prezzo;
    public BigDecimal iva; 

    // metodi
    public Prodotto(String nome,String descrizione,BigDecimal prezzo,BigDecimal iva) {
        this.codice = random.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    } 

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public BigDecimal getPrezzoConIva(){

        if(prezzo != null && iva != null) {
            BigDecimal prezzoConIva = prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
            return prezzoConIva;
        }
        return null;
    }

    public String getNomeEsteso() {

        if (nome != null) {
            return codice + "-" + nome.toLowerCase();
        }
        return null;
    }
}
