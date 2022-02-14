package conceitosBasicosGUI;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class JavaGUI07_mesada {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Aplicação Gráfica JAVA");
		
		final JLabel rotuloDinheiro = new JLabel("Por favor entre com sua mesada:");
		final JTextField campoTextoDinheiro = new JTextField();
		final JLabel rotuloResultado = new JLabel("");
		JButton botaoEnviar = new JButton("Enviar");
		
		botaoEnviar.addActionListener(new ActionListener() {
			
			@Override
			
			public void actionPerformed(ActionEvent e) {
				
				int dinheiro = Integer.parseInt(campoTextoDinheiro.getText());
				
				if(dinheiro >= 100 && dinheiro <= 200) {
					
					rotuloResultado.setText("Pode comprar Barbie Dream Horse");
					
				}else if(dinheiro >= 50 && dinheiro < 100) {
					
					rotuloResultado.setText("Pode comprar LeGo");
					
				}else if(dinheiro > 10 && dinheiro < 50) {
					
					rotuloResultado.setText("Pode comprar um jogo da Disney");
				}else {
					
					rotuloResultado.setText("Precisa de mais dinheiro");
				}
			}
		});
		
		janela.setLayout(new GridLayout(2,2));
		janela.add(rotuloDinheiro);
		janela.add(rotuloResultado);
		janela.add(campoTextoDinheiro);
		janela.add(botaoEnviar);
		
		janela.setSize(400,100);
		janela.setVisible(true);

	}

}
