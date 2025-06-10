package atrec;

public class CarroMain {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Fiorino",2014);
        Carro carro1 = new Carro ("Chevrolet", "Onix", 2020);
        Carro carro2 = new Carro ("Volkswagen", "Gol", 2018);

        System.out.println(carro);
        System.out.println(carro1);
        System.out.println(carro2);
    }
}
