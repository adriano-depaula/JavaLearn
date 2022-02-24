package conceitosBasicos;

class Pessoal {
	
	private String nome;
	private int idade;
	
	//Cria um método construtor sem parâmetro
	public Pessoal() {
		
		System.out.println("Pessoa é instanciada");
	}
	
	//Cria o construtor com parâmetros
	public Pessoal(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
		
	}
	
	//Cria o construtor com parâmetros 
	public void diz() {
		
		System.out.println("Meu nome é " + nome + " este ano faço " + idade + " anos de idade");
	}
}


public class Java24_metodoConstrutor {

	public static void main(String[] args) {
		
		//Cria um objeto pelo construtor com parâmetros 
		new Pessoal();
		
		//Cria um objeto p2 pelo construtor com parâmetros 
		Pessoal p2 = new Pessoal("Joseph ", 22);
		
		p2.diz();
		
		//Objeto anônimo
		new Pessoal("Wesley ", 20).diz();

	}

}
