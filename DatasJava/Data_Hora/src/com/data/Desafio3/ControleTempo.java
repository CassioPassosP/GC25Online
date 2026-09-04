package com.data.Desafio3;
import java.time.Duration;
import java.time.LocalTime;

public class ControleTempo {
    public static void main(String[] args) {

        LocalTime inicio = LocalTime.of(14,30);

        LocalTime fim = LocalTime.of(16,45);

        Duration duration = Duration.between(inicio,fim);

        System.out.println("Diferenca de tempo de " + duration.toHours() + " horas e " + duration.toMinutesPart() + " minutos");
    }
}
