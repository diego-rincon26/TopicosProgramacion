package gestor_de_contenido;

//BorderLayout, gestor por default de JFrame

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;

public class GA_BorderLayout2 extends JFrame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		new GA_BorderLayout2();

	}

	GA_BorderLayout2(){
		
		setTitle("Gestor de contenido"); //define el título que aparece en la parte superior de la ventana
		
		setSize(500,500);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo por 500 pixeles de ancho

		setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
		
		componentesInit();
		
		setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
		
		setVisible(true); //le confiere visibilidad a la ventana
	}
	
	public void componentesInit() {
		
		//no es obligatorio para BorderLayout, solo obligatorio para BoxLayout
		Container cpane = this.getContentPane();
		
		setLayout(new BorderLayout(30, 50));
		//o este
		/*
		 * BorderLayout bly = new BorderLayout();
		 * bly.setHgap(300); define espacio entre componentes horizontal
		 * bly.setHgap(400); define espacio entre componentes vertical
		 * setLayout(bly);
		 * */

		JButton bt1 = new JButton("Botón 1");
		bt1.setPreferredSize(new Dimension(600, 100));

		
		JButton bt2 = new JButton("Botón 2");
		bt2.setPreferredSize(new Dimension(600, 100));
		
		JButton bt3 = new JButton("Botón 3");
		bt3.setPreferredSize(new Dimension(600, 100));
		
		JButton bt4 = new JButton("Botón 4");
		bt4.setPreferredSize(new Dimension(600, 100));

		
		JButton bt5 = new JButton("Botón 5");
		bt5.setPreferredSize(new Dimension(600, 100));

		
		JButton bt6 = new JButton("Botón 6");
		bt6.setPreferredSize(new Dimension(600, 100));

		
		/*JButton bt7 = new JButton("Botón 7");
		JPanel panel7 = new JPanel();
		add(panel7,BorderLayout.SOUTH);		
		panel7.add(bt7);
		
		JButton bt8 = new JButton("Botón 8");
		JPanel panel8 = new JPanel();
		add(panel8,BorderLayout.EAST);		
		panel8.add(bt8);
		
		JButton bt9 = new JButton("Botón 9");
		JPanel panel9 = new JPanel();
		add(panel9,BorderLayout.WEST);
		panel9.add(bt9);*/
		
		//solo add, this.add o cpane.add
		cpane.add(bt1, BorderLayout.CENTER);
		cpane.add(bt2, BorderLayout.NORTH);
		cpane.add(bt3, BorderLayout.SOUTH);
		add(bt4, BorderLayout.EAST);
		add(bt5, BorderLayout.WEST);
		
	}
}
