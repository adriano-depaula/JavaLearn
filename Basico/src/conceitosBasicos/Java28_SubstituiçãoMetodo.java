package conceitosBasicos;

class Parente {
	public void diz() {
		System.out.println("Parentes falam");
	}
}

class EstudanteChines extends Parente {
	public void diz() {
		System.out.println("Fala Chinês");
	}
}

class EstudanteAmericano extends Parente {
	public void diz() {
		System.out.println("Fala Inglês");
	}
}

public class Java28_SubstituiçãoMetodo {

	public static void main(String[] args) {
		
		EstudanteChines alunoChines = new EstudanteChines();
		alunoChines.diz();
		
		EstudanteAmericano alunoAmericano = new EstudanteAmericano();
		alunoAmericano.diz();
	}

}
