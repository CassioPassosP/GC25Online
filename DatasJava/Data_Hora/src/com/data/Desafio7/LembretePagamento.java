package com.data.Desafio7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembretePagamento {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate inicio = LocalDate.of(2025,3,20);

        System.out.println("Data de vencimento " + formato.format(inicio));

        LocalDate novaData = inicio.minusDays(5);

        System.out.println("Data do lembrete: " + formato.format(novaData));
    }
}
