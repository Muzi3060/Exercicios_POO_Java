package Poo_Exercicios_Básicos.exercicios001;

public class Funcionario {
    private String nome;
    private String setor;
    private String cargo;

    public Funcionario(String nome, String setor, String cargo) {
        this.nome = nome;
        this.setor = setor;
        this.cargo = cargo;
    }

    public String apresentar() {
        return this.nome + " trabalha no setor de " + this.setor + " e ocupa o cargo de " + this.cargo;
    }

}
