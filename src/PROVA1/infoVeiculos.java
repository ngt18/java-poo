package PROVA1;

import java.util.Scanner;
import java.util.ArrayList;

public class infoVeiculos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Transporte> lista = new ArrayList<>();

        String nome; int velocidadeMaxima; int autonomia; String tipoDeCombustivel;

        System.out.println("Carro");
        System.out.print("Digite o nome do carro: ");
        nome = sc.nextLine();
        System.out.print("Digite o velocidade maxima: ");
        velocidadeMaxima = sc.nextInt();
        System.out.print("Digite a autonomia do veiculo: ");
        autonomia = sc.nextInt();
        System.out.print("digite o tipo de combustivel: ");
        tipoDeCombustivel = sc.next();

        lista.add(new Carro(nome,velocidadeMaxima,autonomia,tipoDeCombustivel));

        System.out.println("Moto");
        System.out.print("Digite o nome da moto: ");
        nome = sc.next();
        System.out.print("Digite o velocidade maxima: ");
        velocidadeMaxima = sc.nextInt();
        System.out.print("Digite a autonomia do veiculo: ");
        autonomia = sc.nextInt();
        System.out.print("digite o tipo de combustivel: ");
        tipoDeCombustivel = sc.next();

        lista.add(new Moto(nome,velocidadeMaxima,autonomia,tipoDeCombustivel));

        System.out.println("Onibus");
        System.out.print("Digite o nome do onibus: ");
        nome = sc.next();
        System.out.print("Digite o velocidade maxima: ");
        velocidadeMaxima = sc.nextInt();
        System.out.print("Digite a autonomia do veiculo: ");
        autonomia = sc.nextInt();
        System.out.print("digite o tipo de combustivel: ");
        tipoDeCombustivel = sc.next();

        lista.add(new Onibus(nome,velocidadeMaxima,autonomia,tipoDeCombustivel));

        System.out.println("Bicicleta");
        System.out.print("Digite o nome da bicicleta: ");
        nome = sc.next();
        System.out.print("Digite o velocidade maxima: ");
        velocidadeMaxima = sc.nextInt();
        System.out.print("Digite a autonomia do veiculo: ");
        autonomia = sc.nextInt();
        System.out.print("digite o tipo de combustivel: ");
        tipoDeCombustivel = sc.next();

        lista.add(new Bicicleta(nome,velocidadeMaxima,autonomia,tipoDeCombustivel));

        for (Transporte t : lista) {
            t.mover();
            t.parar();
            t.exibirInformacoes();
        }
    }
}
