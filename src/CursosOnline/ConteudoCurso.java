package CursosOnline;

public abstract class ConteudoCurso {
    private String titulo;
    private int duracaoMinutos;

    public ConteudoCurso(String titulo, int duracaoMinutos) {
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
    }
    private ConteudoCurso() {}

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    private void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos < 0) {
            System.out.println("A duração não pode ser negativa.");
            return;
        }
        this.duracaoMinutos = duracaoMinutos;
    }

    public abstract String visualizar();
    public abstract String obterTipo();
    public abstract String exibirDetalhes();
}
