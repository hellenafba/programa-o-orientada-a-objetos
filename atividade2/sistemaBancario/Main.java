
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldo = 1000;
        int opcao;

        do {

            Scanner valor = new Scanner(System.in);

            System.out.print("------------------");
            System.out.print("    Bem vindo     ");
            System.out.println("------------------");

            System.out.println("Escolha a opção:  ");
            System.out.println("1-Sacar           ");
            System.out.println("2-Depositar       ");
            System.out.println("3-Ver saldo       ");
            System.out.println("0-Sair       ");
            

            opcao = valor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("------------------");
                    System.out.print("    Sacar    ");
                    System.out.println("------------------");

                    System.out.println("Valor que deseja sacar: ");
                    double saque = valor.nextFloat();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saldo realizado com sucesso!");
                    } else {
                        System.err.println("Saldo insuficiente!");
                    }

                    break;
                case 2:
                    System.out.print("------------------");
                    System.out.print("    Depositar    ");
                    System.out.println("------------------");
                    System.out.println("Digite valor de depósito: ");
                    double deposito = valor.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;

                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido");
                    }
                    break;
                case 3:
                    System.out.print("------------------");
                    System.out.print("    Ver Saldo    ");
                    System.out.println("------------------");
                    System.out.printf("Saldo atual: R$%.2f\n", saldo);
                    break;
                case 0:
                    System.out.print("------------------");
                    System.out.print("    Operação encerrada    ");
                    System.out.println("------------------");
                    break;
                default:
                     System.out.print("------------------");
                    System.out.print("    Operação inválida    ");
                    System.out.println("------------------");
                    break;

            }
        } while (opcao != 0);
    }

}