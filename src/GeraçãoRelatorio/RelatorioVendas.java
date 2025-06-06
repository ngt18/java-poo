package GeraçãoRelatorio;

public class RelatorioVendas extends Relatorio{
    private double TotalVendas = 6000.00;

    public RelatorioVendas(String titulo, String dataGeracao, double TotalVendas) {
        super(titulo, dataGeracao);
        this.TotalVendas = TotalVendas;
    }

    public double getTotalVendas() {
        return TotalVendas;
    }

    public void setTotalVendas(double TotalVendas) {
        this.TotalVendas = TotalVendas;
    }

    @Override
    public String imprimir() {
        return "Titulo: "+ getTitulo() + "\n" +
                "Data de Geração: " +getDataGeracao()+ "\n" +
                "Total de Vendas: R$" + TotalVendas + "\n";
    }

    @Override
    public String GerarConteudo() {
        return "Relatório de Vendas: Total vendido: R$" + TotalVendas;
    }
}
