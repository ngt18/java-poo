package Aparelhos;

public class Televisao extends DispositivoEletronico{
    private String tamanhoPolegadas;

    public Televisao(String marca, String modelo, boolean ligado, String tamanhoPolegadas) {
        super(marca, modelo, ligado);
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public String getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(String tamanhoPolegadas) {
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    @Override
    public String executarFuncaoPrincipal() {
        if (isLigado()) {
            return "Trocando de canal na televisão.";
        } else {
            return "Não é possivel trocar de televisão, televisão desligada.";
        }
    }

    @Override
    public String exibitStatus() {
        return "Seu monitor tem " + tamanhoPolegadas + " polegadas.";
    }
}
