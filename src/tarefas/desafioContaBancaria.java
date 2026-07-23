package tarefas;

import java.util.Scanner;

public class desafioContaBancaria {
    static void main(String[] args) {
//        dados iniciais do cliente: nome, tipo da conta, saldo inicial
//        operações: consultar saldos, recebar valor, transferir valor, sair

        Scanner scanner= new Scanner(System.in);

//        INFORMAÇÕES BASE DO CLIENTE:
        String nome= "Guilherme Graces";
        String conta= "Corrente";
        double saldo= 5500;
        int operacao=0;



        while(operacao!=4){
            System.out.println(String.format("""
                **************************
                DADOS PRIVADOS DO CLIENTE:
                
                Nome: %s
                Saldo atual: %.3f
                Conta: %s
                **************************
                """, nome, saldo, conta));

//            OPERAÇÕES:
            if (operacao!=4){
                System.out.println("""
                OPERAÇÕES:
                
                1- Consultar saldo
                2- Receber valor
                3- Transferência
                4- Sair
                """);
                operacao= scanner.nextInt();
                switch (operacao){
                    case 1:
                        System.out.println(String.format("Seu saldo atual é: %.3f", saldo));
                        break;
                    case 2:
                        System.out.println("Digite o valor recebido: ");
                        double recebido= scanner.nextDouble();
                        saldo+=recebido;
                        System.out.println("Saldo atualizado com sucesso!");
                        break;
                    case 3:
                        System.out.println("Digite o valor que deseja Transferir: ");
                        double transferencia= scanner.nextDouble();
                        if (transferencia<saldo){
                            saldo-=transferencia;
                            System.out.println("Saldo atualizado com sucesso!");
                        } else if (transferencia>saldo) {
                            System.out.println("Você não possui saldo o suficiente para esta transação");
                        }
                        break;
                    case 4:
                        System.out.println("Processo finalizado com sucesso, obrigado por utilizar nosso produto!");
                        break;
                }
            }



        }
    }
}
