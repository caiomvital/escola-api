package com.escola.zab.domain;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Aluno {

    //atributos
    private Integer id;
    private String nome;
    private String matricula;
    private LocalDate dataNascimento;
    private Turma turma;
    private List<Responsavel> responsaveis;

    public Aluno(){} //construtor vazio

    //construtor com todos os campos
    public Aluno(Integer id, String nome, String matricula,
                 LocalDate dataNascimento, Turma turma,
                 List<Responsavel> responsaveis) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.turma = turma;
        this.responsaveis = responsaveis;
    }

    //método para calcular a idade pela data de nascimento
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    //getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public List<Responsavel> getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(List<Responsavel> responsaveis) {
        this.responsaveis = responsaveis;
    }
}
