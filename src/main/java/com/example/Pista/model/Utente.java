package com.example.Pista.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "utenti")
public class Utente
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @Pattern(regexp = "[a-zA-z\\sàèìòù']{1,50}",message = "Caratteri non consentiti!")
    private String nome;

    @Column
    @Pattern(regexp = "[a-zA-z\\sàèìòù']{1,50}",message = "Caratteri non consentiti!")
    private String cognome;
    @Column(name = "data_nascita")
    private LocalDate dataDiNascita;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "id_profilo", referencedColumnName = "id")
    @Valid
    private Profilo profilo;
    @OneToMany
            (
                    mappedBy = "utente" ,
                    cascade = CascadeType.REMOVE,
                    fetch = FetchType.EAGER

            )
    private List<Prenotazione> prenotazioni = new ArrayList<>();

    @Column
    @Pattern(regexp = "[a-zA-z0-9.'\\sàèìòù']{1,50}",message = "Caratteri non consentiti!")
    private String indirizzo;

    @Column
    private String genere;

    @Column
    @Pattern(regexp = "[0-9+]{1,12}",message = "Caratteri non validi!")
    private String telefono;

    @Column
    private String documento;

    @Column
    @Pattern(regexp = "[a-zA-Z0-9]{1,50}",message = "Caratteri non consentiti!")
    private String numeroDocumento;

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

    public Profilo getProfilo() {
        return profilo;
    }

    public void setProfilo(Profilo profilo) {
        this.profilo = profilo;
    }

    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(List<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
}
