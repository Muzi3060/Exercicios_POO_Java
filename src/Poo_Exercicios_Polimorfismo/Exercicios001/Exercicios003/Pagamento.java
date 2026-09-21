package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios003;

public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public String getValorFormatado() {
        return String.format("R$ %.2f", valor);
    }

    public abstract void pagar();
}
