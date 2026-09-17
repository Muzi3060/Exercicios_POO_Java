package Poo_Exercicios_Básicos.exercicios001.exercicios004;

public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro(25, 25);
        while (true) {
            System.out.println("Página atual: " + livro1.getPaginaAtual());
            livro1.passarPagina();
            if (livro1.chegouAoFim()) {
                System.out.println("Você chegou a pagina " + livro1.getPaginaAtual() + ". Fim do livro.");
                break;
            }
        }
    }
}
