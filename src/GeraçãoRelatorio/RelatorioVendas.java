package GeraçãoRelatorio;

public class RelatorioVendas extends Relatorio{
    private double TotalVendas;

    public RelatorioVendas(String titulo, String dataGeracao, double totalVendas) {
        super(titulo, dataGeracao);
        this.TotalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return TotalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        TotalVendas = totalVendas;
    }

    @Override
    public String imprimir() {
        return "";
    }

    @Override
    public String GerarConteudo() {
        return "";
    }
}
