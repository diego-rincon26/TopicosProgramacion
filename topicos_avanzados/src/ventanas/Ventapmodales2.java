//mostrar imagen GUI

package ventanas;//la clase pertenece al paquete clase08092023.

//Para cargar imagen

import javax.swing.JFrame;/*funciona como la ventana principal donde se añaden componentes 
							como etiquetas, botones, campos de texto para crear una GUI.*/

import java.awt.Image;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;


public class Ventapmodales2 extends JFrame{ /*la clase Joptionpane extiende a la clase JFrame. 
											heredando todas sus funcionalidades*/ 

	public static void main(String[] args) {  //método main; cuando se ejecuta, es el punto de inicio del programa 
		
		new Ventapmodales2(); //nueva instancia de la clase CLASE08092023
		
	}//cierre del método main
	
	Ventapmodales2(){ //se define el constructor de la clase CLASE08092023
		
		
		setTitle("Center a JDialog"); //define el título que aparece en la parte superior de la ventana
		
		setSize(500,500);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo por 500 pixeles de ancho

		setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
		
		componentesInit();
		
		setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
		
		setVisible(true); //le confiere visibilidad a la ventana
		
	}//cierre del constructor
		
		public void componentesInit() {
		
			ImageIcon imagenicon = new ImageIcon(getClass().getResource("/img/dom.JPG"));
			Image img = imagenicon.getImage();
		
			
			Image nimg = img.getScaledInstance(60,
					60,
					java.awt.Image.SCALE_SMOOTH);
			
			Object cad = JOptionPane.showInputDialog(this, "Seleccione opción",
					"Selector de opciones",
					JOptionPane.QUESTION_MESSAGE,
					imagenicon,
					new Object[]{"opcion 1", "opcion 2", "opcion 3",},
					"opcion 1");
			
			JOptionPane.showMessageDialog(this, cad, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		
	

} //cierre de la clase Ventapmodales2





