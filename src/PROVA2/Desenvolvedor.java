package PROVA2;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, String cpf, double salarioBase){
        super(nome, cpf, salarioBase);
    }

    @Override
    public void exibirCargo() {
        System.out.println("Desenvolvedor");
    }

    @Override
    public void calcularBonus() {
        double bonus = getSalarioBase() * 1.15;
        System.out.println("O salario apos o bonus sera de: " + bonus);

    }
}
