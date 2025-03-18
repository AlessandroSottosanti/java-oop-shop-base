package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;


public class Prodotto {

    Random random = new Random();

    // attributi
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva; 

    // costruttori

    public Prodotto(String nome,String marca,BigDecimal prezzo,BigDecimal iva) {
        this.codice = random.nextInt(99999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public Prodotto() {
        this.codice = random.nextInt(99999);
    }


    // metodi getter e setter

    public BigDecimal getPrezzo() {
        if(prezzo != null){
            return this.prezzo;
        }
        return null;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }


    public String getNome() {
        if(nome != null){
            return this.nome;
        }
        return null;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getMarca() {
        if(marca != null){
            return this.marca;
        }
        return null;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public BigDecimal getIva() {
        if(iva != null){
            BigDecimal ivaInPerc = iva.multiply(new BigDecimal(100.00));
            return ivaInPerc.setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }


    public int getCodice() {
        return this.codice;
    }

    // metodi

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
