package PROVA1;

public abstract class Transporte  {
    private String nome;
    private int velocidadeMaxima;
    private int autonomia;
    private String tipoDeCombustivel;
    public abstract void mover();
    public abstract void parar();

    public Transporte (String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        this.nome = nome;
        setVelocidadeMaxima(velocidadeMaxima);
        this.autonomia = autonomia;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("nome nao pode ser nulo.");
        }
        this.nome = nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        if (velocidadeMaxima <5) {
            System.out.println("Velocidade maxima deve ser maior que 5");
        }
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        if (autonomia <0){
            System.out.println("Autonomia deve ser maior que 0");
        }
        this.autonomia = autonomia;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        if (tipoDeCombustivel == null){
            throw new IllegalArgumentException("tipo de combustivel nao pode ser nulo.");
        }
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome +" Velocidade maxima: "+ velocidadeMaxima +" Autonomia: "+ autonomia+ " tipoDeCombustivel: "+ tipoDeCombustivel);
    }


}
