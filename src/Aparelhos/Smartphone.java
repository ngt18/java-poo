package Aparelhos;

public class Smartphone extends DispositivoEletronico {
    private String sistemaOperacional;

    public Smartphone(String marca, String modelo, boolean ligado, String sistemaOperacional) {
        super(marca, modelo, ligado);
        this.sistemaOperacional = sistemaOperacional;
    }


    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String executarFuncaoPrincipal() {
        if (this.isLigado()){
            return "Abrindo aplicativo no smartphone.";
        } else {
            return "Não é possível abrir aplicativo, smartphone desligado.";
        }
    }

    @Override
    public String exibitStatus() {
        return "Sistema Operacional: " + sistemaOperacional;
    }
}
