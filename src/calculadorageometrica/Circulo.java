package calculadorageometrica;

public class Circulo extends FormaGeometrica {
    private double raio;


    public Circulo(String cor , double raio ){
        super(cor);
        this.raio = raio;

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * 3.14 * raio ;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (raio * raio) ;
    }

    @Override
    public double calculaVolume() {
        return (4/3) * 3.14 * (raio * raio * raio);
    }
}
