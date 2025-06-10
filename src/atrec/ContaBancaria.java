package atrec;

public class ContaBancaria {
    private int numerodaConta;
    private int saldo;

    public ContaBancaria(int numerodaConta, int saldo) {
        this.numerodaConta = numerodaConta;
        this.saldo = saldo;
    }

    public int getNumerodaConta() {
        return numerodaConta;
    }

    public void setNumerodaConta(int numerodaConta) {
        this.numerodaConta = numerodaConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Número da Conta: " + numerodaConta + "\nSaldo: " + saldo + " reais";
    }
}
