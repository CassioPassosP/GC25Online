package com.data.Desafio5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataVencimento{
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate inicio = LocalDate.of(2025,3,20);

        System.out.println("Data de compra  " + formato.format(inicio));

        LocalDate dataAtual = inicio.plusMonths(1);

        System.out.println("Nova data de vencimento: " + formato.format(dataAtual));

    }
}
