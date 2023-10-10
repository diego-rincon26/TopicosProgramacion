package gestor_de_contenido;

//Con FlowLayout

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;

public class GA_FlowLayout extends JFrame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		new GA_FlowLayout();

	}


	GA_FlowLayout(){
		
		setTitle("Gestor de contenido"); //define el título que aparece en la parte superior de la ventana
		
		setSize(500,500);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo por 500 pixeles de ancho

		setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
		
		componentesInit();
		
		setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
		
		setVisible(true); //le confiere visibilidad a la ventana
	}
	
	public void componentesInit() {
		
		
		setLayout(new FlowLayout());
		JButton btn1 = new JButton("Botón 1");
		
		setLayout(new FlowLayout());
		JButton btn2 = new JButton("Botón 2");
		
		add(btn1);add(btn2);
		
		
	}
}
