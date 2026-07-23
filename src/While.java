import java.util.Scanner;

public class While {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas=0;
        double nota=0;
        int quantidadeNotas=0;

        while (nota!=-1){
            System.out.println("Digite sua avaliação para o filme ou tecle -1 para encerrar: ");
            nota= scanner.nextDouble();
            if (nota>=0){
                somaNotas+=nota;
                quantidadeNotas++;
            }
        }

        double mediaResultado=somaNotas/quantidadeNotas;
        System.out.println(String.format("A média das notas que foram inseridas ao sistema é: %.2f", mediaResultado));

    }
}
