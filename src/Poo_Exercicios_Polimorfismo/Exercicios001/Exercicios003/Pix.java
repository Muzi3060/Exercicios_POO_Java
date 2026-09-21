package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios003;

public class Pix extends Pagamento {

    public Pix(double valor) {
        super(valor);
        pagar();
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento CONFIRMADO de " + getValorFormatado() + " via Pix");
    }

}