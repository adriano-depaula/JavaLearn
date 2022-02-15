package conceitosBasicos;

public class Java20_arrayBidimensional {

	public static void main(String[] args) {
		
		int [][] matriz = {
			
			{10, 20, 30},
			{40, 50, 60},
			{70, 80, 90}
		};
		
		//i: índice linhas, c: índice de colunas
		for(int i = 0; i < matriz.length; i++) {
			
			for(int c = 0; c < matriz[i].length; c++) {
				
				System.out.print(matriz[i][c] + " ");
				
			}
			
			System.out.println("");
			
		}
	}

}
