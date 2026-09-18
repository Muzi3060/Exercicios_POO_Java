package Poo_Exercicios_Encapsulamento.Exercicios001.Exercicios004;

public class Retangulo {

    protected double base;
    protected double altura;
    protected double area;



    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        this.area = this.base * this.altura;
        return this.area;
    }

    public  void setMedidas(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = base * altura;

    }

    public String getMedidas() {
        return "Base: " + this.base + " X "  + "Altura: " + this.altura + " = Area: " + this.area;
    }

}
