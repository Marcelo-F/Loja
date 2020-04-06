package Funcionario;

public class Vendedor  extends Funcionario  {
	private double comissao;
	private double premioMeta;
	
	public double getComissao() {
		
		
		return comissao += 1.00;
	}

	public void setComissao(double comissao) {
		
		this.comissao = comissao;
		
		
	}

	public double getPremioMeta() {
		return premioMeta;
	}

	public void setPremioMeta(double premioMeta) {
		this.premioMeta = premioMeta;
	}

	
@Override
public float getSalario() {
	
	
	// TODO Auto-generated method stub
	return (float) (comissao += 1.300);
}





	

}
