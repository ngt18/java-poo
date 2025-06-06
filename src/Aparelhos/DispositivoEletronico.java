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



    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public boolean isLigado() {
        return Ligado;
    }

    public void setLigado(boolean ligado) {
        Ligado = ligado;
    }
}
