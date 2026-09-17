package Poo_Exercicios_Básicos.exercicios001.exercicios005;
import java.util.ArrayList;

public class Gamer {
    private String nome;
    private String nick;
    private ArrayList<String> jogosFavoritos;

    public Gamer(String nome, String nick) {
        this.nome = nome;
        this.nick = nick;
        this.jogosFavoritos = new ArrayList<String>();
    }

    public String fichaJogador() {
        String formatado = "";
        for (String jogo : jogosFavoritos) {
            formatado += jogo + ", ";
        }
        return "Nome: " + nome + "\nNick: " + nick + "\nJogos: " + formatado;
    }

    public void adicionarJogoFavorito(String jogos) {
        jogosFavoritos.add(jogos);
    }

    public int getJogosFavoritos() {
        return jogosFavoritos.size();
    }
}
