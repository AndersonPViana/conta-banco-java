import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo do cliente: ");
        double saldo = scanner.nextDouble();

        System.out.println("===================");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " 
        + agencia + ", conta " + numeroConta +" e seu saldo "+ saldo +" ja esta disponivel para saque");
    }
}
