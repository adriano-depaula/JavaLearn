package conceitosBasicos;

public class Java18_declaracaoArrayUnidimensional {

	public static void main(String[] args) {
		
		//Cria um Array unidimensional
		int[] pontuacao = {90, 70, 50, 80, 60, 85};
		
		//Exibe todos os dados do Array pontuação
		for(int i = 0; i < pontuacao.length; i++) {
			
			System.out.print(pontuacao[i] + "-");
		}

	}

}
