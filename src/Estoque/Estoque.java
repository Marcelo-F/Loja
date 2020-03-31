package Estoque;

import java.util.ArrayList;
import java.util.List;

public class Estoque  extends Produto{
	
	private float quantidadeTotalProduto; /*Soma de todos os produtos, mostrando o total que esta em estoque*/
	private float valorTotalProduto;  /* Valor em R$ do estoque no momento*/
	private float capacidadeEstoque; /*Capacidade máxima do estoque*/
	private float capacidadeLivreEstoque; /*Mostra os espaços livre no estoque*/
	
	private List<Produto> produtos = new ArrayList<Produto>();
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
		
				
	
	
	public float getQuantidadeTotalProduto() {
		
		/*soma total de todos os produtos*/
		
		double somaProduto =0.0;
		
		for (Produto produto : produtos) {
			 somaProduto += produto.getQuantidade();
	
		}
		

		return quantidadeTotalProduto += somaProduto;
	}
	public void setQuantidadeTotalProduto(float quantidadeTotalProduto) {
		
		
		this.quantidadeTotalProduto = quantidadeTotalProduto;
	}
	public float getValorTotalProduto() {
		/*soma do valor de  todos os produtos em estoque*/
		
		double somaValorProd =0.0;
		for (Produto produto : produtos) {
			somaValorProd += produto.getValor();
			
		}
		
		return valorTotalProduto += somaValorProd;
	}
	public void setValorTotalProduto(float valorTotalProduto) {
		this.valorTotalProduto = valorTotalProduto;
	}
	public float getCapacidadeEstoque() {
		/*capacidade máxima do estoque   */
		capacidadeEstoque =300;
		
		
		return capacidadeEstoque -= getQuantidadeTotalProduto();
	}
	public void setCapacidadeEstoque(float capacidadeEstoque) {
		this.capacidadeEstoque = capacidadeEstoque;
	}
	public float getCapacidadeLivreEstoque() {
		
		
		 
		/*capacidade livre do estoque */
		return capacidadeLivreEstoque -= this.getCapacidadeEstoque();
	}
	public void setCapacidadeLivreEstoque(float capacidadeLivreEstoque) {
		this.capacidadeLivreEstoque = capacidadeLivreEstoque;
	}
	
	
	
	
	
}
