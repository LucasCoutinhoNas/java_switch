package condicional;

import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leitor = new Scanner(System.in);
		
		int cod;
		float pre�o, total, valorfinal, valor3;
		
		System.out.print ("Digite o c�digo do produto: ");
		cod=leitor.nextInt();
		
		System.out.print ("Digite a quantidade: ");
		pre�o=leitor.nextInt();
		
		switch (cod) {
		
		case 1:
			total = pre�o * 10/100;
			valorfinal=pre�o-total;
			
			
			System.out.print("com 10 por cento de desconto: "+ valorfinal + ("R$"));
			
			break;
			
		case 2:
			total = pre�o * 5/100;
			valorfinal=pre�o-total;
	
			System.out.print("com 5 por cento de desconto: "+ valorfinal + ("R$")  );
			
			break;
			
		case 3:
			valorfinal = pre�o /2;
			
			System.out.print("parcelado em 2 vezes: "+ valorfinal + ("R$") );
			
			break;
			
		case 4:
			total = pre�o * 10/100;
			valorfinal=pre�o+total;
			valor3 = valorfinal /3;
			
			System.out.print("total parcelado em 3 vezes + 10% de desconto: "+ valorfinal + ("R$")  );
			
			break;
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
