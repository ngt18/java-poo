package CursosOnline;

public abstract class ConteudoCurso {
    private String titulo;
    private int duracaoMinutos;

    public ConteudoCurso(String titulo, int duracaoMinutos) {
        this.titulo = titulo;
        setDuracaoMinutos(duracaoMinutos);
    }
    private ConteudoCurso() {}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public abstract String visualizar();
    public abstract String obterTipo();
    public abstract String exibirDetalhes();
}
