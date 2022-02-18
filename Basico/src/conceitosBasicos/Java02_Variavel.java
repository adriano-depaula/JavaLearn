package conceitosBasicos;

public class Java02_Variavel {

	public static void main(String[] args) {
		
		/*Variáveis consiste de caracteres, _sublinhados, $ifrão e números
		  A primeira letra deve ser um caracter, ou sublinhado não pode ser número*/
		
		// Variável tipo String (Texto)
		String cestaFrutas = "Maçã";
		System.out.println(cestaFrutas);
		
		// Mudando o valor da variável
		cestaFrutas = "Laranja";
		System.out.println(cestaFrutas);
		
		String copo = "Água mineral";
		// Imprime dados do copo no console
		System.out.println(copo);
		
		// Modifica o valor da variável
		copo = "Coca-Cola";
		System.out.println(copo);
		
		// Esvazia os dados na memória da variável
		copo = "";
		System.out.println(copo);
		
		// Atribui um valor nulo para excluir a variável
		copo = null;
		System.out.println(copo);
	}

}
