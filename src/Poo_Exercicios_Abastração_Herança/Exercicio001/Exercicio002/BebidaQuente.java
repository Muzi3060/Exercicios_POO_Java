package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio002;

public abstract class BebidaQuente {

    public void preparar() {
        System.out.println("--- Iniciando o Preparo ---");
        ferverAgua();
        misturar();
        servir();
        System.out.println("--- Bebida Pronta ---");
    }

    public void ferverAgua() {
        System.out.println("1. Fervendo água a 100 graus Celsius.");
    }

    public abstract void misturar();

    public abstract void servir();
}
