package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios004;

public class Aviso extends Mensagem{
    public Aviso(String mensagem) {
        super(mensagem);
    }

    @Override
    public void mostrar() {
        System.out.println("\u001B[43m\u001B[30m" + mensagem + "\u001B[0m");
    }
}
