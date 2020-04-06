package ClassTeste;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.JOptionPane;

import Estoque.Estoque;
import Estoque.Produto;


/*Classe para testar o estoque*/
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
		
		
		int calca [] = {2,5};
		int camiseta [] = { 10, 30, 5, 5 };
		int camisa [] =  {20, 5,1,2,3,2};
		int bermuda [] = {5 };
		int tenis [] = {3};
		/*na posição  0 terá que retornar 40*/
		
	
		estoque.setCamiseta(camiseta);
		estoque.setValor(20);
		estoque.setCamisa(camisa);
		estoque.setValor(20);
		estoque.setBermuda(bermuda);
		estoque.setValor(50);
		estoque.setTenis(tenis);
		estoque.setValor(300);
		estoque.setCalca(calca);
		estoque.setValor(20.00);
		
		estoque.getProdutos().add(estoque);
		
		
	
		

		Estoque[] arrayEstoques = new Estoque[1];
		 
		 
			
		arrayEstoques[0] =estoque;
		for (int pos =0; pos < arrayEstoques.length; pos++ ) {
			System.out.println("Quantidade de camisa: "+camisa[pos] + " Valor total das camisas: "+estoque.ValorTotalCamisa());
			System.out.println("Quantidade de camiseta: "+camiseta[pos]+ " Valor total das camisetas: "+estoque.ValorTotalCamiseta());
			System.out.println("Quantidade de calça: "+calca[pos] + " Valor total das calca: " +estoque.ValorTotalCalca());
			System.out.println("Quanidade de bermuda:"+bermuda[pos] + " Valor total das bermuda: " +estoque.ValorTotalBermuda());
			System.out.println("Quantidade de tenis: " +tenis[pos] + " Valor total dos tenis " +estoque.ValorTotalTenis());
			System.out.println("Quantidade total em estoque: " +estoque.getQuantidade() + " Valor em estoque: R$ "+ estoque.getCalculoProduto());
			System.out.println("Total:  "+estoque.getQuantidade()
			);
			
			System.out.println("Espaço livre: " + estoque.getCapacidadeLivreEstoque() );
			System.out.println("Espaço Total permitido: " + estoque.getCapacidadeEstoque() );
		
		}
		
		
	
		
		
		
	
					
				}
				
				

		

			
			}
				
			
		
		
		
		
	

	

	


