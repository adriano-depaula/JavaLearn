package conceitosBasicos;

interface Presidente {
	String nome = "Presidente";
	public void ConstruirComunidadeHarmoniosa(String metodo);
}

class Governante implements Presidente {
	
	private String nome;
	
	public Governante(String nome) {	
		this.nome = nome;
	}
	
	public void ConstruirComunidadeHarmoniosa(String metodo) {	
		System.out.println(nome + " deve construir comunidade hamoniosa por " + metodo);	
	}
	
	public String getNome() {	
		return this.nome;	
	}
}

public class Java30_Interface {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Começa a conferência...");
		System.out.println("");
		Governante g1 = new Governante("Governante");
		g1.ConstruirComunidadeHarmoniosa("Educação");
	}

}
