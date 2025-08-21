

public class Main {
    public static void main(String[] args) {
        
        // Criação de dois objetos Aluno
        Aluno aluno1 = new Aluno("João Silva", 12345, 8.5, 6.0);
        Aluno aluno2 = new Aluno("Maria Souza", 67890, 7.0, 5.5);

        // Exibição dos dados dos alunos
        aluno1.mostrarDados();
        aluno2.mostrarDados();

        // Atualização da nota do aluno2
        aluno2.setNotaAv1(8.0);

        // Exibição dos dados atualizados do aluno2
        aluno2.mostrarDados();

        // Verificação de aprovação dos alunos
        aluno1.verificarAprovacao();
        aluno2.verificarAprovacao();


        
    }
}
