package Poo_Exercicios_Encapsulamento.Exercicios001.Exercicios006;

import java.time.LocalDate;

public abstract class Pessoa {
    protected String nome;
    protected int nascimento;

    public Pessoa(String nome, int nascimento ) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return "Idade: " + (LocalDate.now().getYear() - nascimento) + " anos";
    }

    public void setNascimento(int idade) {

        int anoAtual = LocalDate.now().getYear();
        if (idade < anoAtual && idade > 1900) {
            this.nascimento = idade;
        } else {
            throw new IllegalArgumentException("Ano de nascimento inválido: " + idade);
        }

    }
}
