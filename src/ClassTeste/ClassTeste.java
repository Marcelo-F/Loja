
package ClassTeste;

import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;



import CadastroPessoa.CadastroPessoa;
import CadastroPessoa.PessoaFisica;
import CadastroPessoa.PessoaJuridica;
import Cliente.Cliente;
import Funcionario.Estoquista;
import Funcionario.Funcionario;
import Funcionario.OperadorCaixa;
import Funcionario.Vendedor;


public class ClassTeste {
	public static void main(String[] args) {

		String escolha = JOptionPane
				.showInputDialog("Para cadastrar cliente, digite 1 \n Para cadastrar um funcion�rio Digite 2\n");
		Integer.valueOf(escolha);

		if (Integer.valueOf(escolha) == 1) {
			
			String nome = JOptionPane.showInputDialog("Informe o  nome do cliente: ");
			String datanascimento = JOptionPane.showInputDialog("Informe a data de nascimento? ");
			String nomeMae = JOptionPane.showInputDialog("Informe o nome da m�e: ");
			String nomePai = JOptionPane.showInputDialog("Informe o nome do pai: ");
			String rua = JOptionPane.showInputDialog("Informe o nome da  rua: ");
			String numeroCasa = JOptionPane.showInputDialog("Informe o numero da casa: ");
			String cidade = JOptionPane.showInputDialog("Informe a cidade: ");
			String cep = JOptionPane.showInputDialog("informe o cep: ");
			String estado = JOptionPane.showInputDialog("informe o estado: ");
			String rendaSalarial = JOptionPane.showInputDialog("Renda:  ");
			String decisaoPessoa = JOptionPane.showInputDialog("1- para pessoa fisica \n 2- pessoa juridica");
			if(Integer.valueOf(decisaoPessoa) == 1) {
				PessoaFisica pessoaFisica = new PessoaFisica();
				String Rg = JOptionPane.showInputDialog("Rg do cliente");
				String cpfClient = JOptionPane.showInputDialog("CPF do cliente");	
				pessoaFisica.setCpf(cpfClient);
				pessoaFisica.setRg(Rg);
				
				pessoaFisica.getClientes().add(pessoaFisica);
			
			} else if (Integer.valueOf(decisaoPessoa) == 2) {
				PessoaJuridica pessoaJuridica = new PessoaJuridica();	
				String cnpjClient = JOptionPane.showInputDialog("CNPJ do cliente");
				pessoaJuridica.setCnpj(cnpjClient);
				
				pessoaJuridica.getClientes().add(pessoaJuridica);
				
			}
				
			/*Verificar a visualiza��o da classes juridicas e fisica*/

			/* Instancia um cliente */
			
			
			

			Cliente cliente = new Cliente();

			cliente.setNome(nome);
			cliente.setDataNascimento(datanascimento);
			cliente.setNomeM�e(nomeMae);
			cliente.setNomePai(nomePai);
			cliente.setRua(rua);
			cliente.setNumero(numeroCasa);
			cliente.setCidade(cidade);
			cliente.setCep(cep);
			cliente.setEstado(estado);
			cliente.setRendaSalarial(rendaSalarial);
	
			
			
			
			
			
			cliente.getClientes().add(cliente);
			System.out.println(cliente);
			
			System.out.println("--------------------------------");
			System.out.println("Confirme os dados");
			System.out.println("Nome: " + nome);
			System.out.println("Data nascimento: " + datanascimento);
			System.out.println("Nome m�e: " + nomeMae);
			System.out.println("Nome Pai: " + nomePai);
			System.out.println("Rua: " + rua);
			System.out.println("Numero casa: " + numeroCasa);
			System.out.println("Cidade: " + cidade);
			System.out.println("Cep: " + cep);
			System.out.println("Estado: " + estado);
			System.out.println("Renda: "+rendaSalarial);
			System.out.println("--------------------------------");

		} else if (Integer.valueOf(escolha) == 2) {
		
			String nome = JOptionPane.showInputDialog("Informe o nome do funcion�rio");
			String datanascimento = JOptionPane.showInputDialog("Informe sua data de nascimento? ");
			String nomeMae = JOptionPane.showInputDialog("Informe o nome da m�e");
			String nomePai = JOptionPane.showInputDialog("Informe o nome do pai");
			String rua = JOptionPane.showInputDialog("Informe o nome da sua rua");
			String numeroCasa = JOptionPane.showInputDialog("Informe o numero da  casa");
			String cidade = JOptionPane.showInputDialog("Informe a cidade");
			String cep = JOptionPane.showInputDialog("informe o cep");
			String estado = JOptionPane.showInputDialog("informe o estado");
			String pis = JOptionPane.showInputDialog("informe o numero do pis");
			String estadoCivil = JOptionPane.showInputDialog("Qual o estado civil? ");
			String registroCovenio = JOptionPane.showInputDialog("Qual o registro covenio");
			String dataAdemissao = JOptionPane.showInputDialog("Informe a data de Ademiss�o");
			String dataDemissao = JOptionPane.showInputDialog("Informe a data de demiss�o");
			String cargo = JOptionPane
					.showInputDialog("Qual ser� o cargo ? 1- Operador caixa \n 2- vendedor\n 3- estoquista ");
			
			Funcionario funcionario = new Funcionario();
			/* Instancia de um funcion�rio */
			
			funcionario.setNome(nome);
			funcionario.setDataNascimento(datanascimento);
			funcionario.setNomeM�e(nomeMae);
			funcionario.setNomePai(nomePai);
			funcionario.setRua(rua);
			funcionario.setNumero(numeroCasa);
			funcionario.setCidade(cidade);
			funcionario.setCep(cep);
			funcionario.setEstado(estado);
			funcionario.setPis(pis);
			funcionario.setEstadoCivil(estadoCivil);
			funcionario.setRegistroCovenio(Integer.valueOf(registroCovenio));/* converter para inteiro */
			funcionario.setDataDemissao(dataAdemissao);
			funcionario.setDataDemissao(dataDemissao);
			/*Verificar a visualiza��o da classes juridicas e fisica*/
			
			
			
			
			funcionario.getFuncionarios().add(funcionario);
			
			

			/* colocar condi��o para que se for vendedor ter comiss�o */

			if (Integer.valueOf(cargo) == 3) {

				Vendedor vendedor = new Vendedor();
				String comissao = JOptionPane.showInputDialog("Qual ser� o valor da comiss�o  ? ");
				vendedor.setComissao(Double.valueOf(comissao));

			} else if (Integer.valueOf(cargo) == 1) {
				OperadorCaixa operadorCaixa = new OperadorCaixa();
				String comissaoCartao = JOptionPane
						.showInputDialog("Qual ser� o valor da comiss�o dos cart�es vendidos ? ");
				operadorCaixa.setComissaoVendasCartao(Double.valueOf(comissaoCartao));
			} 
				
			
			
			

			/* Mostra os dados cadastrados */
			System.out.println(funcionario);
			System.out.println("--------------------------------");
			System.out.println("Dados informados");
			System.out.println("Nome: " + nome);
			System.out.println("Data nascimento: " + datanascimento);
			System.out.println("Nome m�e: " + nomeMae);
			System.out.println("Nome Pai: " + nomePai);
			System.out.println("Rua: " + rua);
			System.out.println("Numero casa: " + numeroCasa);
			System.out.println("Cidade: " + cidade);
			System.out.println("Cep: " + cep);
			System.out.println("Estado: " + estado);
			System.out.println("pis" + pis);
			System.out.println("Estado civil" + estadoCivil);
			System.out.println("Covenio " + registroCovenio);
			System.out.println("data de ademiss�o: " + dataAdemissao);
			System.out.println("Data demiss�o: " + dataDemissao);
			
			System.out.println("--------------------------------");

		}
		
		

	}

}
