
public class Produto {
    private String nome;
    private double preco;
    
    //construtor
    public Produto(String nome, double preco){
        this.nome = nome;
        setPreco(preco);//usar setter para validação

    }

    public String getNome(){
        return nome;
    }

    public void SetNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if(preco >= 0){
            this.preco = preco;
        }else{
            System.out.println("Preço inválido.Não pode ser negativo.");
        }
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Caneta", 2.5);
        System.out.println("Produto 1: " + produto1.getNome() + ", Preço: " + produto1.getPreco());

        Produto produto2 = new Produto("Caderno", -10.0); // Tentativa de preço negativo no construtor
        System.out.println("Produto 2: " + produto2.getNome() + ", Preço: " + produto2.getPreco());

        produto2.setPreco(15.0); // Atribuição válida
        System.out.println("Produto 2 após ajuste: " + produto2.getNome() + ", Preço: " + produto2.getPreco());

        produto2.setPreco(-5.0); // Tentativa de atribuição inválida
        System.out.println("Produto 2 após tentativa inválida: " + produto2.getNome() + ", Preço: " + produto2.getPreco());
    }
}
