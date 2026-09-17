package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio002;

public class Main {

    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.preparar();

        Leite leite = new Leite();
        leite.preparar();

        Cha cha = new Cha();
        cha.preparar();
    }
}
