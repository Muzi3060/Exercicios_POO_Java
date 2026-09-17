package Poo_Exercicios_Abastração_Herança.Exercicio001;

public class Circulo extends Poligono {
    private double raio;

    public Circulo(double raio) {
        super(0);
        this.raio = raio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
