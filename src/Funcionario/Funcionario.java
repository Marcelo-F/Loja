package Funcionario;
import Funcionario.OperadorCaixa;
import Funcionario.Vendedor;
import CadastroPessoa.CadastroPessoa;

public class Funcionario extends CadastroPessoa {
	
	private String pis; 
	private String estadoCivil;
	private  int  registroCovenio; 
	private float Salario;
	private String dataDemissao;
	private String dataAdemissao;
	
	
	
	public String getPis() {
		return pis;
	}
	public void setPis(String pis) {
		this.pis = pis;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getRegistroCovenio() {
		return registroCovenio;
	}
	public void setRegistroCovenio(int registroCovenio) {
		this.registroCovenio = registroCovenio;
	}
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		Salario = salario;
	}
	public String getDataDemissao() {
		return dataDemissao;
	}
	public void setDataDemissao(String dataDemissao) {
		this.dataDemissao = dataDemissao;
	}
	public String getDataAdemissao() {
		return dataAdemissao;
	}
	public void setDataAdemissao(String dataAdemissao) {
		this.dataAdemissao = dataAdemissao;
	} 
	
	
	
	

}
