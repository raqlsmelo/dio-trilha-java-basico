import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoConta;
        int numeroConta;
        String agenciaConta;
        String nomeClienteConta; 
        
        
        
        System.out.println("Por favor, digite o número da Agência !");
        numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da conta !");
        agenciaConta = scanner.next();
        System.out.println("Por favor, digite seu nome !");
        nomeClienteConta = scanner.next();
        System.out.println("Por favor, digite seu saldo !");
        saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeClienteConta + " obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque!");




    }
}
