import java.util.Scanner;

public class app {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = entrada.nextLine();
        System.out.println("Seu nome é: " + nome);
        entrada.close();
    }
}
