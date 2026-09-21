package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios004;

public class Mensagem {
    protected String mensagem;

    public Mensagem(String mensagem) {
        this.mensagem = mensagem;
        mostrar();
    }

    public void mostrar() {
        System.out.println("\u001B[47m\u001B[30m" + mensagem + "\u001B[0m");
    }
}
