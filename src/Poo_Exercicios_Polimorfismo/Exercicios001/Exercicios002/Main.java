package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios002;

public class Main {

    public static void main(String[] args) {
        Pdf pdf = new Pdf("prova", 250000);
        Doc doc = new Doc("contrato", 1300000);

        pdf.abrir();
        doc.abrir();

        System.out.println(pdf.nomeCompleto());
        System.out.println(doc.nomeCompleto());
    }
}
