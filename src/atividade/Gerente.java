package atividade;

public class Gerente extends Funcionario {
    private int projetosGerenciados;

    public Gerente(String nome, double salarioBase, int projetosGerenciados) {
        super(nome, salarioBase);
        this.projetosGerenciados = projetosGerenciados;
    }

    public int getProjetosGerenciados() {
        return projetosGerenciados;
    }

    public void setProjetosGerenciados(int projetosGerenciados) {
        this.projetosGerenciados = projetosGerenciados;
    }

    @Override
    public double calcularBonus() {
        return this.getSalarioBase() * 0.15;
    }
}
