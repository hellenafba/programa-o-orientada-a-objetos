public class ContaBancaria {
    //atributos privados
    private int numeroConta;
    private double saldo;
    //construtor
    public ContaBancaria(int numeroConta,double saldoInicial){
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }
    //Método para depositar valor
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }else{
            System.out.println("Valor de depósito inválido.");
        }

    }
    //Método para sacar valor se saldo for insuficênte

    public void sacar(double valor){
        if(valor > 0){
            if(saldo >= valor){
                saldo -= valor;
            } else{
                System.out.println("Saldo insuficiênte para saque.");
            }
        }else{
            System.out.println("Valor de saque inválido.");
        }
    }
    //Getter para saldo
    public double getSaldo(){
        return saldo;
    }
    //Método main para testar
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(123344, 1000.0);

        conta.depositar(500.0);
        System.out.println("Saldo após depósito: "+ conta.getSaldo());

        conta.sacar(200.0);
        System.out.println("Saldo após saque: "+ conta.getSaldo());

        conta.sacar(2000.0);//saque insuficiênte
    }

}
