 /*
 Programa que digita um número e eleva ele ao quadrado:


 */ 
import java.util.Scanner;

 class arquivo{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = entrada.nextInt();

        int r = num1*num2;
        
        System.out.println("O número " + num1 + " multiplicado por " + num2 + " é igual a " + r);
        entrada.close();

    }
}