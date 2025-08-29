public class Biblioteca {
    private Livro[] livros;
    private int contador;

    // Construtor inicializa vetor e contador
    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        contador = 0;
    }

    // Adiciona livro se houver espaço
    public void adicionarLivro(Livro livro) {
        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
            System.out.println(livro.getTitulo() + " adicionado na biblioteca.");
        } else {
            System.out.println("Biblioteca cheia, não é possível adicionar " + livro.getTitulo());
        }
    }

    // Empresta livro pelo título se disponível
    public void emprestarLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                livros[i].emprestar();
                return;
            }
        }
        System.out.println("Livro " + titulo + " não encontrado.");
    }

    // Devolve livro pelo título
    public void devolverLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                livros[i].devolver();
                return;
            }
        }
        System.out.println("Livro " + titulo + " não encontrado.");
    }

    // Mostra todos os livros e seu estado
    public void mostrarLivros() {
        System.out.println("\nEstado dos livros na biblioteca:");
        for (int i = 0; i < contador; i++) {
            String estado = livros[i].isDisponivel() ? "Disponível" : "Emprestado";
            System.out.println("- " + livros[i].getTitulo() + " (" + estado + ")");
        }
        System.out.println();
    }

    // Método main para testar
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        Livro livro3 = new Livro("1984", "George Orwell");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.mostrarLivros();

        biblioteca.emprestarLivro("1984");
        biblioteca.mostrarLivros();

        biblioteca.devolverLivro("1984");
        biblioteca.mostrarLivros();
    }
}