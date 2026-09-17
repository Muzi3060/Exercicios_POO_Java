package Poo_Exercicios_Encapsulamento.Exercicios001;

public class Main {

    public static void main (String[] args) {
        Termostato t = new Termostato();
        System.out.println("Temperatura: " + t.getTemperatura());
        t.setTemperatura(25.5);
        System.out.println("Temperatura: " + t.getTemperatura());
    }
}
