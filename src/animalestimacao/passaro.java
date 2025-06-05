package animalestimacao;

public class passaro extends animal {
    private String corPenas;

    public passaro (String nome, int idade,String corPenas){
        super(nome,idade);
        this.corPenas = corPenas;
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    @Override
    public String emitirSom() {
        return "Piu piu!";
    }

    @Override
    public String comer() {
        return "O pássaro está comendo sementes.";
    }

    @Override
    public String exibitInformacoes() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Cor do pelo: " + getCorPenas();
    }
}
