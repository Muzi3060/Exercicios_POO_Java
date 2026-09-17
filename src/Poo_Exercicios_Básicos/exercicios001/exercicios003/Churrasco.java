package Poo_Exercicios_Básicos.exercicios001.exercicios003;
public class Churrasco {
    private String titulo;
    private int quantidadePessoas;
    private static final int CONSUMO_PADRAO_G = 400; // consumo padrão de carne por pessoa em gramas
    private static final double PRECO_KG = 82.40;

    public Churrasco(String titulo, int quantidadePessoas) {
        this.titulo = titulo;
        this.quantidadePessoas = quantidadePessoas;
    }

    public String analisar() {

       double quantidadeCarne = (CONSUMO_PADRAO_G * this.quantidadePessoas) / 1000.0;
       double precoTotal = quantidadeCarne * PRECO_KG;

       return "Analisando o " + this.titulo + " com " + this.quantidadePessoas + " convidados" + String.format(
               "%nCada participante comerá 0.4Kg e cada Kg custa R$82.40%n"
               + "Recomendo comprar %.2fkg de carne%n"
               + "O custo total será de R$%.2f%n"
               + "Cada pessoa pagará R$%.2f para participar.",
               quantidadeCarne, precoTotal, precoTotal / this.quantidadePessoas);
    }

}
