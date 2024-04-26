package com.example.Pista.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CollectionIdJdbcTypeCode;
import org.hibernate.annotations.Generated;

@Entity
@Table(name = "pagamenti")
public class Pagamento
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
