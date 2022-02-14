package conceitosBasicos;

public class Java03_TiposDadosBasicos {

	public static void main(String[] args) {
		
		// 1 Byte = 8 bits -2⁷ ~ 2⁷ -1 (-128 ~ 127)
		byte a1 = 1;
		
		// 2 bytes = 16 bits -2¹5 -1
		short a2 = 10;
		
		// 4 bytes = 32 bits -2³1 ~ 2³1 -1
		int a3 = 100;
		
		// 8 bytes = 64 bits -2⁶3 ~ 2⁶3 -1
		long a4 = 1000;
		
		// 8 bytes = 64 bits
		double b1 = 10.1;
		
		// 4 bytes = 32 bits
		float b2 = 12.2f;
		
		// 2 bytes = 16 bits
		char c1 = 'a';
		
		// 1 byte = 8 bits
		boolean d1 = true;
		boolean d2 = false;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(d2);

	}

}
