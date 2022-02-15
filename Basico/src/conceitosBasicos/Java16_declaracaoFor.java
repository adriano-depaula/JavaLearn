package conceitosBasicos;

public class Java16_declaracaoFor {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 64; i++) {
			
			System.out.print("*");
			// 8%8 == 0,16%8 ==0,12%8 == 0,32%8 == 0,48%8 == 0,64%8 == 0
			if(i % 8 == 0) {
				//Faça nova linha
				System.out.println("");
			}
		}

	}

}
