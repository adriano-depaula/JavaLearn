package conceitosBasicos;

public class java06_operadorAritmetico {
	
	public static int add(int a1, int b1) {
		
		return a1 + b1;
	}
	
	public static int sub(int a1, int b1) {
			
			return a1 - b1;
		}
	
	public static int multiply(int a1, int b1) {
		
		return a1 * b1;
	}
	
	public static int divide(int a1, int b1) {
		
		return a1 / b1;
	}

	public static void main(String[] args) {
		
		// Variáveis interas
		int a = 1;
		int b = 2;
		int c = 3;
		
		// Retorna o soma do método add() 
		int result = add(4, 2);
		//Imprime o resultado do método add()
		System.out.println(result);
		
		// Retorna a diferença do método sub()
		result = sub(4, 2);
		//Imprime o resultado do método su();
		System.out.println(result);
		
		// Retorna o produto do método multiply()
		result = multiply(4, 2);
		//Imprime o resultado do método multiply()
		System.out.println(result);
		
		// Retorna o quociente do método divide()
		result = divide(4, 2);
		//Imprime o resultado do método divide()
		System.out.println(result);
		
		//Imprime a soma de a + b
		System.out.println(a + b);
		
		//Imprime a diferença de a - b
		System.out.println(a - b);
		
		//Imprime o produto de a * b
		System.out.println(a * b);
		
		//Imprime o quociente de a / b
		System.out.println(a / b);
		
		//Imprime o resto de c % b
		System.out.println(c % b);
		
		//Imprime o resultado do método add();
		System.out.println(result);
		
	}

}
