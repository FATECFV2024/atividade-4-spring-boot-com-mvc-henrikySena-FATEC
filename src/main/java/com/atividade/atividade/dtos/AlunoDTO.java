package com.atividade.atividade.dtos;

import com.atividade.atividade.entities.Aluno;

public class AlunoDTO {

    private Long id;
    private String nome;
    private String cpf;
    private String curso;


    public AlunoDTO() {
    }

    
    public AlunoDTO(Aluno entity) {
        id = entity.getId();
        nome = entity.getNome();
        cpf = entity.getCpf();
        curso = entity.getCurso();
    }
    

    public AlunoDTO(Long id, String nome, String cpf, String curso) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
    }


  public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
