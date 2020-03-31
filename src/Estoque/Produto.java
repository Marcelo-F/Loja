package Estoque;

import Funcionario.Gerente;
import Estoque.Estoque;

public class Produto {

	private int camisa[];
	private int calça[];
	private int camiseta[];
	private int bermuda[];
	private int tenis[];

	private String marca;
	private String cor;
	private String tamanho;
	private int quantidade;
	private double valor;
	private double ValorRevendaProduto;

	public int[] getCamisa() {

		for (int pos = 0; pos < getCamisa().length; pos++) {
			int somaCamisa = +camisa[pos];

		}

		return getCamisa();
	}

	public void setCamisa(int[] camisa) {
		this.camisa = camisa;
	}

	public int[] getCalça() {

		for (int pos = 0; pos < getCamisa().length; pos++) {

			int somaCalca = +calça[pos];

		}
		return getCalça();

	}

	public void setCalça(int[] calça) {
		this.calça = calça;
	}

	public int[] getCamiseta() {

		for (int pos = 0; pos < getCamiseta().length; pos++) {

			int somaCamiseta = +camiseta[pos];
		}

		return getCamiseta();
	}

	public void setCamiseta(int[] camiseta) {
		this.camiseta = camiseta;
	}

	public int[] getBermuda() {

		for (int pos = 0; pos < getBermuda().length; pos++) {

			int somaBermuda = +bermuda[pos];

		}
		return getBermuda();
	}

	public void setBermuda(int[] bermuda) {
		this.bermuda = bermuda;
	}

	
	public int[] getTenis() {

		for (int pos = 0; pos < getTenis().length; pos++) {

			int somaTenis = +tenis[pos];

		}

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

	public int getQuantidade() {
		
	
		return quantidade;
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

		return quantidade * valor;

	}

	public double getValorRevendaProduto() {

		return ValorRevendaProduto = +this.getValor();

	}

	public void setValorRevendaProduto(double valorRevendaProduto) {
		ValorRevendaProduto = valorRevendaProduto;
	}

}
