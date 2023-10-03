import java.util.Scanner;

public class TestesDesafios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        

        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + valor);
        } else if (valor < 0) {
            //TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        } else {
             //TODO: Imprimir a mensagem de encerrar o programa.
             System.out.println("Encerrando o programa...");
        }
    scanner.close();    
    }
}