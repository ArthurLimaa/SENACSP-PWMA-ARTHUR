package estoque;

public interface Estoque {
    void carregarProdutos();   
    void adicionarProduto(Produto produto, int quantidade);   
    int consultarQuantidade(Produto produto);  
}
