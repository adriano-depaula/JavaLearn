package conceitosBasicos;

public class Java05_convertendoTipos {

	public static void main(String[] args) {
		
		byte varByte = 1;
		int varInt = 2;
		
		//Byte é convertido diretamente
		varInt = varByte;
		System.out.println(varInt);
		
		byte varByte2 = 1;
		int varInt2 = 2;
		
		// int é convertido em byte precisa de downcast
		varByte2 = (byte) varInt2;
		System.out.println(varByte2);
		
		// int pode ser convertido em char precisa de um molde, A regra de conversão por ASCII
		char f1 = 'a';
		int f2 = 98;
		
		f1 = (char) f2;
		System.out.println(f1);
		
		//Variáveis tipo String (Texto)
		String a = "1";
		String b = "2";
		//Concatena a String a + b
		String result = a + b;
		
		//Imprime o resultado da String result
		System.out.println(result);
		
		//Convertendo Strings a e b em inteiro
		int total = Integer.parseInt(a) + Integer.parseInt(b);
		//Imprime o resultado da variável total
		System.out.println(total);
		
	}

}
