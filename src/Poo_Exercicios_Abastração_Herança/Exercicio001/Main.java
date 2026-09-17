package Poo_Exercicios_Abastração_Herança.Exercicio001;

public class Main {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Circulo circulo = new Circulo(3);

        System.out.println("Quadrado: " + "Perímetro = " + quadrado.perimetro() + ", Área = " + quadrado.area());
        System.out.println("Circulo: " + "Circunferência = " + circulo.perimetro() + ", Área = " + circulo.area());
    }
}
