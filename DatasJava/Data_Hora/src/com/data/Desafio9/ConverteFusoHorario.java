package com.data.Desafio9;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConverteFusoHorario {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        ZonedDateTime dataConclucaoCompra = ZonedDateTime.now();

        System.out.println("Horario atual no sistema: " + formato.format(dataConclucaoCompra));

        ZonedDateTime dataCompraNy = dataConclucaoCompra.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        System.out.println("Horario atual em Sidney: " + formato.format(dataCompraNy));
    }
}
