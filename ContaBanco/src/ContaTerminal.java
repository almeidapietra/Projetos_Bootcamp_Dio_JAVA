import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        double saldo = 00.00;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite núumero da agência");
        String agencia = scanner.next();

        System.out.println("Digite o nome do Titular");
        String nomeCliente = scanner.next();


        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é: " +agencia + ", conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque.");

    }
}