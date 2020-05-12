package condicional;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner leitor = new Scanner(System.in);
		
		int num;
		
		
		System.out.print ("Digite o código do produto");
		num=leitor.nextInt();
		

		switch(num) {
		 
		case 001:
			System.out.println ("a classificação do seu produto é parafuso");
			break;
			
		case 002: 
			System.out.println ("a classificação do seu produto é porca");
			break;
			
		case 003: 
			System.out.println ("a classificação do seu produto é prego");
			break;
			
		case 004: 
			System.out.println (" a classificação do seu produto é ferramenta");
			break;
			
			default:
				System.out.println ("a classificação do seu produto é outros");
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
