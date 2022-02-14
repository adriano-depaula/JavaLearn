package conceitosBasicosGUI;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class JavaGUI02_campoTexto {

	public static void main(String[] args) {
		
		//Cria um objeto janela da classe JFrame
		JFrame janela = new JFrame("Aplicação Gráfica JAVA");
		
		//Cria um campo texto do método JTextField()
		JTextField campoTexto = new JTextField();
		//Alinha o campo de texto ao Norte
		janela.add(campoTexto,BorderLayout.NORTH);
		//Cria um objeto constante do método JLabel()
		final JLabel rotulo = new JLabel("Clique no botão");
		//Cria um objeto botao do método JButton()
		JButton botao = new JButton("Clique no botão");
		botao.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rotulo.setText("O botão foi clicado");
			}
		});
		//Alinha o botão ao sul da janela
		janela.add(rotulo,BorderLayout.NORTH);
		//Alinha o botão ao sul da janela
		janela.add(botao,BorderLayout.SOUTH);
		//Define o tamanho da janela para 300x200
		janela.setSize(300,200);
		//Torna a janela visível
		janela.setVisible(true);

	}

}
