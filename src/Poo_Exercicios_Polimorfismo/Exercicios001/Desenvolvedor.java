package Poo_Exercicios_Polimorfismo.Exercicios001;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    // bonus de 10% para desenvolvedor
    @Override
    public double calcularBonus() {
        return getSalario() * 0.1;
    }

}
