package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios002;

public class Pdf extends Arquivo{

    public Pdf(String nome, double tamanho) {
        super(nome, tamanho);
        this.extensao = ".pdf";

    }

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo '" + getNome() + extensao + "'(" + (getTamanho() / 1000000) + "MB) no Adobe Acrobat Reader");
    }
}
