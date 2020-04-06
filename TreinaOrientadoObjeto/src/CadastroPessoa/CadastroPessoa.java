package CadastroPessoa;

import java.util.ArrayList;

import Cliente.Cliente;
import Funcionario.Funcionario;

public class CadastroPessoa {
	
	ArrayList<Funcionario>funcionarios = new ArrayList<Funcionario>();
	ArrayList<Cliente>clientes = new ArrayList<Cliente>(); 
	
	

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	private String Nome; 
	private String dataNascimento;
	private String nomeMae;
	private String nomePai; 
	private String rua;
	private String numero;
	private String cidade;
	private String cep;
	private String Estado;
	

	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMãe(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	@Override
	public String toString() {
		return "CadastroPessoa [Nome=" + Nome + ", dataNascimento=" + dataNascimento + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", rua=" + rua + ", numero=" + numero + ", cidade=" + cidade + ", cep=" + cep
				+ ", Estado=" + Estado + "]";
	}
	
	
	
}
