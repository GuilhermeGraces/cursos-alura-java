public class Condicional {
    static void main(String[] args) {
        int anoDeLancamento= 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "VIP Plus";

        if(anoDeLancamento>2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        }else{
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if(incluidoNoPlano== true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }

//        switch case

        switch (tipoPlano){
            case "plus":
                System.out.println("seu plano é Plus");
                break;
            case "VIP":
                System.out.println("Seu plano é VIP");
                break;
            case "VIP Plus":
                System.out.println("Seu plano é VIP Plus");
                break;
            default:
                System.out.println("Você não possui um plano");
        }

    }
}
