package main;

import estoque.EstoqueProdutos;
import estoque.Produto;

public class principal {
    public static void main(String[] args) {
        // Criar uma instância de EstoqueProdutos
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Criar produtos
        Produto produto1 = new Produto(1, 10.0, "Eletrônicos");
        Produto produto2 = new Produto(2, 5.0, "Alimentos");

        // Adicionar produtos ao estoque
        estoque.adicionarProduto(produto1, 50);
        estoque.adicionarProduto(produto2, 100);

        // Consultar a quantidade de um produto
        int quantidadeProduto1 = estoque.devolverQuantidadeProduto(produto1);
        int quantidadeProduto2 = estoque.devolverQuantidadeProduto(produto2);

        // Exibir quantidades
        System.out.println("Quantidade do produto 1: " + quantidadeProduto1);
        System.out.println("Quantidade do produto 2: " + quantidadeProduto2);
    }
}