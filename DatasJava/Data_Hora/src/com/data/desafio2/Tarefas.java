package com.data.desafio2;
//desafio 1

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Tarefas {
    private String descricao;
    private LocalDate dataTarefa;
    private LocalTime horaTerefa;

    public Tarefas(String descricao, LocalDate dataTarefa, LocalTime horaTerefa) {
        this.descricao = descricao;
        this.dataTarefa = dataTarefa;
        this.horaTerefa = horaTerefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataTarefa() {
        return dataTarefa;
    }

    public LocalTime getHoraTerefa() {
        return horaTerefa;
    }
}
