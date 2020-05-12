package condicional;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {

		int opc;
		float nota1, nota2, nota3, soma1, soma2, mdaritmetica, ponderada;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("primeira nota:");
		nota1 = leitor.nextFloat();
		
		System.out.println("segunda nota:");
		nota2 = leitor.nextFloat();
		
		System.out.println("terceira nota:");
		nota3 = leitor.nextFloat();
		
		System.out.println("digite 1 para 'media aritmética' digite 2 para 'media ponderada'.");
		opc = leitor.nextInt();
		
		switch(opc){
		
			case 1:
				soma1= nota1 + nota2 + nota3;
				mdaritmetica = soma1/ 3;
				
			System.out.println("Valor Total = " +mdaritmetica);
			break;	
			
			
			case 2:
				soma2 = nota1*3 + nota2*3 + nota3*4;
				ponderada = soma2/10;
				
			System.out.println("Valor Total = " +ponderada);	
			break;
			
	}

}
	
}