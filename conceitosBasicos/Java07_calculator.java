package conceitosBasicos;

public class Java07_calculator {
	
	public int add(int a, int b) {
		
		return a + b;
	}
	
	public int sub(int a, int b) {
		
		return a - b;
	}
	
	public int multiply(int a, int b) {
		
		return a * b;
	}
	
	public int divide(int a, int b) {
		
		return a / b;
	}
	
	public static void main(String[] args) {
		
		//Objeto JAVA calc criado apartir da classe Java07_calculator
		Java07_calculator calc = new Java07_calculator();
		
		//Usa o objeto calc para acessar o método add() 
		int result = calc.add(4, 2);
		//Retona a soma na variável result
		System.out.println(result);
		
		//Usa o objeto calc para acessar o método sub()
		result = calc.sub(4, 2);
		//Retona a diferença na variável result
		System.out.println(result);
		
		//Usa o objeto calc para acessar o método multiply()
		result = calc.multiply(4, 2);
		//Retona o produto da variável result
		System.out.println(result);
		
		//Usa o objeto calc para acessar o método divide()
		result = calc.divide(4, 2);
		//Retona o quociente da variável result
		System.out.println(result);
	}

}
