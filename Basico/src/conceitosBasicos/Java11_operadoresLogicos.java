package conceitosBasicos;

public class Java11_operadoresLogicos {

	public static void main(String[] args) {
		
		//Variaáveis booleanas
		boolean verdadeiro = true;
		boolean falso = false;
		
		//Variaveis inteira
		int a = 1;
		int b = 2;
		
		//Exibe msg false
		System.out.println(verdadeiro && falso);
		//Exibe msg false
		System.out.println(falso && verdadeiro);
		//Exibe msg false
		System.out.println(falso && false);
		//Exibe msg true
		System.out.println(verdadeiro && true);
		
		System.out.println("-----------------");
		
		//Exibe msg true
		System.out.println(verdadeiro || falso);
		//Exibe msg true
		System.out.println(falso || verdadeiro);
		//Exibe msg true
		System.out.println(verdadeiro || true);
		//Exibe msg false
		System.out.println(falso || false);
		
		System.out.println("-----------------");
		
		//Exibe msg false
		System.out.println(!verdadeiro);
		//Exibe msg true
		System.out.println(!falso);
		
		System.out.println("-----------------");
		
		//Exibe msg true
		System.out.println(verdadeiro);
		//Exibe msg false
		System.out.println(a > b && verdadeiro);
		//Exibe msg true
		System.out.println(b > a && verdadeiro);
	
		System.out.println("-----------------");		
		
		//Exibe msg true
		System.out.println(verdadeiro);
		//Exibe msg true
		System.out.println(b > a || verdadeiro);
		//Exibe msg true
		System.out.println(a > b || verdadeiro);
		

	}

}
