package Aparelhos;
import java.util.ArrayList;
public class infoDispositivo {
    public static void main(String[] args) {
        ArrayList<DispositivoEletronico> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisao("Samsung", " QLED", true, "55"));
        listaDispositivos.add(new Smartphone("Apple", " iPhone 14", false, "iOS"));
        listaDispositivos.add(new Notebook("Dell", " Inspiron 15", true, 16));

        for (DispositivoEletronico dispositivo : listaDispositivos) {
            System.out.println("Ligar: " + dispositivo.ligar());
            System.out.println("Função Principal: " + dispositivo.executarFuncaoPrincipal());
            System.out.println("Status: " + dispositivo.exibitStatus());
            System.out.println("Desligar: " + dispositivo.desligar());
            System.out.println("Função Principal: " + dispositivo.executarFuncaoPrincipal());
            /*System.out.println("Marca: " + dispositivo.getMarca());
            System.out.println("Modelo: " + dispositivo.getModelo());
            System.out.println("Ligado: " + dispositivo.estaLigado());*/

            System.out.println("---------------------------------");
        }
    }
}
