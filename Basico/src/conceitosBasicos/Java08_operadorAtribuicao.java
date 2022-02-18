package conceitosBasicos;

public class Java08_operadorAtribuicao {

	public static void main(String[] args) {
		
		//Cria variável inteira "d" e atribuindo valor 4
		int d = 4;
		//Exibe a variável d e incrementa um na variavel "d"
		System.out.println(d++);
		
		//Variável inteira "d" e atribuindo valor 4
		d = 4;
		//Incrementa um e exibe a variável
		System.out.println(++d);
		d = 4;
		//Exibe a variável d e decrementa um na variavel "d"
		System.out.println(d--);
		d = 4;
		//Decrementa um e exibe a variável
		System.out.println(--d);
		
		//Variavel inteira "resultado" com o valor 10 atribuido
		int resultado = 10;
		//Adiciona 1 na variável "resultado"
		resultado = resultado + 1;
		//Exibe o valor da variável resultado
		System.out.println(resultado);
		//Variavel inteira "resultado" com o valor 10 atribuido
		resultado = 10;
		//Adiciona 1 na variável "resultado"
		resultado++;
		//Exibe o valor da variável resultado
		System.out.println(resultado);
		
		//Variavel inteira "resultado" com o valor 10 atribuido
		resultado = 10;
		//Adiciona 1 na variável "resultado"
		resultado += 1;
		//Exibe o valor da variável resultado
		System.out.println(resultado);

	}

}
