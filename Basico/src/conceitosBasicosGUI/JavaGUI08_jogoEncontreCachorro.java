package conceitosBasicosGUI;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JFrame;

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
				
				JButton botao = new JButton();
				
				botao.setName(Integer.toString(matriz[i][c]));
				
				janela.add(botao);
			}
			
			janela.setSize(200,200);
			janela.setVisible(true);
		}

	}

}
