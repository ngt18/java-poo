package PROVA2;

public class Administrativo extends Funcionario{

    public Administrativo(String nome, String cpf, double salarioBase){
        super(nome, cpf, salarioBase);
    }

    @Override
    public void exibirCargo() {
        System.out.println("Administrativo");
    }

    @Override
    public void calcularBonus() {
        double bonus = getSalarioBase() * 1.10;
        System.out.println("O salario apos o bonus sera de: " + bonus);

    }
}
