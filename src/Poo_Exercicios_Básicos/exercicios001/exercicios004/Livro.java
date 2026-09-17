package Poo_Exercicios_Básicos.exercicios001.exercicios004;

public class Livro {
    private final int totalPagina;
    private int paginaAtual = 1;

    public Livro(int totalPagina, int paginaAtual) {
        this.totalPagina = totalPagina;
        this.paginaAtual = paginaAtual;
    }
    public int getPaginaAtual() {
        return paginaAtual;
    }
    public void passarPagina() {
        if (paginaAtual < totalPagina ) {
            paginaAtual += 1;
        }
    }
    public boolean chegouAoFim() {
        if (paginaAtual == totalPagina) {
            System.out.println("Você já está na última página.");
            return true;
        } else {
            return false;
        }
    }
}
