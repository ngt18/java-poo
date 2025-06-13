package PROVA2;

public class SuporteTecnico extends Funcionario{

    public SuporteTecnico(String nome, String cpf, double salarioBase){
        super(nome, cpf, salarioBase);
    }

    @Override
    public void exibirCargo() {
        System.out.println("SuporteTecnico");
    }

    @Override
    public void calcularBonus() {
        double bonus = getSalarioBase() * 1.08;
        System.out.println("O salario apos o bonus sera de: " + bonus);

    }
}
