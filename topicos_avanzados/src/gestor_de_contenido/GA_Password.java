package gestor_de_contenido;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.*;


import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class GA_Password extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new GA_Password();
	}
	
	GA_Password(){
		
		setTitle("Gestor de contenido"); //define el título que aparece en la parte superior de la ventana
		
		setSize(500,500);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo por 500 pixeles de ancho

		setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
		
		componentesInit();
		
		setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
		
		setVisible(true); //le confiere visibilidad a la ventana

	}
	
	public void componentesInit() {
			
			
		Container cpane = this.getContentPane();
		setLayout(null);
		
		JPanel p = new JPanel();
		Border blackline = BorderFactory.
				createTitledBorder("Diego");
		
		p.setBounds(190,10,100, 100);
		
		//p.setLayout(new FlowLayout);
		p.setBackground(Color.RED);
		p.setBorder(blackline);
		add(p);
		
		
		//default alignment center
		JTextField jtfl = new JTextField ();
		jtfl.setBounds(1,10,180,80);
		jtfl.setForeground(Color.BLACK);
		jtfl.setBackground(new Color (207,155,163));
	
		//jtfl.setEditable(false);
		
		jtfl.setSelectedTextColor(Color.ORANGE);
		jtfl.setSelectionColor(Color.BLUE);
		jtfl.setHorizontalAlignment(SwingConstants.CENTER);
		add(jtfl);
		
		JPasswordField pass = new JPasswordField (16);
		pass.setBounds(1, 110, 180, 60);
		
		pass.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
		
				char [] ps = pass.getPassword();
				String st = new String(ps);
		
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						if(pass.equals(st)) {
			
						System.out.println("Contraseña correcta"+ps
							+" Valor de passwordfield: "+st);
					}
					
					else {
						System.out.println("Contraseña incorrecta");
					}}
					
				
				System.out.println("->" +e.getKeyCode());
				
			}


		
		});
		
		add(pass);
		
		}

}


