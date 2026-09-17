package Poo_Exercicios_Encapsulamento.Exercicios001.Exercicios002;

public class Main {

    public static void main(String[] args) {
        Diario diario = new Diario("1234");

        diario.escrever("Meu primeiro segredo");
        diario.escrever("Meu segundo segredo");
        diario.escrever("Meu terceiro segredo");
        diario.escrever("Meu quarto segredo");

        diario.ler("1234");
    }
}
