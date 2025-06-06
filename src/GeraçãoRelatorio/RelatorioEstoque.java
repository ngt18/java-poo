package GeraçãoRelatorio;

public class RelatorioEstoque extends Relatorio {
    private int itensEmEstoque;

    public RelatorioEstoque(String titulo, String dataGeracao, int itensEmEstoque) {
        super(titulo, dataGeracao);
        this.itensEmEstoque = itensEmEstoque;
    }

    public int getItensEmEstoque() {
        return itensEmEstoque;
    }

    public void setItensEmEstoque(int itensEmEstoque) {
        this.itensEmEstoque = itensEmEstoque;
    }

    @Override
    public String imprimir() {
        return "Titulo" +getTitulo() + "\n" +
                "Data de Geração: " +getDataGeracao() + "\n" +
                "Itens em Estoque: " + itensEmEstoque + "\n";
    }

    @Override
    public String GerarConteudo() {
        return "Relatório de Estoque: " + itensEmEstoque + " itens disponíveis.";
    }


}
