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
}
