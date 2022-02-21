package conceitosBasicos;

class Usuarios {
	
	public static int contagem;
	
	public static int getContagem() {
		return contagem;
	}
}

public class Java26_objetoCompatilhado {

	public static void main(String[] args) {
		
		new Usuarios();
		Usuarios.contagem++;
		
		new Usuarios();
		Usuarios.contagem++;
		
		new Usuarios();
		Usuarios.contagem++;
		
		System.out.println("Conta de usuario " + Usuarios.getContagem());

	}

}
