package atrec;

public class Aluno {
    private String nome;
    private int matricula;
    private int notaFinal;

    public Aluno(String nome, int matricula, int notaFinal){
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "nome: "+ nome + "Matricula: "+ matricula + ", nota final: " + notaFinal;
    }
}
