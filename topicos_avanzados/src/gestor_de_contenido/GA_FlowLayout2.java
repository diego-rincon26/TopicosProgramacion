package gestor_de_contenido;

//Con FlowLayout

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;

public class GA_FlowLayout2 extends JFrame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		new GA_FlowLayout2();

	}


	GA_FlowLayout2(){
		
		setTitle("Gestor de contenido"); //define el título que aparece en la parte superior de la ventana
		
		setSize(500,500);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo por 500 pixeles de ancho

		setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
		
		componentesInit();
		
		setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
		
		setVisible(true); //le confiere visibilidad a la ventana
	}
	
	public void componentesInit() {
		
		Container cpane = this.getContentPane();
		
		//cambiar direccion de componentes
		cpane.setComponentOrientation(
				java.awt.ComponentOrientation.RIGHT_TO_LEFT);
		//cpane.setComponentOrientation(java.awt.ComponentOtientation.LEFT_TO_RIGHT);
		
		//FlowLayaout.LEADING, FlowLayout.CENTER, or FlowLayout.TRALLING.
		cpane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 99));
		//o este
		/*
		 * FlowLayout b11 = new FlowLayout();
		 * 
		 * b11.setHgap(2); define espacio entre componentes horizontal
		 * b11.setVgap(30); define espacio entre componentes vertical
		 * setLayout(b11);
		 * */
		
		
		JButton btn1 = new JButton("Botón 1");
		btn1.setPreferredSize(new Dimension(600, 100));
		
		JButton btn2 = new JButton("Botón 2");
		
		add(btn1);add(btn2);
		
		
	}
}
