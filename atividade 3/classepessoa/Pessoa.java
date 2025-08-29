public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alice", 10);
        Pessoa pessoa2 = new Pessoa("Carlos", 12);

        System.out.println("Pessoa 1:\nNome = " + pessoa1.nome + "\nIdade = " + pessoa1.idade);
        System.out.println("Pessoa 2:\nNome = " + pessoa2.nome + "\nIdade = " + pessoa2.idade);

    }
}