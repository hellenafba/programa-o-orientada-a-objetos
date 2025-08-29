import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Números menores que " + numero + " em ordem decrescente:");

        for (int i = numero - 1; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    } 
}
