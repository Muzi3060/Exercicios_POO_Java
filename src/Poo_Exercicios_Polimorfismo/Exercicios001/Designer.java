package Poo_Exercicios_Polimorfismo.Exercicios001;

public class Designer extends Funcionario {

    public Designer(String nome, double salario) {
        super(nome, salario);
    }

    // bonus de 8% para designer
    @Override
    public double calcularBonus() {
        return getSalario() * 0.08;
    }
}

