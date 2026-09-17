package Poo_Exercicios_Básicos.exercicios001.exercicios002;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 3500f);
        Produto produto2 = new Produto("Playstation 5", 4500f);

        System.out.println(produto1.etiqueta());
        System.out.println(produto2.etiqueta());
    }
}
