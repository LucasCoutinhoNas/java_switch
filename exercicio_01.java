package condicional;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner leitor = new Scanner(System.in);
		
		int num;
		
		
		System.out.print ("Digite o c�digo do produto");
		num=leitor.nextInt();
		

		switch(num) {
		 
		case 001:
			System.out.println ("a classifica��o do seu produto � parafuso");
			break;
			
		case 002: 
			System.out.println ("a classifica��o do seu produto � porca");
			break;
			
		case 003: 
			System.out.println ("a classifica��o do seu produto � prego");
			break;
			
		case 004: 
			System.out.println (" a classifica��o do seu produto � ferramenta");
			break;
			
			default:
				System.out.println ("a classifica��o do seu produto � outros");
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
