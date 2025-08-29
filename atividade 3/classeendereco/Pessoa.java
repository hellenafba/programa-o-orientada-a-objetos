public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;
    private Endereco endereco;

    // Construtor
    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getNumero());
        System.out.println();
    }

    // Método main para testar
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", 100);
        Endereco endereco2 = new Endereco("Rua B", 200);

        Pessoa pessoa1 = new Pessoa("João", 30, endereco1);
        Pessoa pessoa2 = new Pessoa("Maria", 25, endereco2);

        pessoa1.mostrarDados();
        pessoa2.mostrarDados();
    }
}
