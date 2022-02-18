package conceitosBasicosGUI;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;





public class JavaGUI08_jogoEncontreCachorro {

	public static void main(String[] args) {
		

		JFrame janela = new JFrame("Aplicação Gráfica JAVA");
		
		int[][] matriz = {
				
				{1, 1, 1, 1},
				{1, 1, 1, 1},
				{1, 2, 1, 1},
				{1, 1, 1, 1}
		};
		
		janela.setLayout(new GridLayout(4,4));
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int c = 0; c < matriz[i].length; c++) {
				
				final JButton botao = new JButton();
				
				botao.setName(Integer.toString(matriz[i][c]));
				
				janela.add(botao);
				botao.addActionListener(new ActionListener() {
					
					@Override
					
					public void actionPerformed(ActionEvent e) {
						
						if(botao.getName().equals("1")) {
							
							botao.setText("*");
							
						}else if(botao.getName().equals("2")) {
							
							botao.setText("Dog");
							
						}
					}
					
				});
			}
			
			janela.setSize(250,250);
			janela.setVisible(true);
		}

	}

}
