package Funcionario;

public class OperadorCaixa  extends Funcionario  {
		private double valorVendaCartao = 5.00;	
		private int quantiCartaovend;
		private  double comissaoVendasCartao;
		
		
		
		public double getValorVendaCartao() {
			
			
			return valorVendaCartao;
		}
		public void setValorVendaCartao(double valorVendaCartao) {
			this.valorVendaCartao = valorVendaCartao;
		}
		public int getQuantiCartaovend() {
			

			return quantiCartaovend;
		}
		public void setQuantiCartaovend(int quantiCartaovend) {
			this.quantiCartaovend = quantiCartaovend;
		}
		public double getComissaoVendasCartao() {
			
			comissaoVendasCartao =+(quantiCartaovend*valorVendaCartao);
			
			
			return comissaoVendasCartao;
		}
		public void setComissaoVendasCartao(double comissaoVendasCartao) {
			this.comissaoVendasCartao = comissaoVendasCartao;
		}
		
		
		public float getSalario() {
		// TODO Auto-generated method stub
		return (float) (comissaoVendasCartao =+ 1800);
		}
		
		
		
		
		
}
