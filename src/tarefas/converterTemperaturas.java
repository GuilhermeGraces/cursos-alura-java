package tarefas;

public class converterTemperaturas {
    static void main(String[] args) {
        double celsius= 22.5;
        double fahrenheit= (celsius*1.8)+32;
        System.out.println("temperatura em celsius: "+celsius+" temperatura em Fahrenheit: "+fahrenheit);

        int fahrenheitInteiro= (int) (fahrenheit);
        System.out.println("A temperatura em Fahrenheit em numero inteiro é: "+fahrenheitInteiro);
    }
}
