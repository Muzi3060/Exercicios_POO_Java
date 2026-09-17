package Poo_Exercicios_Básicos.exercicios001.exercicios002;

public class Produto {
    private String nome;
    private float preco;

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String etiqueta() {
        return "Produto: " + this.nome + ", Preço: R$" + String.format("%.2f", this.preco);
    }
}
