package GeraçãoRelatorio;

public class RelatorioFinanceiro extends Relatorio {
    private double SaldoAtual;

    public RelatorioFinanceiro(String titulo, String dataGeracao, double saldoAtual) {
        super(titulo, dataGeracao);
        this.SaldoAtual = saldoAtual;
    }

    public double getSaldoAtual() {
        return SaldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        SaldoAtual = saldoAtual;
    }

    @Override
    public String imprimir() {
        return "Titulo: " + getTitulo() + "\n" +
                "Data de Geração: " + getDataGeracao() + "\n" +
                "Saldo Atual: R$" + SaldoAtual + "\n";
    }

    @Override
    public String GerarConteudo() {
        return "Relatório Financeiro: Saldo atual: "+ SaldoAtual;
    }

}
