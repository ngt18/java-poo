package calculadorageometrica;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Bem vindo ao Sistema de Calculadora de Formas Geometricas");
            System.out.println("Qual forma você deseja usar?");
            System.out.println(
                    "Opções: \n" +
                            "0. Sair \n" +
                            "1. Quadrado\n" +
                            "2. Retângulo\n" +
                            "3. Circulo\n");
            opcao = sc.nextInt();

            FormaGeometrica forma;

            switch (opcao) {
                case 0: {
                    System.out.println("Obrigado por usar o Sistema de Calculadora!");
                    break;
                }
                case 1: {

                    System.out.println("Digite a cor do quadrado: ");
                    String cor = sc.next();
                    System.out.println("Digite o lado do quadrado: ");
                    double lado = sc.nextDouble();

                    forma = new Quadrado(cor, lado);

                    int opcao2;
                    do {
                        opcao2 = menuCalculo();

                        retornoCalculos(opcao2, forma);
                    } while (opcao2 != 0);

                    break;
                }
                case 2: {

                    System.out.println("Qual a cor do retangulo: ");
                    String cor = sc.next();
                    System.out.println("Qual a largura do retangulo: ");
                    double largura = sc.nextDouble();
                    System.out.println("Qual a altura do retangulo: ");
                    double altura = sc.nextDouble();
                    System.out.println("Qual o comprimento do retangulo: ");
                    double comprimento = sc.nextDouble();

                    forma = new Retangulo(cor, largura, altura, comprimento);

                    int opcao2;
                    do {
                        opcao2 = menuCalculo();

                        retornoCalculos(opcao2, forma);
                    } while (opcao2 != 0);

                    break;
                }
                case 3: {
                    System.out.println("Qual a cor do circulo:");
                    String cor = sc.next();
                    System.out.println("Qual o raio do circulo: ");
                    double raio = sc.nextDouble();

                    forma = new Circulo(cor, raio);
                    int opcao2;
                    do {
                        opcao2 = menuCalculo();

                        retornoCalculos(opcao2, forma);
                    } while (opcao2 != 0);

                }
            }
        }while (opcao != 0);
    }

    static public int menuCalculo(){
        System.out.println("Qual calculo deseja fazer?");
        System.out.println("Opções: \n"
                + "0. Voltar \n"
                + "1. Perimetro\n"
                + "2. Area\n"
                + "3. Volume\n");
        return sc.nextInt();
    }
    static public void retornoCalculos(int opcao , FormaGeometrica forma){
        if (opcao < 0 || opcao > 3) {
            System.out.println("Opção Invalida!");
        }
        switch (opcao) {
            case 1: {
                System.out.println("Perimetro: " + forma.calculaPerimetro());
                break;
            }
            case 2: {
                System.out.println("Area: " + forma.calcularArea());
                break;
            }
            case 3: {
                System.out.println("Volume: " + forma.calculaVolume());
                break;
            }
        }


    }
}
