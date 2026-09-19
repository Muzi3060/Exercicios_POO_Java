package Poo_Exercicios_Polimorfismo.Exercicios001;

public abstract class Funcionario {
    public String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    public double getSalario () {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > this.getSalario()) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("Salário não pode ser menor que o atual");
        }
    }

    public abstract double calcularBonus();

    @Override
    public String toString() {
        return nome + " ganha R$" + salario + " e por ser " + this.getClass().getSimpleName() + " o bônus será de R$" + calcularBonus();
    }



}
