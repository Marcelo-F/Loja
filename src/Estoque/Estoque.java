package Estoque;

import java.util.ArrayList;
import java.util.List;

public class Estoque extends Produto {

	private int quantidadeTotalProduto; /* Soma de todos os produtos, mostrando o total que esta em estoque */
	private float valorTotalProduto; /* Valor em R$ do estoque no momento */
	private int capacidadeEstoque; /* Capacidade máxima do estoque */
	private int capacidadeLivreEstoque; /* Mostra os espaços livre no estoque */

	private List<Produto> produtos = new ArrayList<Produto>();

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public int getQuantidadeTotalProduto() {

		/* soma total de todos os produtos */

		int somaProduto = 0;

		for (Produto produto : produtos) {
			somaProduto += produto.getQuantidade();

		}

		return somaProduto;
	}

	public void setQuantidadeTotalProduto(int quantidadeTotalProduto) {

		this.quantidadeTotalProduto = quantidadeTotalProduto;
	}

	public float getValorTotalProduto() {
		/* soma do valor de todos os produtos em estoque */

		double somaValorProd = 0.0;
		for (Produto produto : produtos) {
			somaValorProd += produto.getValor();

		}

		return valorTotalProduto += somaValorProd;
	}

	public void setValorTotalProduto(float valorTotalProduto) {
		this.valorTotalProduto = valorTotalProduto;
	}

	public int getCapacidadeEstoque() {
		/* capacidade máxima do estoque */
		
		capacidadeEstoque = 300;


		return  capacidadeEstoque;
	}

	public void setCapacidadeEstoque(int capacidadeEstoque) {
		this.capacidadeEstoque = capacidadeEstoque;
	}

	public int getCapacidadeLivreEstoque() {

		double subtracaoEstoque =0.0;
		

		subtracaoEstoque =  getCapacidadeEstoque() - getQuantidadeTotalProduto();
		return (int) subtracaoEstoque ;
	}

	public void setCapacidadeLivreEstoque(int capacidadeLivreEstoque) {
		this.capacidadeLivreEstoque = capacidadeLivreEstoque;
	}

}
