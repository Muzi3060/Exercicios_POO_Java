package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio005;

import java.util.Random;

public class Mago extends Personagem {

    public Mago(String nome, int vida) {
        super(nome, vida);
        this.golpes = new String[]{"Magia de fogo", "Magia de gelo", "Magia de trovão", "Magia de vento"};
    }

    @Override
    public void curar() {
        Random random = new Random();
        int cura = random.nextInt(401) + 100; // Gera um valor aleatório entre 100 e 500
        vida += cura;
        System.out.println(nome + " Usou uma magia de cura e recuperou " + cura + " de vida.");
    }
}
