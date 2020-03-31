
package ClassTeste;

import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import CadastroPessoa.CadastroPessoa;
import Cliente.Cliente;
import Funcionario.Funcionario;
import Funcionario.OperadorCaixa;
import Funcionario.Vendedor;

public class ClassTeste {
	public static void main(String[] args) {

		String escolha = JOptionPane
				.showInputDialog("Para cadastrar cliente, digite 1 \n Para cadastrar um funcionário Digite 2\n");
		Integer.valueOf(escolha);

		if (Integer.valueOf(escolha) == 1) {

			String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
			String datanascimento = JOptionPane.showInputDialog("Informe a data de nascimento? ");
			String nomeMae = JOptionPane.showInputDialog("Informe o nome da mãe: ");
			String nomePai = JOptionPane.showInputDialog("Informe o nome do pai: ");
			String rua = JOptionPane.showInputDialog("Informe o nome de sua rua: ");
			String numeroCasa = JOptionPane.showInputDialog("Informe o numero da casa: ");
			String cidade = JOptionPane.showInputDialog("Informe a cidade: ");
			String cep = JOptionPane.showInputDialog("informe o cep: ");
			String estado = JOptionPane.showInputDialog("informe o estado: ");
			String rendaSalarial = JOptionPane.showInputDialog("Renda:  ");

			/* Instancia um cliente */

			Cliente cliente = new Cliente();

			cliente.setNome(nome);
			cliente.setDataNascimento(datanascimento);
			cliente.setNomeMãe(nomeMae);
			cliente.setNomePai(nomePai);
			cliente.setRua(rua);
			cliente.setNumero(numeroCasa);
			cliente.setCidade(cidade);
			cliente.setCep(cep);
			cliente.setEstado(estado);
			cliente.setRendaSalarial(rendaSalarial);

			System.out.println("--------------------------------");
			System.out.println("Confirme os dados");
			System.out.println("Nome: " + nome);
			System.out.println("Data nascimento: " + datanascimento);
			System.out.println("Nome mãe: " + nomeMae);
			System.out.println("Nome Pai: " + nomePai);
			System.out.println("Rua: " + rua);
			System.out.println("Numero casa: " + numeroCasa);
			System.out.println("Cidade: " + cidade);
			System.out.println("Cep: " + cep);
			System.out.println("Estado: " + estado);
			System.out.println("--------------------------------");

		} else if (Integer.valueOf(escolha) == 2) {

			String nome = JOptionPane.showInputDialog("Informe o seu nome");
			String datanascimento = JOptionPane.showInputDialog("Informe sua data de nascimento? ");
			String nomeMae = JOptionPane.showInputDialog("Informe o nome da mãe");
			String nomePai = JOptionPane.showInputDialog("Informe o nome do pai");
			String rua = JOptionPane.showInputDialog("Informe o nome de sua rua");
			String numeroCasa = JOptionPane.showInputDialog("Informe o numero da sua casa");
			String cidade = JOptionPane.showInputDialog("Informe a cidade");
			String cep = JOptionPane.showInputDialog("informe o cep");
			String estado = JOptionPane.showInputDialog("informe o estado");

			String pis = JOptionPane.showInputDialog("informe o numero do pis");
			String estadoCivil = JOptionPane.showInputDialog("Qual o estado civil? ");
			String registroCovenio = JOptionPane.showInputDialog("Qual o registro covenio");
			String dataAdmissao = JOptionPane.showInputDialog("Qual o estado civil? ");
			String dataDemissao = JOptionPane.showInputDialog("Informe a data de demissão");
			String cargo = JOptionPane
					.showInputDialog("Qual será o cargo ? 1- Operador caixa \n 2- vendedor\n 3- estoquista ");

			Funcionario funcionario = new Funcionario();
			/* Instancia de um funcionário */

			funcionario.setNome(nome);
			funcionario.setDataNascimento(datanascimento);
			funcionario.setNomeMãe(nomeMae);
			funcionario.setNomePai(nomePai);
			funcionario.setRua(rua);
			funcionario.setNumero(numeroCasa);
			funcionario.setCidade(cidade);
			funcionario.setCep(cep);
			funcionario.setEstado(estado);
			funcionario.setPis(pis);
			funcionario.setEstadoCivil(estadoCivil);
			funcionario.setRegistroCovenio(Integer.valueOf(registroCovenio));/* converter para inteiro */
			funcionario.setDataDemissao(dataAdmissao);
			funcionario.setDataDemissao(dataDemissao);

			/* colocar condição para que se for vendedor ter comissão */

			if (Integer.valueOf(cargo) == 3) {

				Vendedor vendedor = new Vendedor();
				String comissao = JOptionPane.showInputDialog("Qual será o valor da comissão  ? ");
				vendedor.setComissao(Double.valueOf(comissao));

			} else if (Integer.valueOf(cargo) == 1) {
				OperadorCaixa operadorCaixa = new OperadorCaixa();
				String comissaoCartao = JOptionPane
						.showInputDialog("Qual será o valor da comissão dos cartões vendidos ? ");
				operadorCaixa.setComissaoVendasCartao(Double.valueOf(comissaoCartao));
			}

			/* Mostra os dados cadastrados */
			System.out.println("--------------------------------");
			System.out.println("Dados informados");
			System.out.println("Nome: " + nome);
			System.out.println("Data nascimento: " + datanascimento);
			System.out.println("Nome mãe: " + nomeMae);
			System.out.println("Nome Pai: " + nomePai);
			System.out.println("Rua: " + rua);
			System.out.println("Numero casa: " + numeroCasa);
			System.out.println("Cidade: " + cidade);
			System.out.println("Cep: " + cep);
			System.out.println("Estado: " + estado);
			System.out.println("pis" + pis);
			System.out.println("Estado civil" + estadoCivil);
			System.out.println("Covenio " + registroCovenio);
			System.out.println("data de ademissão: " + dataAdmissao);
			System.out.println("Data demissão: " + dataDemissao);
			System.out.println("--------------------------------");

		}

	}

}
