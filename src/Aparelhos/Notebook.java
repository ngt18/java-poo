package Aparelhos;

public class Notebook extends DispositivoEletronico {
    private int memoriaRAM;

    public Notebook(String marca, String modelo, boolean ligado, int memoriaRAM) {
        super(marca, modelo, ligado);
        this.memoriaRAM = memoriaRAM;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public String executarFuncaoPrincipal() {
        if (isLigado()) {
            return "Abrindo programa no notebook.";
        } else {
            return "Não é possivel abrir programa, notebook desligado.";
        }
    }

    @Override
    public String exibitStatus() {
        return "Memoria RAM: " + memoriaRAM + " GB";
    }
}
