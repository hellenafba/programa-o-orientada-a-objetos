public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("09099","João" ,1000.0);
        ContaBancaria conta2 = new ContaBancaria("484848","Maria", 500.0);

        conta1.depositar(200.0);
        conta1.sacar(150.0);
        System.out.println("Saldo da conta1: " + conta1.consultarSaldo());

        conta2.depositar(300.0);
        conta2.sacar(100.0);
        System.out.println("Saldo da conta2: " + conta2.consultarSaldo());
    }
}
