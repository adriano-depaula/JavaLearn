package conceitosBasicos;

class Pessoa {
	
	String nome;
	
	int idade;
	
	public void diz() {
		
		System.out.println("Meu nome é " + nome + " este ano faço " + idade + " anos de idade");
	}
}

public class Java22_ClasseTeste {

	public static void main(String[] args) {
		
		//Cria referência do objeto "p" nova pessoa
		Pessoa p = new Pessoa();
		
		p.nome = "Adriano de Paula";
		p.idade = 42;
		p.diz();
		
		Pessoa p2 = new Pessoa();
		
		p2.nome = "Domenica Daniela";
		p2.idade = 40;
		p2.diz();
		
		

	}

}
