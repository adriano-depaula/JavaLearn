package conceitosBasicos;
import java.util.Random;

public class Java21_numeroRandomico {

	public static void main(String[] args) {
		
		Random randomico = new Random();
		
		for(int i =0; i < 10; i++) {
			
			int num = randomico.nextInt(10);
			
			System.out.print(num + ",");
		}

	}

}
