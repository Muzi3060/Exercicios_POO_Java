package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio005;

import java.util.Random;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int vida) {
        super(nome, vida);
        this.golpes = new String[]{"Soco plasmatico", "Chute de energia", "Raio laser", "Explosão de fogo"};
    }


    @Override
    public void curar() {
        Random random = new Random();
        int cura = random.nextInt(100) + 1; // Gera um valor
        vida += cura;
        System.out.println(nome + " Usou uma poção de cura e recuperou " + cura + " de vida.");
    }

}
