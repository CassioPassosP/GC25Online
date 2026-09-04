import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Vanderlei da silva";
        String tipoConta = "Corrente";

        double saldo = 0.0 ;
        double valorDeTransalacoes = 0.0 ;

        int escolha = 0 ;

        //Inicializacao dos dados do cliente
        System.out.println("""
                *********************************
                Nome do cliente:  """ + nome +

                """
                
                Tipo de conta:  """ + tipoConta +

                """
                
                Saldo atual:  """ + saldo +

                """
                
                *********************************
                
                """
                );

        //Menu de opcoes
        while (escolha != 4) {
            System.out.println("""
                                Operacoes
                                
                                1- Consultar saldos
                                2- Receber valor
                                3- Transferir valor
                                4- Sair
                                """);

            System.out.println("Digite a opcao desejada:");
            escolha = leitura.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Saldo: R$ " + saldo);
                    break;

                case 2:
                    System.out.println("Informe o valor a receber:");
                    valorDeTransalacoes = leitura.nextDouble();
                    saldo += valorDeTransalacoes;

                    System.out.println("Saldo Atualizado: R$ " + saldo);
                    break;

                case 3:
                    System.out.println("Informe o valor a ser transferido:");
                    valorDeTransalacoes = leitura.nextDouble();

                    if (valorDeTransalacoes > saldo) {
                        System.out.println("Nao ha saldo para realizar a transferencia.");
                    }else {
                        saldo -= valorDeTransalacoes;
                        System.out.println("Saldo Atualizado: R$ " + saldo);
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
    }
}
