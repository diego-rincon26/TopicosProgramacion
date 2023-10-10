package ventanas;//la clase CLASE12092023 pertenece al paquete clase08092023.

//Para cargar imagen

import javax.swing.JFrame;/*funciona como la ventana principal donde se añaden componentes 
							como etiquetas, botones, campos de texto para crear una GUI.*/

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;


public class Ventapmodales3 extends JFrame{ /*la clase Joptionpane extiende a la clase JFrame. 

											heredando todas sus funcionalidades*/ 
	public static void main(String[] args) {  //método main; cuando se ejecuta, es el punto de inicio del programa 
		
		new Ventapmodales3(); //nueva instancia de la clase CLASE08092023
		
	}//cierre del método main
	
	Ventapmodales3(){ //se define el constructor de la clase CLASE08092023
		
		
		setTitle("Center a JDialog"); //define el título que aparece en la parte superior de la ventana
		
		setSize(300,300);  //el tamaño de la ventana se dispone como 300 pixeles de ancho por 300 pixeles de largo

		setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
		
		componentesInit();
		
		setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
		
		setVisible(true); //le confiere visibilidad a la ventana
		
	}//cierre del constructor
		
		public void componentesInit() {
		
			ImageIcon imagenicon = new ImageIcon(getClass().getResource("/img/dom.JPG"));
			Image img = imagenicon.getImage();
			
			Image nimg = img.getScaledInstance(30,
					30,
					java.awt.Image.SCALE_SMOOTH);
			
			ImageIcon imagenicon2 = new ImageIcon(nimg);
			
			
			//OptionDialog
			int se12 = JOptionPane.showOptionDialog(this, 
					"Seleccione opción", 
					"Selector de opciones",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					imagenicon2,
					new Object[]{"Uno", "Dos", "Tres",},
					"uno");
			
			if(se12 != -1) {
				JOptionPane.showMessageDialog(this, 
						"Opcion "+(se12+1),
						"Respuesta",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
		
		}//Cierre del método componentesInit
	

} //cierre de la clase Ventapmodales2





