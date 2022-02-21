package conceitosBasicos;

class Pai {
	
	protected String nome;
	protected int idadee;
	
	public Pai() {
		System.out.println("Pai instância Pessoa()");
	}
	
	public Pai(String nome, int idade) {
		System.out.println("Pais Pai(String nome, int idade herdada)");
	}
	
	public void diz() {
		System.out.println("Pais podem falar");
	}
}

/*Pessoa é chamada de classe pai ou superclasse
 Aluno é chamada classe filha ou subclasse
 */
class Estudante extends Pai {
	public Estudante() {
		super();
		System.out.println("Instanciação da Subclasse Estudante()");
	}
	
	public Estudante(String nome, int idade) {
		super(nome, idade);
		System.out.println("Subclasse estudante(String nome, int idade) " + nome + " instânciada");
	}
}
/*1. A subclasse não pode acessar o atributo privado, método da classe pai
 *2. A subclasse pode acessar o método protegido, do atributo público, da classe pai
 */
public class Java27_heranca {

	public static void main(String[] args) {
		
		Estudante s = new Estudante();
		s.nome = "Brenno Felipe Manuel de Paula";
		s.idadee = 22;
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("");
		
		Estudante s2 = new Estudante("Wesley", 20);
		s2.diz();

	}

}
