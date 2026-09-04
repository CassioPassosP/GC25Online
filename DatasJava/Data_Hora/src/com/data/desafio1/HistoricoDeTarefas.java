package com.data.desafio1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HistoricoDeTarefas {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        List<Tarefas> historico = new ArrayList<>();

        System.out.println("Digite 1 para inserir uma tarefa ou 0 para terminar.");
        int Sair = 1;

        while(Sair != 0){
            System.out.println("Insira uma tarefa:");
            String tarefaAtual = leitura.next();

            LocalDate datasTarefas = LocalDate.now();
            LocalTime horaTarefa = LocalTime.now();

            Tarefas tarefas = new Tarefas(tarefaAtual, datasTarefas, horaTarefa);
            historico.add(tarefas);

            System.out.println("******************\n");
            System.out.println("TAREFAS:\n");
            for (Tarefas c : historico){
                System.out.println(c.getDescricao() + "\n Data: " + c.getDataTarefa() + "\n Hora: " + c.getHoraTerefa());
            }

        }
    }
}
