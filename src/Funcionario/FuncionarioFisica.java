package Funcionario;

public class FuncionarioFisica extends Funcionario {
	
	/*taxa do inss*/
	private float inss;
	public float getInss() {
		inss=-getSalario();
		
		return inss;
	}

	public void setInss(float inss) {
		this.inss = inss;
	}
	
	


}
