package conceitosBasicos;

class Calculadora {
	
	public double add(double a, double b) {
		
		return a + b;
	}
	
	public int add(int a, int b) {
		
		return a + b;
	}
}

public class Java25_sobrecargaMetodo {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		int result = c.add(10, 20);
		System.out.println(result);
		
		//Chame o método de sobrecarga com diferentes tipos de parâmetros
		double result2 = c.add(30.5,40.2);
		System.out.println(result2);

	}

}
