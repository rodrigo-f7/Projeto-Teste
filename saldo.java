import java.util.Scanner;

public class saldo {
    public static void main(String[] args){ //Por que esses zeros todos?
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o saldo de sua conta: ");
        float saldo = entrada.nextFloat();
        System.out.printf("Seu saldo atual é: %f \n", saldo);
        System.out.println("Sacar quanto?");
        int saque = entrada.nextInt();
        saldo -= saque;
        System.out.printf("Seu saldo final é: %f", saldo);
        entrada.close();

    }
}
