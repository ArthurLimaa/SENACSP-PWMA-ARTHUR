package estoque;

public class ItemPedido {
	
	private int quantidade;
	private Produto produto;
	
	public ItemPedido() {}
	
	public ItemPedido(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public Produto getProduto() {
		return produto;
	}

}
