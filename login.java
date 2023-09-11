import java.util.Scanner;

public class login {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //Login de um usuário
        System.out.println("Login: ");
        String login = entrada.nextLine();
        System.out.printf("Seu login foi: %s \n", login);
        System.out.println("Senha: ");
        String senha = entrada.nextLine();
        System.out.printf("Sua senha foi: %s", senha);
        entrada.close();
    }
}
