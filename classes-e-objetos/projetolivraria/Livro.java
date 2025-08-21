public class Livro {
    String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;

    public void cadastrar(){
        System.out.println("Cadastrando no banco de dados...");
    }

    public double calcFrete(String cep){
        System.out.println("Calculando frete para o cep "+ cep);
        return 10.0 + (numeroPaginas * 0.05);
    }

    public void vender (){
        System.out.printf("Vendendo livro por R$%.2f",preco );
    }
    public void  envio(){
        System.out.println("Livro enviado com sucesso!");
    }
}
