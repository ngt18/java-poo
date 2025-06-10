package atrec;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 30, "Gerente");
        Funcionario funcionario1 = new Funcionario("Maria", 25, "Analista");

        System.out.println(funcionario);
        System.out.println("--------------------");
        System.out.println(funcionario1);
    }
}
