// Classe Livro
public class Livro {
    // Atributos privados
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;  // inicia como disponível
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // Método para emprestar o livro
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println(titulo + " emprestado com sucesso.");
        } else {
            System.out.println(titulo + " não está disponível para empréstimo.");
        }
    }

    // Método para devolver o livro
    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println(titulo + " devolvido com sucesso.");
        } else {
            System.out.println(titulo + " já está disponível na biblioteca.");
        }
    }
}
