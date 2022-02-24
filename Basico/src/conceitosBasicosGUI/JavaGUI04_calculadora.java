package conceitosBasicosGUI;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class JavaGUI04_calculadora {

	public static void main(String[] args) {
		
		//Cria um objeto janela
		JFrame janela = new JFrame("Aplicação Gráfica JAVA");
		
		final JTextField a_campoTexto = new JTextField("");
		final JTextField b_campoTexto = new JTextField("");
		
		final JLabel rotuloIgual = new JLabel("=");
		final JLabel rotuloResultado = new JLabel("0.0");
		
		//Cria um objeto botão de adição
		JButton botaoAdicao = new JButton("+");
		botaoAdicao.addActionListener(new ActionListener(){
			
			@Override
			
			public void actionPerformed(ActionEvent e){
				
				int a = Integer.parseInt(a_campoTexto.getText());
				int b = Integer.parseInt(b_campoTexto.getText());
				
				int resultado = a + b;
				rotuloResultado.setText(Integer.toString(resultado));
			}
		});
		
		//Cria um objeto botão de subtração
		JButton botaoSubtracao = new JButton("-");
		botaoSubtracao.addActionListener(new ActionListener(){
			
			@Override
			
			public void actionPerformed(ActionEvent e){
				
				int a = Integer.parseInt(a_campoTexto.getText());
				int b = Integer.parseInt(b_campoTexto.getText());
				
				int resultado = a - b;
				rotuloResultado.setText(Integer.toString(resultado));
			}
		});
		
		//Cria um objeto botão de subtração
		JButton botaoMultiplicacao = new JButton("*");
		botaoMultiplicacao.addActionListener(new ActionListener(){
			
			@Override
			
			public void actionPerformed(ActionEvent e){
				
				int a = Integer.parseInt(a_campoTexto.getText());
				int b = Integer.parseInt(b_campoTexto.getText());
				
				int resultado = a * b;
				rotuloResultado.setText(Integer.toString(resultado));
			}
		});
		
		//Cria um objeto botão de subtração
		JButton botaoDivisao = new JButton("*");
		botaoDivisao.addActionListener(new ActionListener(){
			
			@Override
			
			public void actionPerformed(ActionEvent e){
				
				int a = Integer.parseInt(a_campoTexto.getText());
				int b = Integer.parseInt(b_campoTexto.getText());
				
				int resultado = a / b;
				rotuloResultado.setText(Integer.toString(resultado));
			}
		});
		
		janela.setLayout(new GridLayout(2,4));
		janela.add(a_campoTexto);
		janela.add(b_campoTexto);
		janela.add(rotuloIgual);
		janela.add(rotuloResultado);
		janela.add(botaoAdicao);
		janela.add(botaoSubtracao);
		janela.add(botaoMultiplicacao);
		janela.add(botaoDivisao);
		
		janela.setSize(300,100);
		janela.setVisible(true);

	}

}
