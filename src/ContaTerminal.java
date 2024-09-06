import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o número da conta: ");
            int accountNumber = scanner.nextInt();

            System.out.println("Digite o número da agência: ");
            String agencyNumber = scanner.next();

            System.out.println("Digite o nome do cliente: ");
            String clientName = scanner.next();

            System.out.println("Digite o saldo: ");
            double balance = scanner.nextDouble();

            System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencyNumber + ", conta " + accountNumber + "e seu saldo " + balance
                    + " já está disponível para saque");
        }

    }
}