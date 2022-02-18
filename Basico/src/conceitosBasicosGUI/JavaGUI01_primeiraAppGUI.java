package conceitosBasicosGUI;
import java.awt.BorderLayout;
import javax.swing.*;

public class JavaGUI01_primeiraAppGUI {

	public static void main(String[] args) {
		
		//Cria um objeto janela da classe JFrame
		JFrame janela = new JFrame("Aplicação Gráfica JAVA");
		
		//Cria um objeto rotulo da classe JLabel
		JLabel rotulo = new JLabel("Eu amo aplicação JAVA!");
		//Alinha o objeto rotulo ao centro
		rotulo.setHorizontalAlignment(JLabel.CENTER);
		
		//Cria um objeto rotuloNorte da classe JLabel
		JLabel rotuloNorte = new JLabel("Norte");
		//Alinha o objeto rotuloNorte ao centro
		rotuloNorte.setHorizontalAlignment(JLabel.CENTER);
		
		//Cria um objeto rotuloSul da classe JLabel
		JLabel rotuloSul = new JLabel("Sul");
		//Alinha o objeto rotuloSul ao centro
		rotuloSul.setHorizontalAlignment(JLabel.CENTER);
		
		//Cria um objeto rotuloCentro da classe JLabel
		JLabel rotuloCentro = new JLabel("Centro");
		//Alinha o objeto rotuloCentro ao centro
		//rotuloCentro.setHorizontalAlignment(JLabel.CENTER);
		
		//Cria um objeto rotuloOeste da classe JLabel
		JLabel rotuloOeste = new JLabel("Oeste");
		//Cria um objeto rotuloLeste da classe JLabel
		JLabel rotuloLeste = new JLabel("Leste");
		
		//Alinha o texto ao norte
		janela.add(rotuloNorte,BorderLayout.NORTH);
		//Alinha o texto ao sul
		janela.add(rotuloSul,BorderLayout.SOUTH);
		//Alinha o texto a oeste
		janela.add(rotuloOeste,BorderLayout.WEST);
		//Alinha o texto a lest
		janela.add(rotuloLeste,BorderLayout.EAST);
		//Alinha o texto ao centro
		janela.add(rotuloCentro,BorderLayout.CENTER);
		
		//Adiciona um rótulo no objeto janela
		janela.add(rotulo);
		
		
		//Cria um quadro com tamanho de 300 x 200
		janela.setSize(600,400);
		//Torna a janela visível
		janela.setVisible(true);

	}

}
