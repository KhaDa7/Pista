package com.example.Pista.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "prenotazioni")
public class Prenotazione {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private LocalDate dataCorsa;


    @Column
    private LocalDateTime dataOraPagamento;


    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_utente", referencedColumnName = "id")
    private Utente utente;


    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_auto", referencedColumnName = "id")
    private Auto auto;


    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_pagamento", referencedColumnName = "id")
    private Pagamento pagamento;


    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_pilota", referencedColumnName = "id")
    private Pilota pilota;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataCorsa() {
        return dataCorsa;
    }

    public void setDataCorsa(LocalDate dataCorsa) {
        this.dataCorsa = dataCorsa;
    }

    public LocalDateTime getDataOraPagamento() {
        return dataOraPagamento;
    }

    public void setDataOraPagamento(LocalDateTime dataOraPagamento) {
        this.dataOraPagamento = dataOraPagamento;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Pilota getPilota() {
        return pilota;
    }

    public void setPilota(Pilota pilota) {
        this.pilota = pilota;
    }


}
