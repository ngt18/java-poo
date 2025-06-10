package CursosOnline;

public class Quiz extends ConteudoCurso {
    private int numeroQuestoes;

    public Quiz(String titulo, int duracaoMinutos, int numeroQuestoes) {
        super(titulo, duracaoMinutos);
        this.numeroQuestoes = numeroQuestoes;
    }

    public int getNumeroQuestoes() {
        return numeroQuestoes;
    }

    public void setNumeroQuestoes(int numeroQuestoes) {
        this.numeroQuestoes = numeroQuestoes;
    }

    @Override
    public String visualizar() {
        return "Iniciado quiz com "+ numeroQuestoes + " questões.";
    }

    @Override
    public String obterTipo() {
        return "Quiz";
    }

    @Override
    public String exibirDetalhes() {
        return "Titulo: "+ getTitulo()+
               "\nDuração: " + getDuracaoMinutos() + " Minutos" +
               "\nQuestões: " + numeroQuestoes + " Questões";
    }
}
