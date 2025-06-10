package atrec;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(12345, 2000);
        ContaBancaria conta1 = new ContaBancaria(11, 12245);

        System.out.println(conta);
        System.out.println("--------------------");
        System.out.println(conta1);
    }
}
