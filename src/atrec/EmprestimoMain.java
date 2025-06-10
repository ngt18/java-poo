package atrec;

public class EmprestimoMain {
    public static void main(String[] args) {
        Emprestimo emprestimo1 = new Emprestimo("11/09/2001", 1000);
        Emprestimo emprestimo2 = new Emprestimo("01/08/2004", 2000);
        Emprestimo emprestimo3 = new Emprestimo("05/01/2004", 2032);
        Emprestimo emprestimo4 = new Emprestimo("06/03/2004", 2500);

        System.out.println(emprestimo1);
        System.out.println("--------------------");
        System.out.println(emprestimo2);
        System.out.println("--------------------");
        System.out.println(emprestimo3);
        System.out.println("--------------------");
        System.out.println(emprestimo4);

    }
}
