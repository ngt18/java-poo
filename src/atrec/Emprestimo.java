package atrec;

public class Emprestimo {
    private String dataEmprestimo;
    private int numeroParcelas;

    public Emprestimo(String dataEmprestimo, int numeroParcelas) {
        this.dataEmprestimo = dataEmprestimo;
        this.numeroParcelas = numeroParcelas;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public String toString() {
        return "Data do Empréstimo: " + dataEmprestimo + "\nNúmero de Parcelas: " + numeroParcelas;
    }
}
