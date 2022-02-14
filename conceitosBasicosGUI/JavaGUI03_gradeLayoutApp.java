package conceitosBasicosGUI;
import java.awt.*;
import javax.swing.*;

public class JavaGUI03_gradeLayoutApp {

	public static void main(String[] args) {
		
		//Cria uma janela
		JFrame janela = new JFrame("Aplicação Gráfica JAVA");
		
		//Cria os botões na janela
		JButton botao0_0 = new JButton("0_0");
		JButton botao0_1 = new JButton("0_1");
		JButton botao0_2 = new JButton("0_2");
		JButton botao1_0 = new JButton("1_0");
		JButton botao1_1 = new JButton("1_1");
		JButton botao1_2 = new JButton("1_2");
		
		//Faz a grade de botões
		janela.setLayout(new GridLayout(2,3));
		
		//Adiciona os botões na janela
		janela.add(botao0_0);
		janela.add(botao0_1);
		janela.add(botao0_2);
		janela.add(botao1_0);
		janela.add(botao1_1);
		janela.add(botao1_2);
		//Define o tamanho da janela
		janela.setSize(300,200);
		//Torna a janela visível
		janela.setVisible(true);
		
		

	}

}
