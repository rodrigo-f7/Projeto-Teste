import java.util.Scanner;

public class saldo {
    public static void main(String[] args){ //Por que esses zeros todos?
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o saldo de sua conta: ");
        int saldo = entrada.nextInt();
        System.out.printf("Seu saldo atual é: %d \n", saldo);

        System.out.println("Digite o seu nome:");
        String nome = entrada.next();
        System.out.printf("%s, esse é seu nome.\n", nome);

        System.out.println("Sacar quanto?"); 
        int saque = entrada.nextInt();
        saldo -= saque;
        System.out.printf("%s, seu saldo final é: %d", nome, saldo);
        entrada.close();

    }
}
