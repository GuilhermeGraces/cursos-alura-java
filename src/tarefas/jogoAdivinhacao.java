package tarefas;

import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    static void main(String[] args) {
//        Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

        int numeroAleatorio= new Random().nextInt(100);
        System.out.println(numeroAleatorio);
        Scanner scanner= new Scanner(System.in);
        int tentativas= 0;

        System.out.println("JOGO DE ADIVINHAÇÃO");

        while(tentativas<=5){
            System.out.println("Chute um número de 1 a 100: ");
            int palpite= scanner.nextInt();
            if (palpite==numeroAleatorio){
                System.out.println("Você acertou, meus parabéns!");
                break;
            }else if (tentativas==5 && palpite != numeroAleatorio){
                System.out.println("Não foi dessa vez. Mais sorte na próxima tentativa!");
            }
            tentativas++;

        }
    }
}
