package gestor_de_contenido;

//BorderLayout, gestor por default de JFrame

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class GA_BorderLayout extends JFrame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		new GA_BorderLayout();

	}

	GA_BorderLayout(){
		
		setTitle("Gestor de contenido"); //define el título que aparece en la parte superior de la ventana
		
		setSize(500,500);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo por 500 pixeles de ancho

		setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
		
		componentesInit();
		
		setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
		
		setVisible(true); //le confiere visibilidad a la ventana
	}
	
	public void componentesInit() {
		
		JButton bt1 = new JButton("Botón 1");
		JPanel panel1 = new JPanel();
		add(panel1,BorderLayout.NORTH);
		panel1.add(bt1);
		
		JButton bt2 = new JButton("Botón 2");
		JPanel panel2 = new JPanel();
		add(panel2,BorderLayout.NORTH);
		panel2.add(bt2);
		
		JButton bt3 = new JButton("Botón 3");
		JPanel panel3 = new JPanel();
		add(panel3,BorderLayout.NORTH);
		panel3.add(bt3);
		
		JButton bt4 = new JButton("Botón 4");
		JPanel panel4 = new JPanel();
		add(panel4,BorderLayout.NORTH);
		panel4.add(bt4);
		
		JButton bt5 = new JButton("Botón 5");
		JPanel panel5 = new JPanel();
		add(panel5,BorderLayout.NORTH);		
		panel5.add(bt5);
		
		JButton bt6 = new JButton("Botón 6");
		JPanel panel6 = new JPanel();
		add(panel6,BorderLayout.CENTER);	
		panel6.add(bt6);
		
		JButton bt7 = new JButton("Botón 7");
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
		panel9.add(bt9);
		
		
	}
}
