package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio004;

public abstract class Funcionario {
    private String nome; // valor de entrada
    protected double salarioBruto; // valor de entrada
    protected double salario; // salario líquido = salario bruto - desconto do INSS // valor de saida/calculado
    private final int salarioMinimo = 1612; // saida
    protected final double inss = 0.075; // saida

    public Funcionario(String nome, double salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public abstract double calcSalario();

    public void analisarSalario() {
        System.out.println("O salário de " + nome + " é de R$" + salario + " e corresponde a " + (salario / salarioMinimo) + " salários mínimos.");
    }

}
