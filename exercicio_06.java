package condicional;

import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		int opcao;
		float salario, diferenca, salarioporcento, salariototal;
		
	
		System.out.print ("Qual o codigo do cargo?");
		opcao = leitor.nextInt();
		
		System.out.print ("Salario atual:");
		salario = leitor.nextInt();
		
		switch (opcao) {
		
		case 001:
			salarioporcento = salario *10/100;
			salariototal = salario + salarioporcento;
			diferenca = salariototal - salario;
			
			System.out.println ("Diretor");
			System.out.println ("Antigo Salário: " +salario+ (" R$"));
			System.out.println ("Novo Salário: " +salariototal+ (" R$"));
			System.out.println ("Diferença: " +diferenca+ (" R$"));
		
		break;
		
		case 002:
			salarioporcento = salario *20/100;
			salariototal = salario + salarioporcento;
			diferenca = salariototal - salario;
			
			System.out.println ("Engenheiro");
			System.out.println ("Antigo Salário: " +salario+ (" R$"));
			System.out.println ("Novo Salário: " +salariototal+ (" R$"));
			System.out.println ("Diferença: " +diferenca+ (" R$"));
		
		break;
		
		case 003:
			salarioporcento = salario *30/100;
			salariototal = salario + salarioporcento;
			diferenca = salariototal - salario;
			
			System.out.println ("Técnico");
			System.out.println ("Antigo Salário: " +salario+ (" R$"));
			System.out.println ("Novo Salário: " +salariototal+ (" R$"));
			System.out.println ("Diferença: " +diferenca+ (" R$"));
		
		break;
		
		case 004:
			salarioporcento = salario *10/100;
			salariototal = salario + salarioporcento;
			diferenca = salariototal - salario;
			
			System.out.println ("Gerente");
			System.out.println ("Antigo Salário: " +salario+ (" R$"));
			System.out.println ("Novo Salário: " +salariototal+ (" R$"));
			System.out.println ("Diferença: " +diferenca+ (" R$"));
		
		break;
		
		case 005:
			salarioporcento = salario *30/100;
			salariototal = salario + salarioporcento;
			diferenca = salariototal - salario;
			
			System.out.println ("Analista");
			System.out.println ("Antigo Salário: " +salario+ (" R$"));
			System.out.println ("Novo Salário: " +salariototal+ (" R$"));
			System.out.println ("Diferença: " +diferenca+ (" R$"));
		
		break;
		
		case 006:
			salarioporcento = salario *20/100;
			salariototal = salario + salarioporcento;
			diferenca = salariototal - salario;
			
			System.out.println ("Coordenador");
			System.out.println ("Antigo Salário: " +salario+ (" R$"));
			System.out.println ("Novo Salário: " +salariototal+ (" R$"));
			System.out.println ("Diferença: " +diferenca+ (" R$"));
		
		break;
		
		default:
			System.out.println ("opção invalida.");
		
		
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
	
	
	
	
	
	
