package tarefas;

public class praticando {
    static void main(String[] args) {
//        1- casting
//        2-concatenar
//        3-mercadinho
//        4-conversao real em dolar
//        5-desconto


//        ------------------------1--------------------------

        double num1=5.4;
        int numFinal= (int) (num1);
        System.out.println(numFinal);

//        ------------------------2--------------------------

        char letra= 'a';
        String palavra= "câmer";

        System.out.println(palavra+letra);

//        ------------------------3--------------------------

        double precoProduto=33.50;
        int quantidade=5;
        System.out.println(precoProduto*quantidade);

//        ------------------------4--------------------------

        double valorEmDolares= 50;
        double dolarEmReal= 4.94;
        double convertido= valorEmDolares*dolarEmReal;
        System.out.println(String.format("o valor de U$%.2f em reais é R$%.2f", valorEmDolares, convertido));

//        ------------------------5--------------------------

        double precoOriginal=46;
        double percentualDesconto= 4;
        double desconto= (percentualDesconto/100)*precoOriginal;
        double valorFinalDoProduto= precoOriginal-desconto;
        System.out.println("Seu produto recebeu um desconto de "+percentualDesconto+"%, portanto o valor atual do produto passou de "+precoOriginal+" para "+valorFinalDoProduto);




    }
}
