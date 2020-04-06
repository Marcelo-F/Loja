package Estoque;

import Funcionario.Gerente;
import Estoque.Estoque;

public class Produto {

	private int[] camisa;
	private int[] calca ;
	private int []camiseta;
	private int []bermuda;
	private int []tenis;

	private String marca;
	private String cor;
	private String tamanho;
	private int quantidade;
	private double valor;
	private double ValorRevendaProduto;

	public int[] getCamisa() {
	

		return camisa;
	}

	public void setCamisa(int[] camisa) {
		this.camisa = camisa;
	}

	public int[] getCalca() {
	
		return calca;

	}

	public void setCalca(int[] calca) {
		this.calca = calca;
	}

	public int[] getCamiseta() {

	
		return camiseta;
	}

	public void setCamiseta(int[] camiseta) {
		this.camiseta = camiseta;
	}

	public int[] getBermuda() {

	
		return bermuda;
	}

	public void setBermuda(int[] bermuda) {
		this.bermuda = bermuda;
	}

	
	public int[] getTenis() {

	

		return tenis;
	}

	public void setTenis(int[] tenis) {
		this.tenis = tenis;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
	
	
	/*Returna o total de quantidade  cada item*/
	
	public int TotalCamisa() {
		
		
		int somaCamisa =0;
		for (int pos = 0; pos < camisa.length; pos++) {
			somaCamisa += camisa[pos];

		}
		return somaCamisa;
		
		
		
	}
		
		
	public int TotalCalca() {	
		int somaCalca = 0;
		for (int posCalca = 0; posCalca < calca.length; posCalca++) {

			 somaCalca +=calca[posCalca];

		}
	
		return somaCalca;
	}
	
	public int TotalCamiseta() {
		
		int somaCamiseta =0; 
		
		
		for (int pos = 0; pos < camiseta.length; pos++) {

	 somaCamiseta +=camiseta[pos];
	}

		return somaCamiseta;
		
		
		
	}
	
	
	public int TotalBermuda() {
		
		int somaBermuda =0;
		for (int pos = 0; pos < bermuda.length; pos++) {

		 somaBermuda = +bermuda[pos];

	}
		
		return somaBermuda;
		
	}
		
	public int TotalTenis () {
		
		int somaTenis = 0;
		for (int pos = 0; pos < tenis.length; pos++) {

		 somaTenis = +tenis[pos];

	}
		return somaTenis; 
		
	}
		
		
	
	
	/*valor total de cada item em estoque*/
	
	
	public double ValorTotalCamisa () {
		double ValorTotalCamisa = 0.0;
		for(int pos =0; pos < camisa.length; pos ++) {
			
			ValorTotalCamisa = valor*camisa.length; 
		}
			
			
		
		
		
		return ValorTotalCamisa;
		
		
		
		
	} 
	
	public double ValorTotalCamiseta() {
		double ValorTotalCamiseta =0.0;
		
			for(int pos =0; pos < camiseta.length; pos ++) {
			
			ValorTotalCamiseta= valor*camiseta.length; 
		}
			
		
		
		return ValorTotalCamiseta;
		
	} 
	
	public double ValorTotalCalca() {
		
		double ValorTotalCalca = 0.0;
		
	for(int pos =0; pos < calca.length; pos ++) {
			
			ValorTotalCalca= valor*calca.length; 
		}
			
		
		
		
		
		return ValorTotalCalca;
		
	} 
	public double ValorTotalBermuda() {
		double ValorTotalBermuda = 0.0;
		
		
			for(int pos =0; pos < bermuda.length; pos ++) {
			
				ValorTotalBermuda= valor*bermuda.length; 
		}
			
		
		
		
		return ValorTotalBermuda;
		
		
		
	} 
	public double ValorTotalTenis() {
		double ValorTotalTenis = 0.0;
		
		
		for(int pos =0; pos < tenis.length; pos ++) {
			
			ValorTotalTenis= valor*tenis.length; 
	}
		
		
		return ValorTotalTenis;
		
		
		
	} 
	
	
	

	/*Return o total de produtos  em estoque*/ //EM ANDAMENTO 
	public int getQuantidade() {
		int Somatotal = 0;
		
	
		Somatotal = (TotalCamiseta() +TotalBermuda() +TotalCalca()+TotalCamisa()+TotalTenis());
	
	
	
		return Somatotal ;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCalculoProduto() {

		return getQuantidade()* valor;

	}

	public double getValorRevendaProduto() { 

		return ValorRevendaProduto = +this.getValor();

	}

	public void setValorRevendaProduto(double valorRevendaProduto) {
		ValorRevendaProduto = valorRevendaProduto;
	}

	
	

	
	
	
	

	
	
	
}
