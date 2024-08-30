package com.escola.zab.domain;

import java.util.List;

public class Responsavel {
    private Long id;
    private String nome;
    private String parentesco; // ex: Pai, Mãe, Tio, etc.
    private String telefone;
    private String email;
    private String endereco;
    private String cpf;
    private List<Aluno> dependentes; // Lista de alunos associados a este responsável

    public Responsavel() {
    }

    public Responsavel(Long id, String nome, String parentesco, String telefone, String email, String endereco, String cpf, List<Aluno> dependentes) {
        this.id = id;
        this.nome = nome;
        this.parentesco = parentesco;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
        this.dependentes = dependentes;
    }

    // Getters e Setters
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

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Aluno> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Aluno> dependentes) {
        this.dependentes = dependentes;
    }
}
