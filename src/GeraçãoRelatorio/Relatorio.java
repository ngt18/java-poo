package GeraçãoRelatorio;

public abstract class  Relatorio {
    private String titulo;
    private String dataGeracao;

    public Relatorio(String titulo, String dataGeracao) {
        this.titulo = titulo;
        this.dataGeracao = dataGeracao;
    }

    public Relatorio(){

    }

    public abstract String GerarConteudo();
    public abstract String imprimir();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }
}
