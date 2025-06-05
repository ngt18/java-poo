package animalestimacao;

public abstract class animal {
   private String nome;
   private int idade;

    public animal(String nome, int idade){
        this.nome = nome;
        setIdade(idade);
    }

    public animal() {

    }
    public abstract String emitirSom();
    public abstract String comer();
    public abstract String exibitInformacoes();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
            return idade;
        }

    public void setIdade(int idade) {
        this.idade = Math.max(idade, 0);
        }
    }

