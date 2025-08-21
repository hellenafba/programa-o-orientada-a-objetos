public class Aluno {
    private String nome;
    private int matricula;
    private double notaAv1;
    private double notaAv2;

    public Aluno(String nome, int matricula, double notaAv1, double notaAv2) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + notaAv1);
        System.out.println("Nota AV2: " + notaAv2);
    }

    public double calcularMedia() {
        return (notaAv1 + notaAv2) / 2.0;
    }

    public boolean verificarAprovacao() {
        double media = calcularMedia();
        // Regra UNAMA: média >= 7 aprovado
        if (media >= 7.0) {
            System.out.println("Aprovado! Média: " + media);
            return true;
        } else {
            System.out.println("Reprovado. Média: " + media);
            return false;
        }
    }

    public void setNotaAv1(double notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public void setNotaAv2(double notaAv2) {
        this.notaAv2 = notaAv2;
    }
}
