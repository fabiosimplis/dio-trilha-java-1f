import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner leituraTerminal = new Scanner(System.in);
        
        System.out.println("Por favor digite o numero da agência: ");
        int agencia = leituraTerminal.nextInt();

        System.out.println("Por favor digite o numero da conta: ");
        String conta = leituraTerminal.next();

        System.out.println("Por favor digite o seu nome: ");
        String nome = leituraTerminal.next();
        leituraTerminal.nextLine();

        System.out.println("Por favor digite o seu saldo: ");
        float saldo = leituraTerminal.nextFloat();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo R$%.2f já está disponível para saque.\n", nome, agencia, conta, saldo);
    }
}
