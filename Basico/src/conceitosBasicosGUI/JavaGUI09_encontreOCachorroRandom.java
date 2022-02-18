package conceitosBasicosGUI;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class JavaGUI09_encontreOCachorroRandom {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Aplicação Gráfica JAVA");
		
		final int[][] maps = {
				
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0}
				
		};
		
		Random randomico = new Random();
		
		for(int i = 0; i < maps.length; i++) {
			
			for(int c = 0; c < maps[i].length; c++) {
				
				maps[i][c] = randomico.nextInt(2) + 1;
			}
		}
		
		janela.setLayout(new GridLayout(4,4));
		
		for(int i = 0; i < maps.length; i++) {
			
			for(int c = 0; c < maps[i].length; c++) {
				
				final JButton botao = new JButton();
				botao.setName(Integer.toString(maps[i][c]));
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
			
		}
		
		janela.setSize(250,250);
		janela.setVisible(true);

	}

}
