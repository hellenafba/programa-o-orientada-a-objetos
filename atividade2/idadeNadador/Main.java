import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador:");
        int idade = scanner.nextInt();

        String categoria;

        if (idade <=7){
            categoria = "Infantil A";
        }else if (idade >= 8 && idade <= 10){
            categoria = "Infantil B";
        }else if (idade >= 11 && idade <= 13){
            categoria = "Juvenil A";
        }else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        }else{
            categoria = "Sênior";
        }
        
        System.out.println("Categoria: "+ categoria);

        scanner.close();

    }
}
