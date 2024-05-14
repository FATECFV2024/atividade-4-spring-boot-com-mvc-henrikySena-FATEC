package com.atividade.atividade.dtos;

import com.atividade.atividade.entities.Nota;

public class NotaDTO {

    private Long id;
    private String nomeDisciplina;
    private Double nota;


    public NotaDTO() {
    }

    
    public NotaDTO(Nota entity) {
        id = entity.getId();
        nomeDisciplina = entity.getNomeDisciplina();
        nota = entity.getNota();
    }


    public NotaDTO(Long id, String nomeDisciplina, double nota) {
        this.id = id;
        this.nomeDisciplina = nomeDisciplina;
        this.nota = nota;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNomeDisciplina() {
        return nomeDisciplina;
    }


    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


    public Double getNota() {
        return nota;
    }


    public void setNota(Double nota) {
        this.nota = nota;
    }


    

}
