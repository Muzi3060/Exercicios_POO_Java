package Poo_Exercicios_Básicos.exercicios001.exercicios005;

public class Main {

    public static void main(String[] args) {
        Gamer gamer1 = new Gamer("João", "Joaozinho");
        gamer1.adicionarJogoFavorito("FIFA");
        gamer1.adicionarJogoFavorito("Call of Duty");
        gamer1.adicionarJogoFavorito("Minecraft");

        Gamer gamer2 = new Gamer("Maria", "Mariinha");
        gamer2.adicionarJogoFavorito("League of Legends");
        gamer2.adicionarJogoFavorito("Valorant");
        gamer2.adicionarJogoFavorito("Among Us");

        System.out.println(gamer1.fichaJogador());
        System.out.println(gamer2.fichaJogador());

        System.out.println(gamer1.getJogosFavoritos());
        System.out.println(gamer2.getJogosFavoritos());
    }
}
