
package gestor_de_contenido;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;

public class GA_LayoutNulo extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new GA_LayoutNulo();
		
	}

	GA_LayoutNulo(){
		setTitle("Gestor de contenido"); //define el título que aparece en la parte superior de la ventana
		
		setSize(500,500);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo por 500 pixeles de ancho

		setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
		
		componentesInit();
		
		setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
		
		setVisible(true); //le confiere visibilidad a la ventana
	}
	
	
	public void componentesInit() {
	
		setLayout(null);
	
		JButton btn1 = new JButton ("btn1");
		btn1.setBounds(1, 1, 50, 50);
	
		JButton btn2 = new JButton ("btn2");
		btn2.setBounds(100, 1, 50, 50);
	
		JButton btn3 = new JButton ("btn3");
		btn3.setBounds(1, 100, 50, 50);
	
		JButton btn4 = new JButton ("btn4");
		btn4.setBounds(100, 100, 50, 50);
	
		add(btn1);add(btn2);add(btn3);add(btn4);
	
	//se tiene que bloquear la ventana para que no se redimensione si el tamaño
	//de un boton excede el de la ventana
	

	
	}
	                
}
