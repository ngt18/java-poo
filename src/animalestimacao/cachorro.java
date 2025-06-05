package animalestimacao;

public class cachorro extends animal {
    private String raca;

    public cachorro (String nome, int idade,String raca){
        super(nome,idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return"auau";
    }

    @Override
    public String comer() {
        return"O cachorro está comendo ração";
    }

    @Override
    public String exibitInformacoes() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Cor do pelo: " + getRaca();
    }
}
