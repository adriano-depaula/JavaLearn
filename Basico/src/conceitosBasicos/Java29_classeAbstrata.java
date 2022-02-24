package conceitosBasicos;

abstract class Pais {
	protected String frutas;
	
	public String getFrutas() {
		return this.frutas;
	}
	
	//Declare que deseja comprar frutas
	public abstract void comprar(String frutas);
}

class Filho extends Pais {
	private String nome;
	
	public Filho(String nome) {
		super();
		this.nome = nome;
	}
	
	public void comprar(String frutas) {
		this.frutas = frutas;
	}
	
	public String getNome() {
		return this.nome;
	}
}
/*1. O método abstrato não pode ter a implementação, apenas a declaração
 2. Se uma subclasse herda uma classe abstrata, a subclasse deve implementar todos
 os métodos abstrato da classe pai
 3. Classes abstratas não podem ser instanciadas diretamente, elas devem ser 
 instanciadas por subclasses*/
public class Java29_classeAbstrata {

	public static void main(String[] args) {
		Filho classeFilho = new Filho("Luke");
		classeFilho.comprar("de Frutas");
		System.out.println("Pai, eu comprei uma libra " + classeFilho.getFrutas());
	}

}
