package animalestimacao;

import java.util.ArrayList;

public class infoAnimais {
    public static void main(String[] args) {
        ArrayList<animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(new cachorro("Bob", 5, "Pitbull"));
        listaAnimais.add(new gato("Mimi", -3, "Preto"));
        listaAnimais.add(new passaro("Piu", 2, "Amarelo"));

        for (animal animal : listaAnimais) {
            System.out.println("Som: " + animal.emitirSom());
            System.out.println("Comida: " + animal.comer());
            System.out.println("Informacoes: "+animal.exibitInformacoes());

            if (animal.getIdade() == 0){
                System.out.println("Idade não pode ser negativa. Definindo idade como 0.");
            }
            System.out.println(" --------------------------------- ");
        }
    }
}