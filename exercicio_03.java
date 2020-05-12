package condicional;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner leitor = new Scanner(System.in);
		
        int num;
		
		
		System.out.println ("| 1 | Executa a rotina de Inclusão de Alunos | ");
		System.out.println ("| 2 | Executa a rotina de Alteração de Alunos| ");
		System.out.println ("| 3 | Executa a rotina de Exclusão de Alunos | ");
		System.out.println ("| 4 | Executa a rotina de Consulta de Alunos | ");
		
		System.out.print("escolha uma das opções.");
		num=leitor.nextInt();
		

		switch(num) {
		 
		case 1:
			System.out.println ("Executa a rotina de Inclusão de Alunos.");
			break;
			
		case 2: 
			System.out.println ("Executa a rotina de Alteração de Alunos.");
			break;
			
		case 3: 
			System.out.println ("Executa a rotina de Exclusão de Alunos.");
			break;
			
		case 4: 
			System.out.println ("Executa a rotina de Consulta de Alunos.");
			break;
		
			default:
				System.out.println ("opção invalida");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
