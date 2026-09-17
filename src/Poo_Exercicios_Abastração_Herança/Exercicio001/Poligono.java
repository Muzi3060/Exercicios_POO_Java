package Poo_Exercicios_Abastração_Herança.Exercicio001;

public abstract class Poligono {
    protected int qtdLados;

    public Poligono(int qtdLados) {
        this.qtdLados = qtdLados;
    }
    public abstract double perimetro();

    public abstract double area();
}
