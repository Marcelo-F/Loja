package Funcionario;
/*Aqui é classe onde tem o get e set para o salario do cliente, 
 * e para fazer uma nova requisição para o estoque feito pelo estoquista*/

public class Estoquista  extends Funcionario {
	private float Salario; /*Valor do salario do funcionário do setor de estoque*/
	
	
	public float getSalario() {
		return 1500;
	}
	public void setSalario(float salario) {
		Salario = salario;
	}
	public String getNovarequi() {
		return Novarequi;
	}
	public void setNovarequi(String novarequi) {
		Novarequi = novarequi;
	}
	private String Novarequi;
	
	
	

}
