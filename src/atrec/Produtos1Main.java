package atrec;

public class Produtos1Main {
    public static void main(String[] args) {
        Produtos1 produto = new Produtos1("Arroz", " branco",20);
        Produtos1 produto1 = new Produtos1("Feijão", "preto", 10);
        Produtos1 produto2 = new Produtos1("Macarrão", "espaguete", 5);
        Produtos1 produto3 = new Produtos1("Azeite", "extra virgem", 30);
        System.out.println(produto);
        System.out.println("--------------------");
        System.out.println(produto1);
        System.out.println("--------------------");
        System.out.println(produto2);
        System.out.println("--------------------");
        System.out.println(produto3);
        System.out.println("--------------------");
    }
}
