package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios005;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando aplicação...");
        System.out.println("Criando produtos...");

        Produto produto1 = new Produto("Mouse", 10.0);
        Produto produto2 = new Produto("Teclado", 20.0);
        Produto produto3 = new Produto("Placa de Vídeo", 30.0);

        System.out.println("Adicionando produtos ao carrinho...");

        Carrinho carrinho1 = new Carrinho();
        Carrinho carrinho2 = new Carrinho();

        carrinho1.adicionarProduto(produto1); // Adiciona o mouse ao carrinho 1
        carrinho2.adicionarProduto(produto2); // Adiciona o teclado ao carrinho 2
        carrinho2.adicionarProduto(produto3); // Adiciona a placa de vídeo ao carrinho 2

        carrinho1.adicionarProduto(carrinho2); // Adiciona todos os produtos do carrinho 2 ao carrinho 1

        System.out.println(carrinho1);
    }
}
