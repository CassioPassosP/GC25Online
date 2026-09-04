package com.data.Desafio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VerificaDataEvento {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate inicio = LocalDate.of(2025,3,20);

        System.out.println("Data do evento  " + formato.format(inicio));

        LocalDate dataAtual = LocalDate.of(2025,3,10);

        String resultado = inicio.isAfter(dataAtual) ? "O evento esta por vir!" : "O evento ja ocorreu.";
        System.out.println(resultado);
    }
}
