import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo! informe o seu nome completo");
        String nome = sc.nextLine();
        System.out.println("Digite o número da agência");
        String agencia = sc.next();
        System.out.println("Informe o número da sua conta");
        int conta = sc.nextInt();
        double saldo = 237.48;
        System.out.println(String.format("Bem vindo %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo disponível para saque é: %.2f", nome, agencia, conta, saldo));
        
    }
}
