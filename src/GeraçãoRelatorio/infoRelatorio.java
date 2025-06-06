package GeraçãoRelatorio;

import java.util.ArrayList;

public class infoRelatorio {
    public static void main (String[] args) {
        ArrayList<Relatorio> listaRelatorios = new ArrayList<>();

        listaRelatorios.add(new RelatorioVendas("Relatório de Vendas", "01/01/2023", 15000.00));
        listaRelatorios.add(new RelatorioFinanceiro("Relatório Financeiro", "01/01/2023", 5000.00));
        listaRelatorios.add(new RelatorioEstoque("Relatório de Estoque", "01/01/2023", 200));



        for (Relatorio Relatorio : listaRelatorios) {
            System.out.println(Relatorio.GerarConteudo());
            System.out.println(Relatorio.imprimir());

        }
    }
}
