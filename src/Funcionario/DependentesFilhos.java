package Funcionario;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*Caso o cliente tenha filho e queira colocar no covenio fornecido pela empresa*/
public class DependentesFilhos {
	private int qtdFilho;
	private String nome;
	private int dataNascimentoF;
	private double valorDependecia = 90;
	
	
	
	public double getValorDependecia() {
		
		
		return valorDependecia*getQtdFilho();
	}
	public void setValorDependecia(double valorDependecia) {
		this.valorDependecia = valorDependecia;
	}
	public int getQtdFilho() {
		return qtdFilho;
	}
	public void setQtdFilho(int qtdFilho) {
		this.qtdFilho = qtdFilho;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDataNascimentoF() {
		
		
		
		return dataNascimentoF;
	}
	public void setDataNascimentoF(int dataNascimentoF) {
		this.dataNascimentoF = dataNascimentoF;
	}
	
	public int   getIdade() {
		
		Calendar cal = GregorianCalendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		
		anoAtual =- getDataNascimentoF();
			
	return getIdade(); 	
		
	}
	
	public int validadorIdade() {
		
		if (getIdade() <= 15) {
			
			System.out.println("Cadastrado");
		}
			else {
				System.out.println("Maior que 15 anos, não é possível cadastrar");
				
			}
		return validadorIdade(); 
			
		}
		
		
	} 
		
	
	
	
	


