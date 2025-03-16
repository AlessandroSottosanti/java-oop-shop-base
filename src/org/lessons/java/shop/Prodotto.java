package org.lessons.java.shop;

public class Prodotto {

    // attributi
    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public float iva; 

    // metodi
    public Prodotto(int codice,String nome,String descrizione,int prezzo,int iva) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public float getPrezzo() {
        return this.prezzo;
    }

    public float getPrezzoConIva(){
        float prezzoConIva = this.prezzo * (1 + (this.iva / 100.0f));
        return prezzoConIva;
    }

    public String getNomeEsteso() {
        return this.codice + "-" + this.nome.toLowerCase();
    }
}
