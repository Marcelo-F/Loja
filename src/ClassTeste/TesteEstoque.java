package ClassTeste;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.JOptionPane;

import Estoque.Estoque;
import Estoque.Produto;



public class TesteEstoque extends Estoque{
	public static void main(String[] args)  {
		
		
	
		/*String produto = JOptionPane.showInputDialog("Qual o produto que será adicionado ? ");
		String cor = JOptionPane.showInputDialog("Qual a cor do produto ? ");
		String tamanho = JOptionPane.showInputDialog("Qual o tamanho?");
		String quantidade = JOptionPane.showInputDialog("Qual a quantidade ? ");
		String valor = JOptionPane.showInputDialog("Qual o valor ? ");
		String marca = JOptionPane.showInputDialog("Qual a marca? ");
		String infantil = JOptionPane.showInputDialog("Peça infantil ?  1- sim e 2- para não");
		String sexo  = JOptionPane.showInputDialog("Peça masculina ou feminima? 1- masc e 2- femenino"); 
		*/
	

		Estoque estoque  = new Estoque(); 
		
		
		int calca [] = {2};
		int camiseta [] = { 10, 30, 5, 5 };
		int camisa [] =  {10, 5,1,2,3,2};
		int bermuda [] = {1};
		int tenis [] = {3};
		
		
		estoque.setValor(90);
		estoque.setCamiseta(camiseta);
		estoque.setValor(20);
		estoque.setCamisa(camisa);
		estoque.setValor(20);
		estoque.setBermuda(bermuda);
		estoque.setValor(50);
		estoque.setTenis(tenis);
		estoque.setValor(300);
		
		

		 Estoque[] arrayEstoques = new Estoque[1];
		 
		 
			
		arrayEstoques[0] =estoque;
		
		
		
		
		
			for(int pos =0;  pos < arrayEstoques.length; pos++) {
				
				
				
				System.out.println("Valor parado em estoque: " + arrayEstoques[pos].getCalculoProduto());
				System.out.println("Capacidade de estoque Maxima: " + arrayEstoques[pos].getCapacidadeEstoque());
				System.out.println("Espaço livre de estoque: " + arrayEstoques[pos].getCapacidadeLivreEstoque());

				System.out.println("Valor total produto: " + arrayEstoques[pos].getValorTotalProduto());

				
				
				
				for (Estoque estoque1 : arrayEstoques) {
					for(int poscalca =0; poscalca < estoque1.getQuantidadeTotalProduto(); poscalca ++) {
						System.out.println("Quantidade adicionada ao estoque: " +(poscalca) + " capacidade do estoque =" +estoque1.getCapacidadeLivreEstoque());
						for(int poscamiseta =0; poscamiseta < estoque1.getCamiseta().length; poscamiseta ++) {
							System.out.println("Quantidade adicionada ao estoque: " +(poscamiseta) + " capacidade do estoque =" +estoque1.getCapacidadeLivreEstoque());
							for(int poscamisa =0; poscamisa < estoque1.getCamisa().length; poscamisa ++) {	
								System.out.println("Quantidade adicionada ao estoque: " +(poscamisa) + " capacidade do estoque =" +estoque1.getCapacidadeLivreEstoque());	
								for(int posbermuda  =0; posbermuda < estoque1.getBermuda().length; posbermuda ++) {
									System.out.println("Quantidade adicionada ao estoque: " +(posbermuda) + " capacidade do estoque =" +estoque1.getCapacidadeLivreEstoque());
									for(int postenis   =0; postenis < estoque1.getBermuda().length; postenis ++) {
										System.out.println("Quantidade adicionada ao estoque: " +(postenis) + " capacidade do estoque =" +estoque1.getCapacidadeLivreEstoque());
							}}}}}
							
							
							
							
						}
					
				}
				
				
		

			
			}
				
			
		
		
		
		
	}

	

	


