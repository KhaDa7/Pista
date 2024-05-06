package com.example.Pista.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "piloti")
public class Pilota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nome;
    @Column
    private String cognome;
    @Column
    private LocalDate dataDiNascita;
    @Column
    private String descrizione;
    @Column
    private String immagine;
    @Column
    private String bandieraNazionalita;
    @Column
    private String anniEsperienza;
    @Column
    private int gpDisputati;
    @Column
    private int gpVinti;
    @Column
    private int podi;
    @Column
    private int mondiali;
    @Column
    private String scuderia;
    @Column
    private String logoScuderia;
    @Column
    private String immagineDettaglio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getImmagine() {
        return immagine;
    }

    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }

    public String getBandieraNazionalita() {
        return bandieraNazionalita;
    }

    public void setBandieraNazionalita(String bandieraNazionalita) {
        this.bandieraNazionalita = bandieraNazionalita;
    }

    public String getAnniEsperienza() {
        return anniEsperienza;
    }

    public void setAnniEsperienza(String anniEsperienza) {
        this.anniEsperienza = anniEsperienza;
    }

    public int getGpVinti() {
        return gpVinti;
    }

    public void setGpVinti(int gpVinti) {
        this.gpVinti = gpVinti;
    }

    public int getGpDisputati() {
        return gpDisputati;
    }

    public void setGpDisputati(int gpDisputati) {
        this.gpDisputati = gpDisputati;
    }

    public int getPodi() {
        return podi;
    }

    public void setPodi(int podi) {
        this.podi = podi;
    }

    public int getMondiali() {
        return mondiali;
    }

    public void setMondiali(int mondiali) {
        this.mondiali = mondiali;
    }

    public String getScuderia() {
        return scuderia;
    }

    public void setScuderia(String scuderia) {
        this.scuderia = scuderia;
    }

    public String getLogoScuderia() {
        return logoScuderia;
    }

    public void setLogoScuderia(String logoScuderia) {
        this.logoScuderia = logoScuderia;
    }

    public String getImmagineDettaglio() {
        return immagineDettaglio;
    }

    public void setImmagineDettaglio(String immagineDettaglio) {
        this.immagineDettaglio = immagineDettaglio;
    }
}
