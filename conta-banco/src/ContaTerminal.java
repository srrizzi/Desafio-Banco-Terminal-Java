import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, informe o numero da conta que deseja acessar:");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.println("Agora, insira a Agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
