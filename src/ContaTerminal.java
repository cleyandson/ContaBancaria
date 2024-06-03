import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Capitals Finance! Vamos criar sua conta.");

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o numero da Agência: ");
        String numAgencia = scanner.nextLine();

        System.out.println("Por favor, informe o saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua Agência é " + numAgencia + ", Conta " + numConta + " e seu Saldo de R$" + saldo + " já está disponível para saque.");
    }
}
