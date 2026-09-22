package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios006;

public abstract class Validador {

    private String nome;

    public Validador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void validar(String valor);
}
