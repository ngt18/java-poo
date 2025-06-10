package CursosOnline;

public class ArtigoTexto extends ConteudoCurso {
    private int numeroPaginas;

    public ArtigoTexto(String titulo, int duracaoMinutos, int numeroPaginas) {
        super(titulo, duracaoMinutos);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String visualizar() {
        return "Lendo artigo com "+ numeroPaginas +" páginas.";
    }

    @Override
    public String obterTipo() {
        return "Artigo";
    }

    @Override
    public String exibirDetalhes() {
        return "Titulo: "+ getTitulo()+
                "\nDuração: " + getDuracaoMinutos() + "Minutos" +
                "\nQuantidade paginas; " + numeroPaginas;
    }
}


