package atrec;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 12345, 7);
        Aluno aluno1 = new Aluno("Maria", 67890, 9);
        Aluno aluno2 = new Aluno("Pedro", 11223, 8);
        Aluno aluno3 = new Aluno("Ana", 44556, 10);

        System.out.println(aluno);
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);

    }
}
