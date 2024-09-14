package estoque;

import java.util.ArrayList;
import java.util.List;

public class EstoqueProdutos implements Estoque {

    private List<EstoqueProdutos> estoque = new ArrayList<>();

    public EstoqueProdutos() {}

    @Override
    public void carregarProdutos() {
        // Adicionando produtos ao estoque (opcional)
    }

    @Override
    public void adicionarProduto(Produto produto, int quantidade) {
        estoque.add(new EstoqueProduto(produto, quantidade));
    }

    @Override
    public int consultarQuantidade(Produto produto) {
        for (EstoqueProdutos item : estoque) {
            if (item.getProduto().getCodigo() == produto.getCodigo()) {
                return item.getQuantidade();
            }
        }
        return 0; // Retorna 0 se o produto não estiver no estoque
    }

    private Produto getProduto() {
		// TODO Auto-generated method stub
		return null;
	}

	private int getQuantidade() {
		// TODO Auto-generated method stub
		return 0;
	}

	// Método para devolver a quantidade de produtos
    public int devolverQuantidadeProduto(Produto produto) {
        return consultarQuantidade(produto);
    }
}