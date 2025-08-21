public class Cliente {
    String nome;
    String cpf;
    String endereco;

    public void cadastrar(){
        System.out.println("Cadastrando cliente no banco de dados...");
    }

    public void comprar (){
        System.out.println("Compra do cliente " + nome +" realizada com sucesso!");
    }
}