package conceitosBasicos;
import java.util.Scanner;

public class Java14_jogoLacoEnquanto {

	public static void main(String[] args) {
		
		//Exibe a msg na console
		System.out.println("Digite 1: para Melância, 2: para Banana, 3: para Pêsego e 0: para Raio.");
		//Cria um objeto "in" da classe Scanner
		Scanner in = new Scanner(System.in);
		//Variavel inteira
		int num = 0;
		//Se -1 for digitado o jogo será encerrado
		while(num != -1) {
			
			num = in.nextInt();
			//Se num for igual a 1 exibe a msg
			if(num == 1) {
				//Exibe a msg na String
				System.out.println("Você cortou a Melância");
			//Se num for igual a 2 exibe a msg
			}else if(num == 2) {
				//Exibe a msg na String
				System.out.println("Você cortou a Banana");
			//Se num for igual a 3 exibe a msg
			}else if(num == 3) {
				//Exibe a msg na String
				System.out.println("Você cortou o Pêsego");
			//Se num for igual a 0 exibe a msg	
			}else if(num == 0){
				//Exibe a msg na String
				System.out.println("Você cortou o Raio");
				
			}
		}
		//Fecha o laço
		in.close();

	}

}
