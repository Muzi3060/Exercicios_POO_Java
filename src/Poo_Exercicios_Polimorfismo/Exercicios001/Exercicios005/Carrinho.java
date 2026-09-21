package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios005;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos;

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String linhaTracejada = "-----------------------------------\n";

        sb.append(linhaTracejada);

        double valorTotal = 0;

        // Iteramos sobre a lista de produtos
        for (Produto produto : this.produtos) {
            // Chamamos o toString() do próprio Produto para pegar o nome e preço formatado
            sb.append(produto.toString()).append("\n");

            // Acumulamos o preço total
            valorTotal += produto.getPreco();
        }

        sb.append(linhaTracejada);

        // Formata o total com duas casas decimais (ex: Total: R$ 150,00)
        sb.append(String.format("Total: R$ %,.2f", valorTotal));

        return sb.toString();
    }

    public void adicionarProduto(Produto produto) {
       this.produtos.add(produto); // Adiciona o produto à lista de produtos do carrinho atual
    }

    public void adicionarProduto(Carrinho carrinho) {
        this.produtos.addAll(carrinho.getProdutos()); // Adiciona todos os produtos do outro carrinho ao carrinho atual
    }
}
