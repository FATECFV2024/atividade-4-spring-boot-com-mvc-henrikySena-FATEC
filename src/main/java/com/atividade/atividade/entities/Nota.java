package com.atividade.atividade.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_nota")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDisciplina;
    private Double nota;


    @ManyToOne
    @JoinColumn(name="fkaluno")
    private Aluno aluno;



    public Nota(Long id, String nomeDisciplina, Double nota, Aluno aluno) {
        this.id = id;
        this.nomeDisciplina = nomeDisciplina;
        this.nota = nota;
        this.aluno = aluno;
    }



    public Nota() {
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



    public Aluno getAluno() {
        return aluno;
    }



    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }



    
}


