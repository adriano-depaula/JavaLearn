package conceitosBasicos;
import java.util.Scanner;

public class Java12_declaracaoSwitch {

	public static void main(String[] args) {
		
		System.out.println("Tecla um número 0: Sobe, 1: Desce, 2: Esquerda, 3: Direita");
		
		Scanner in = new Scanner(System.in);
		
		int numero = in.nextInt();
		
		switch(numero) {
		
		case 0:
			System.out.println("Move o avião pra cima");
			//Termina a execução do código
			break;
		case 1:
			System.out.println("Move o avião pra baixo");
			break;
		case 2:
			System.out.println("Move o avião pra esquerda");
			break;	
		case 3:
			System.out.println("Move o avião pra direita");
			break;
			// Não houve correspondência
			default:
			System.out.println("O avião não se move");
		
		}
		
		in.close();

	}

}
