package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios002;

public class Doc extends Arquivo{

    public Doc(String nome, double tamanho) {
        super(nome, tamanho);
        this.extensao = ".doc";
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo '" + getNome() + extensao + "'(" + (getTamanho() / 1000000) + "MB) no Microsoft Word");
    }
}
