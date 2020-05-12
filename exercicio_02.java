package condicional;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner leitor = new Scanner(System.in);
		
		int prod, qnt;
		double total = 0;
		
		System.out.print ("Digite o código do produto: ");
		prod=leitor.nextInt();
		
		System.out.print ("Digite a quantidade: ");
		qnt=leitor.nextInt();
		
		
		
		
		switch(prod) {
		 
		case 100:
			System.out.println ("cachorro quente.");
			total = qnt * 3.2;
			break;
			
		case 101: 
			System.out.println ("bauru simples.");
			total = qnt * 4.3;
			break;
			
		case 102: 
			System.out.println ("bauru com ovo");
			total = qnt * 5.5;
			break;
			
		case 103: 
			System.out.println ("hambúrguer. ");
			total = qnt * 3.2;
			break;
			
		case 104: 
				System.out.println ("Cheeseburguer. ");
				total = qnt * 4.3;
				break;
		
		case 105:
			System.out.println ("Refigerante. ");
			total = qnt * 4.0;
			break;
			
			default:
				System.out.println ("produto não cadastrado.");
			
			
		
		}
		
		System.out.print("total: " + total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
