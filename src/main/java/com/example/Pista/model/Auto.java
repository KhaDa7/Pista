package com.example.Pista.model;

import jakarta.persistence.*;

@Entity
@Table(name = "auto")
public class Auto
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String marca;
    @Column
    private String modello;
    @Column
    private double importo;
    @Column
    private String schedaTecnica;
    @Column
    private String immagine;
    @Column
    private String cavalli;
    @Column
    private String accelerazione;
    @Column
    private String velocitaMassima;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public String getSchedaTecnica() {
        return schedaTecnica;
    }

    public void setSchedaTecnica(String schedaTecnica) {
        this.schedaTecnica = schedaTecnica;
    }

    public String getImmagine() {
        return immagine;
    }

    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }

    public String getCavalli() {
        return cavalli;
    }

    public void setCavalli(String cavalli) {
        this.cavalli = cavalli;
    }

    public String getAccelerazione() {
        return accelerazione;
    }

    public void setAccelerazione(String accelerazione) {
        this.accelerazione = accelerazione;
    }

    public String getVelocitaMassima() {
        return velocitaMassima;
    }

    public void setVelocitaMassima(String velocitaMassima) {
        this.velocitaMassima = velocitaMassima;
    }
}
