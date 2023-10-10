package gestor_de_contenido;

//Con BoxLayout

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;

public class GA_BoxLayout extends JFrame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		new GA_BoxLayout();

	}

	GA_BoxLayout(){
		
		setTitle("Gestor de contenido"); //define el título que aparece en la parte superior de la ventana
		
		setSize(500,500);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo por 500 pixeles de ancho

		setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
		
		componentesInit();
		
		setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
		
		setVisible(true); //le confiere visibilidad a la ventana
	}
	
	public void componentesInit() {
		
		// el gestor de contenido por default de JFRAME es BorderLayaout
		// pero de igual manera se puede especificar
		Container cpane=this.getContentPane();
		
		// Cambiar dirección de componentes
		// cpane.setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);
		// cpane.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
		//top-to-bottom
		
		//cpane.setLayout(new BoxLayout(cpane,BoxLayout.X_AXIS));
		//o este
		BoxLayout gl = new BoxLayout(cpane, BoxLayout.Y_AXIS);
		setLayout(gl);
		
		JButton btn1 = new JButton("Botón 1");
		
		//propiedades de tamaños, se necesitan especificar para 
		btn1.setMinimumSize(new Dimension(50, 25)); 
		btn1.setPreferredSize(new Dimension(150, 125)); 
		btn1.setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE)); 
		
		
		JButton btn2 = new JButton("Botón 2");
		//btn2.setPreferredSize(new Dimension(600, 100));
		JButton btn3 = new JButton("Botón 3");
		JButton btn4 = new JButton("Botón 4");
		JButton btn5 = new JButton("Botón 5");
		JButton btn6 = new JButton("Botón 6");
		//BOTTOM_ALIGNMENT CENTER_ALIGNMENT LEFT_ALIGNMENT RIGHT_ALIGNMENT
		btn1.setAlignmentX(cpane.CENTER_ALIGNMENT);
		btn2.setAlignmentX(cpane.CENTER_ALIGNMENT);
		btn3.setAlignmentX(cpane.CENTER_ALIGNMENT);
		btn4.setAlignmentX(cpane.CENTER_ALIGNMENT);
		btn5.setAlignmentX(cpane.CENTER_ALIGNMENT);
		btn6.setAlignmentX(cpane.CENTER_ALIGNMENT);
		
		//solo add, this.add, o cpane.add
		cpane.add(btn1);
		
		/*
		 * Dimension minSize = new Dimension(5,100);
		 * Dimension prefSize = new Dimension(5, 100);
		 * Dimension maxSize = new Dimension(Short.MAX_VALUE, 100); 
		 * add(new Box.Filler(new Dimension(miniSize, prefSize, maxSize)));
		 *		 * */
		
		cpane.add(btn2);
		cpane.add(btn3);
		
		//add(new Box.createRigidArea(new Dimension(5, 65))
		add(btn4);add(btn5);
		
		//add(new Box.createRigidArea(new Dimension(1, 20))
		add(btn6);
		
		
		
		
		
	}
}
