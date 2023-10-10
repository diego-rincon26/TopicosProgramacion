package otros;

import javax.swing.*;

import java.awt.*;

public class Otros_jlabel extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Otros_jlabel();
		
	}
		
		Otros_jlabel(){
			setTitle("Gestor de contenido"); //define el título que aparece en la parte superior de la ventana
			
			setSize(500,530);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo por 500 pixeles de ancho

			setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
			
			componentesInit();
			
			setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
			
			setVisible(true); //le confiere visibilidad a la ventana
	}

		public void componentesInit(){
			
			ImageIcon imagenicon = new ImageIcon(getClass().getResource("/img/dom.JPG"));
			Image img = imagenicon.getImage();
		
			
			JLabel label3 = new JLabel();
			//assigning text to label3
			
			label3.setText(" and Bears ");
			label3.setToolTipText("este es un label");
			label3.setFont(new Font("Tahoma", Font.BOLD, 14));
			//label.setForeground(Color.red);
			label3.setForeground(new Color(122, 122, 122));
			label3.setOpaque(true);
			label3.setBackground(Color.green);
			//set alignment
			label3.setHorizontalAlignment(SwingConstants.RIGHT);
			//label3.setSize(500, 600);
			label3.setBounds(1, 10 , 180, 90);
			
			//JLabel etiq3 = new JLabel("Etiqeuta4", SwingConstants.RIGHT);
		
			Container cpane=this.getContentPane();
			JButton button1 = new JButton("Boton 1");
			JButton button2 = new JButton("Boton 2");
			button1.setBounds(1, 10, 80 , 80);
			button1.setAlignmentX(cpane.CENTER_ALIGNMENT);
			button1.setMnemonic('t');
			button1.addActionListener(ea->{
				System.out.println("estooo");
			});
			
			add(button1); add(button2);
			
			label3.setIcon(imagenicon);
			add(label3);
		
			
	
		}
		

}
	
