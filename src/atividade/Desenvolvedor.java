package atividade;

public class Desenvolvedor extends Funcionario {
   private String linguagemPreferida;

    public Desenvolvedor(String nome, double salarioBase, String linguagemPreferida) {
        super(nome, salarioBase);
        this.linguagemPreferida = linguagemPreferida;
    }

    public String getLinguagemPreferida() {
        return linguagemPreferida;
    }

    public void setLinguagemPreferida(String linguagemPreferida) {
        this.linguagemPreferida = linguagemPreferida;
    }
    @Override
    public double calcularBonus() {
        return this.getSalarioBase() * 0.1;
    }
}
