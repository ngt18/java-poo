package PROVA2;

import PROVA1.Carro;
import PROVA1.Moto;
import PROVA1.Onibus;

import java.util.Scanner;
import java.util.ArrayList;

public class infoAlgo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Funcionario> listas = new ArrayList<>();

        String nome; String cpf; double salarioBase;

        System.out.println("Administrativo");
        System.out.print("Digite o nome do funcionario: ");
        nome = sc.next();
        System.out.print("Digite o cpf do funcionario: ");
        cpf = sc.next();
        System.out.print("Digite o salario base do funcionario: ");
        salarioBase = sc.nextDouble();

        listas.add(new Administrativo(nome,cpf,salarioBase));

        System.out.println("Desenvolvedor");
        System.out.print("Digite o nome do funcionario: ");
        nome = sc.next();
        System.out.print("Digite o cpf do funcionario: ");
        cpf = sc.next();
        System.out.print("Digite o salario base do funcionario: ");
        salarioBase = sc.nextDouble();

        listas.add(new Desenvolvedor(nome,cpf,salarioBase));

        System.out.println("Administrativo");
        System.out.print("Digite o nome do funcionario: ");
        nome = sc.next();
        System.out.print("Digite o cpf do funcionario: ");
        cpf = sc.next();
        System.out.print("Digite o salario base do funcionario: ");
        salarioBase = sc.nextDouble();

        listas.add(new SuporteTecnico(nome,cpf,salarioBase));

        for (Funcionario f : listas) {
            System.out.println("-------------------------");
            f.exibirCargo();
            f.calcularBonus();
            f.exibirInformacoes();
            System.out.println("-------------------------");
        }

    }
}
