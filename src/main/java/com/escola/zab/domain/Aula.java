package com.escola.zab.domain;

import java.time.LocalDate;

public class Aula {
    private Long id;
    private LocalDate data;
    private String tema;
    private String descricao;
    private Turma turma;
    private Professor professor;

    public Aula() {
    }

    public Aula(Long id, LocalDate data, String tema, String descricao, Turma turma, Professor professor) {
        this.id = id;
        this.data = data;
        this.tema = tema;
        this.descricao = descricao;
        this.turma = turma;
        this.professor = professor;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
