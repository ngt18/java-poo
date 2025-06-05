package animalestimacao;

public class gato extends animal {
    private String corPelo;

    public gato (String nome, int idade,String corPelo) {
        super(nome,idade);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }

    @Override
    public String comer() {
        return "gato come racao ou peixe    ";
    }

    @Override
    public String exibitInformacoes() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Cor do pelo: " + getCorPelo();
    }
}
