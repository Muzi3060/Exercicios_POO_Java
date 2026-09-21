package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios003;

public class Boleto extends Pagamento {

    public Boleto(double valor) {
        super(valor);
        pagar();
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento CONFIRMADO de " + getValorFormatado() + " via Boleto");
    }
}
