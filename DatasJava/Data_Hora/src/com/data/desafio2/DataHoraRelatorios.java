
package com.data.desafio2;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class DataHoraRelatorios {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);

            List<Tarefas> historico = new ArrayList<>();

            System.out.println("Digite 1 para inserir uma relatorio ou 0 para terminar.");
            int Sair = 1;

            while(Sair != 0){
                System.out.println("Insira uma tarefa:");
                String tarefaAtual = leitura.next();

                LocalDate datasRelatorio = LocalDate.now();
                LocalTime horaRelatorio = LocalTime.now();

                DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter horaFormat = DateTimeFormatter.ofPattern("HH:mm");

                Tarefas tarefas = new Tarefas(tarefaAtual, datasRelatorio, horaRelatorio);
                historico.add(tarefas);

                System.out.println("******************\n");
                System.out.println("RELATORIOS DO DIA:\n");
                for (Tarefas c : historico){
                    System.out.println(c.getDescricao() + "\n Data: " + dataFormat.format(c.getDataTarefa()) + "\n Hora: " + horaFormat.format(c.getHoraTerefa()));
                }

            }
        }
}


