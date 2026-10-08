package com.ava.proximo_passo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProximoPassoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long conteudo_id;
    private String nivel_dificuldade;
    private Double taxa_acerto;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getConteudo_id() {
        return conteudo_id;
    }
    public void setConteudo_id(Long conteudo_id) {
        this.conteudo_id = conteudo_id;
    }
    public String getNivel_dificuldade() {
        return nivel_dificuldade;
    }
    public void setNivel_dificuldade(String nivel_dificuldade) {
        this.nivel_dificuldade = nivel_dificuldade;
    }
    public Double getTaxa_acerto() {
        return taxa_acerto;
    }
    public void setTaxa_acerto(Double taxa_acerto) {
        this.taxa_acerto = taxa_acerto;
    }
}

