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


public class Escalera extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Escalera();
	}
	
	Escalera(){
	setTitle("Gestor de contenido"); //define el título que aparece en la parte superior de la ventana
	
	setSize(500,530);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo por 500 pixeles de ancho

	setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
	
	componentesInit();
	
	setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
	
	setVisible(true); //le confiere visibilidad a la ventana
}

	public void componentesInit(){
		
			
		
	  /*  int x=1;
		  int y=1;
		  
		  for (int i = 0; i < 5; i++) {
			  int j=1;
			  JButton btn[j] = new JButton ("btn"+[j]);
			  btn[j].setBounds(x, y, 100, 100);
			  add(btn1);
			  h=h+100;
			  w=w+100;
		  }*/
		  
			Container cpane=this.getContentPane();
			Dimension screenSize=
					Toolkit.getDefaultToolkit().getScreenSize();
			
			System.out.println("Tu resolución es de " 
				+ screenSize.width + "x" + screenSize.height);
			
			setSize(screenSize.width, screenSize.height);
			
			setLayout(null);
			
			int y=7;
			int m=(screenSize.height/y);
			int n=(screenSize.width/y);
			JButton btn1 = new JButton ("btn1");
			btn1.setBounds(1, 1, n, m);
		
			JButton btn2 = new JButton ("btn2");
			btn2.setBounds(n, m, n, m);
		
			JButton btn3 = new JButton ("btn3");
			btn3.setBounds(n*2, m*2, n, m);
		
			JButton btn4 = new JButton ("btn4");
			btn4.setBounds(n*3, m*3, n, m);
			
			JButton btn5 = new JButton ("btn5");
			btn5.setBounds(n*4, m*4, n, m);
			
			JButton btn6 = new JButton ("btn6");
			btn6.setBounds(n*5, m*5, n, m);
			
			JButton btn7 = new JButton ("btn7");
			btn7.setBounds(n*6, m*6, n, m);
		
			add(btn1);add(btn2);add(btn3);add(btn4);add(btn5);
			add(btn6);add(btn7);
	}
}
