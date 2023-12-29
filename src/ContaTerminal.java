import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private float saldo;

    public void create() {
        System.out.println("[bem vindo ao banco Terminal!]\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o numero de sua conta:");
        this.numero = sc.nextInt();
        System.out.println("informe o numero de sua agência:");
        this.agencia = sc.next();
        System.out.println("informe o seu nome:");
        this.nomeCliente = sc.next();
        System.out.println("informe o seu saldo:");
        this.saldo = sc.nextFloat();
        this.exibe();

    }

    private void exibe() {
        System.out.printf(" Olá %s, obrigado por criar uma conta em nosso banco,\nsua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque.", this.nomeCliente, this.agencia, this.numero, this.saldo);

    }
}
