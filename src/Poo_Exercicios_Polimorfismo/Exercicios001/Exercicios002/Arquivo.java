package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios002;

public abstract class Arquivo {
    private String nome;
    protected String extensao;
    private double tamanho;

    public Arquivo(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;

    }

    public String getNome() {
        return nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public String nomeCompleto() {
        return "'" + nome + extensao + "'(" + (tamanho / 1000000) + "MB)";
    }

    public abstract void abrir();
}
