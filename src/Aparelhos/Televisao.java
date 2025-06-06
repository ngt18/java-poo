package Aparelhos;

public class Televisao extends DispositivoEletronico{
    private String tamaanhoPolegadas;

    public Televisao(String marca, String modelo, boolean ligado, String tamaanhoPolegadas) {
        super(marca, modelo, ligado);
        this.tamaanhoPolegadas = tamaanhoPolegadas;
    }

    public String getTamaanhoPolegadas() {
        return tamaanhoPolegadas;
    }

    public void setTamaanhoPolegadas(String tamaanhoPolegadas) {
        this.tamaanhoPolegadas = tamaanhoPolegadas;
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
        return "Seu monitor tem " + tamaanhoPolegadas + " polegadas.";
    }
}
