package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio005;

public class Main {

    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Kratos", 2000);
        Mago mago = new Mago("Merlin", 1500);

        mago.atacar(guerreiro, 1000);

        guerreiro.curar();
        mago.curar();
    }
}
