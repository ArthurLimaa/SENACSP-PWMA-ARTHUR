package estoque;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private double valorTotal;
	private List<ItemPedido> itemPedido = new ArrayList<>();
	
	public Pedido() {}
	
	public Pedido (double valorTotal, List<String> itemPedido) {
		
	}

	
	public void adicionarItem(ItemPedido item) {
		itemPedido.add(item);
	}
	
	public double calcularTotal() {
		 double valorTotal = 0;

		    for (ItemPedido item : itemPedido) {

		        valorTotal += item.getQuantidade() * item.getQuantidade();
		    }

		    return valorTotal;
		}
	
	public void cupomFiscal() {
		
	}
	
}
