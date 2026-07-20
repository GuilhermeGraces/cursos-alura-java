public class Main {

    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento= 2022;
        System.out.println("Ano de lançamento é: "+anoDeLancamento);

        boolean incluidoNoPlano= true;

        double nota= 8.1;

        String sinopse = """
                Filme Top Gun
                Filme de aventura
                Muito bom!
                Ano de lançamento:
                """+anoDeLancamento;

        //utilizando format
//
//        String nome= "gui";
//        int idade = 18;
//        double valor = 55.999;
//
//        System.out.println(String.format("Meu nome é %s, eu tengo %d anos e hoje gastei %.2f reais", nome, idade, valor));

        double media= (9.9+3.3+8.0)/3;
        System.out.println(media);
        System.out.println(sinopse);


        int classificacao;
        classificacao= (int) (media/2);
        System.out.println(classificacao);
    }

}

