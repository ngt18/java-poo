package atrec;

public class LivroMain {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro1 = new Livro("O Guarani", "José de Alencar", 1857);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);

        System.out.println(livro);
        System.out.println(livro1);
        System.out.println(livro2);
    }
}
