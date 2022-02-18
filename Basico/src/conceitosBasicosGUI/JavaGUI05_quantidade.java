package conceitosBasicosGUI;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class JavaGUI05_quantidade {

	public static void main(String[] args) {
		
		//Cria um objeto janela
		JFrame janela = new JFrame("Aplicação Gráfica JAVA");
		
		//Cria um objeto rotulo
		final JLabel rotuloQuantidade = new JLabel("Quantidade = ");
		
		//Cria um objeto campo de texto
		final JTextField campoTextoQuantidade = new JTextField();
		
		//Define o string "1"
		campoTextoQuantidade.setText("1");
		
		//Cria um objeto botão
		JButton botaoIncremento = new JButton("+");
		
		botaoIncremento.addActionListener(new ActionListener() {
			
			@Override
			
			public void actionPerformed(ActionEvent e) {
				
				int quantidade = Integer.parseInt(campoTextoQuantidade.getText());
				quantidade++;
				campoTextoQuantidade.setText(Integer.toString(quantidade));
			}
		});
		
		JButton botaoDecremento = new JButton("-");
		
		botaoDecremento.addActionListener(new ActionListener() {
			
			@Override
			
			public void actionPerformed(ActionEvent e) {
				
				int quantidade = Integer.parseInt(campoTextoQuantidade.getText());
				quantidade--;
				campoTextoQuantidade.setText(Integer.toString(quantidade));
			}
		});
		
		
		janela.setLayout(new GridLayout(1,4));
		janela.add(rotuloQuantidade);
		janela.add(campoTextoQuantidade);
		janela.add(botaoIncremento);
		janela.add(botaoDecremento);
		
		janela.setSize(300,100);
		janela.setVisible(true);

	}

}
