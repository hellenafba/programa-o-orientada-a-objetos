import java.util.Scanner;

public class ValoresInteiros {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o valor inteiro #" + i + ": ");
            int valor = scanner.nextInt();

            if (valor < 10) {
                System.out.println("Valor Menor que 10");
            }
        }

        scanner.close();
    }
}
