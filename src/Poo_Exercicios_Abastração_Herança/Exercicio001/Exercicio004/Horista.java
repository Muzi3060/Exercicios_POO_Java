package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio004;

public class Horista extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public Horista(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora * horasTrabalhadas);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salario = calcSalario();
    }

    public double calcSalario() {
        double descontoINSS = salarioBruto * inss;
        return salarioBruto - descontoINSS;
    }
}
