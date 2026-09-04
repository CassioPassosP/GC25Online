package com.data.Desafio8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorario {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        ZonedDateTime dataConclucaoCompra = ZonedDateTime.now();

        System.out.println("Horario atual de sao paulo: " + formato.format(dataConclucaoCompra));

        ZonedDateTime dataCompraNy = dataConclucaoCompra.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println("Horario atual de Toquio: " +formato.format(dataCompraNy));
    }
}
