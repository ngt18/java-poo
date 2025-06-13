package PROVA2;

public abstract class Funcionario  {
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            throw new IllegalArgumentException("CPF nao pode ser vazio.");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() < 11){
            throw new IllegalArgumentException("CPF nao pode ser vazio.");
        }
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("Salario base deve ser maior que 0.");
        }
        this.salarioBase = salarioBase;
    }

    public abstract void exibirCargo();
    public abstract void calcularBonus();

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nsalarioBase: " + salarioBase );
    }
}

