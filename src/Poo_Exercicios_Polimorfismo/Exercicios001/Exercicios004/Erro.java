package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios004;

public class Erro extends Mensagem{

    public Erro(String mensagem) {
        super(mensagem);
    }

    @Override
    public void mostrar() {
        System.out.println("\u001B[41m\u001B[30m" + mensagem + "\u001B[0m");
    }
}
