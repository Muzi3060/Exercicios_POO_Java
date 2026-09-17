package Poo_Exercicios_Abastração_Herança.Exercicio001;

public class Quadrado extends Poligono {
    private double lado;

    public Quadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return qtdLados * lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}