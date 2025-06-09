package Aparelhos;

public abstract class DispositivoEletronico {
    private String Marca;
    private String Modelo;
    private boolean Ligado = false;

    public DispositivoEletronico(String Marca, String Modelo, boolean Ligado) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ligado = Ligado;

    }

    public DispositivoEletronico(){}

    public abstract String executarFuncaoPrincipal ();
    public abstract String exibitStatus();

    public String ligar(){
        this.Ligado = true;
        return "Dispositivo " + Marca + Modelo +" ligado ";
    }
    public String desligar(){
        this.Ligado = false;
        return "Dispositivo " + Marca + Modelo +" desligado ";
    }
    public boolean estaLigado() {
        return this.Ligado;
    }



    private String getModelo() {
        return Modelo;
    }

    private void setModelo(String modelo) {
        Modelo = modelo;
    }

    private String getMarca() {
        return Marca;
    }

    private void setMarca(String marca) {
        Marca = marca;
    }

    public boolean isLigado() {
        return Ligado;
    }

    private void setLigado(boolean ligado) {
        Ligado = ligado;
    }
    private void getLigado(boolean ligado) {
        Ligado = ligado;
}
}
