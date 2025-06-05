package atividade;

import java.util.ArrayList;

public class Folhadepagamento {
    public static void main(String[] args) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(new Estagiario("Carlos",15000,100));
        listaFuncionarios.add(new Desenvolvedor("David",15000,"Python"));
        listaFuncionarios.add(new Gerente("Rafael", 45178390, 80));

        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.calcularBonus());
        }
    }
}
