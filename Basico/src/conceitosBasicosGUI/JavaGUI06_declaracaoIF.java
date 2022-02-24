package conceitosBasicosGUI;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class JavaGUI06_declaracaoIF {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Aplicação Gráfica JAVA");
		
		final JLabel rotuloPontuacao = new JLabel("Por favor entre com sua pontuação");
		
		final JTextField campoTextoPontuacao = new JTextField();
		
		final JLabel rotuloResultado = new JLabel("");
		
		JButton botaoEnviar = new JButton("Enviar");
		
		botaoEnviar.addActionListener(new ActionListener() {
			
			@Override
			
			public void actionPerformed(ActionEvent e) {
				
				int pontuacao = Integer.parseInt(campoTextoPontuacao.getText());
				
				if(pontuacao == 5) {
					
					rotuloResultado.setText("Excelente");
					
				}else if(pontuacao == 4) {
					
					rotuloResultado.setText("Bom");
					
				}else {
					
					rotuloResultado.setText("Precisa alcaçar a pontuação");
				}
			}
		});
		
		janela.setLayout(new GridLayout(2,2));
		janela.add(rotuloPontuacao);
		janela.add(rotuloResultado);
		janela.add(campoTextoPontuacao);
		janela.add(botaoEnviar);
		janela.setSize(500,100);
		janela.setVisible(true);

	}

}
