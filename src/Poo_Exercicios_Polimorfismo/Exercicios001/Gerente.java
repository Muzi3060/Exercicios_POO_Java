package Poo_Exercicios_Polimorfismo.Exercicios001;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // bonus de 15% para gerente
    @Override
    public double calcularBonus() {
        return getSalario() * 0.15;
    }
}
