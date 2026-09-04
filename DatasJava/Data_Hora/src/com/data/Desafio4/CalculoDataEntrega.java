package com.data.Desafio4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CalculoDataEntrega {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate inicio = LocalDate.of(2025,7,2);

        System.out.println("Data de compra  " + formato.format(inicio));

        LocalDate prazo = inicio.plusDays(30);

        System.out.println("Data de entrega  " + formato.format(prazo));
    }
}
