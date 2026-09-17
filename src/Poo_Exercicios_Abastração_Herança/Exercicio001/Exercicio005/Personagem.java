package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio005;

import java.util.Random;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected String[] golpes;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(Personagem alvo, int forca) { // o parametro de um método pode ser a instancia de um objeto
        Random random = new Random();
        String golpe = golpes[random.nextInt(golpes.length)];

        System.out.println(this.nome + "( " + this.vida + " ) atacou " + alvo.nome + "( " + alvo.vida + " ) com " + golpe + " e força " + forca);
        alvo.receberDano(forca);
    }


    public void receberDano(int dano) {
        // calculo de dano é. Dano aleatorio (randomico) baseado no atanque do inimigo. (força) -= a vida do personagem.
        Random sorteioDano = new Random();

        dano = sorteioDano.nextInt(dano) + 1;
        this.vida -= dano;

        System.out.println(this.nome + " recebeu dano de " + dano);
    }

    public abstract void curar();
}
