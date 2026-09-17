package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio004;

public class Mensalista extends Funcionario {

    public Mensalista(String nome, double salarioBruto) {
        super(nome, salarioBruto);
        this.salario = calcSalario();
    }

    public double calcSalario() {
        double descontoINSS = salarioBruto * inss;
        return salarioBruto - descontoINSS;
    }

}
