package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios003;

public class Main {

    public static void main(String[] args) {
        Pagamento pix = new Pix(8500);
        Pagamento boleto = new Boleto(1000);
        Pagamento credito = new Credito(500);
    }
}
