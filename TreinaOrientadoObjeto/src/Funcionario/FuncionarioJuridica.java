package Funcionario;

import CadastroPessoa.PessoaJuridica;

public class FuncionarioJuridica   extends Funcionario {
	
	private double irpj = 0.32; /**/
	private  double iss = 0.5; /*pago mensal*/
	public double getIrpj() {
		return irpj;
	}
	public void setIrpj(double irpj) {
		this.irpj = irpj;
	}
	public double getIss() {
		return iss;
	}
	public void setIss(double iss) {
		this.iss = iss;
	} 
	
	
	


}
