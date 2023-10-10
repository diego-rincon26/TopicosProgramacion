package ejercicios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import javax.swing.JButton;


public class BotonCentro extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new BotonCentro();

	}
	
	BotonCentro(){
	setTitle("Gestor de contenido"); //define el título que aparece en la parte superior de la ventana
	
	setSize(500,500);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo por 500 pixeles de ancho

	setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
	
	componentesInit();
	
	setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
	
	setVisible(true); //le confiere visibilidad a la ventana
}

	public void componentesInit(){
		
		
		Dimension screenSize=
				Toolkit.getDefaultToolkit().getScreenSize();
		
		System.out.println("Tu resolución es de " 
			+ screenSize.width + "x" + screenSize.height);

		
		setSize(screenSize.width, screenSize.height);
		
		setLayout(null);
		
		JButton btn1 = new JButton ("btn1");
		btn1.setBounds((screenSize.width/2), (screenSize.height/2), 50, 50);
		
		add(btn1);
	
	
	//se tiene que bloquear la ventana para que no se redimensione si el tamaño
	//de un boton excede el de la ventana
		
	}
}
