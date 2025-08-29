import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite o número inteiro #" + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                soma += numero;
            }
        }

        System.out.println("Soma dos números pares: " + soma);

        scanner.close();
    }
}
