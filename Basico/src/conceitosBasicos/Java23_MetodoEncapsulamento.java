package conceitosBasicos;

class Pessoas{
	
	//Cria atributo privado
	private String nome;
	private int idade;
	
	//Cria um método público para definir o atributo privado
	public void setNome(String nome) {
		//"this" é uma refência ao objeto atual
		System.out.println(this);
		this.nome = nome;
	}
	
	//Cria um método público para obter o tributo privado
	public String getNome() {
		
		return this.nome;
	}
	
	public void setIdade(int idade) {
		
		this.idade = idade;
		
	}
	
	public int getIdade() {
		
		return this.idade;
		
	}
	
	public void diz() {
		
		System.out.println("Meu nome é " + nome + " este ano faço " + idade + " anos de idade");
	}
}

public class Java23_MetodoEncapsulamento {

	public static void main(String[] args) {

		Pessoas pes = new Pessoas();
		pes.setNome("Adriano de Paula");
		pes.setIdade(42);
		pes.diz();
		System.out.println(pes);
		System.out.println(pes.getNome() + " " + pes.getIdade());
		
	}
}
