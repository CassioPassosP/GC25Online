package com.data.Desafio10;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleExpediente {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime inicioEx = LocalTime.parse(scanner.next(), formatter);

        System.out.print("Digite a carga horária diária (em horas): ");
        int horasPorDia = scanner.nextInt();

        System.out.print("Digite o horário real de saída (HH:mm): ");
        LocalTime saidaEx = LocalTime.parse(scanner.next(), formatter);

        LocalTime saidaPrevista = inicioEx.plusHours(horasPorDia);

        Duration saldo = Duration.between(saidaPrevista, saidaEx);

        System.out.print("Horário de entrada: " + inicioEx);
        System.out.print("\nHorário de saida previsto: " + inicioEx.plusHours(horasPorDia));
        System.out.print("\nHorário real de saída: " + saidaEx);

        long horasSaldo = saldo.toHours();
        long minutosSaldo = saldo.toMinutesPart();

        System.out.print("\nSaldo de horas: " + horasSaldo + "h " + minutosSaldo + "min");
    }
}
