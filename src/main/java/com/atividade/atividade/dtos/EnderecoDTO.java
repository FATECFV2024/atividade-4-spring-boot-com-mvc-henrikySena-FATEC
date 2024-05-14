package com.atividade.atividade.dtos;

import com.atividade.atividade.entities.Endereco;

public class EnderecoDTO {

    private Long id;
    private String rua;
    private Integer numero;
    private String cidade;
    private String estado;
    private String cep;

    public EnderecoDTO() {
    }

    
    public EnderecoDTO(Endereco entity) {
        id = entity.getId();
        rua = entity.getRua();
        numero = entity.getNumero();
        cidade = entity.getCidade();
        estado = entity.getEstado();
        cep = entity.getCep();
    }


    public EnderecoDTO(Long id, String rua, Integer numero, String cidade, String estado, String cep) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }



    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getRua() {
        return rua;
    }


    public void setRua(String rua) {
        this.rua = rua;
    }


    public Integer getNumero() {
        return numero;
    }


    public void setNumero(Integer numero) {
        this.numero = numero;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getCep() {
        return cep;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
