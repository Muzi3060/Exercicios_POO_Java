package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio003;

public abstract class Transporte {
    protected int distancia;
    protected double frete;

    public Transporte(int distancia) {
        this.distancia = distancia;
    }

    public  abstract void calcularFrete();
}
