package clase08092023;//la clase Joptionpane pertenece al paquete clase08092023.


import javax.swing.JFrame;/*funciona como la ventana principal donde se añaden componentes 
							como etiquetas, botones, campos de texto para crear una GUI.*/

import javax.swing.JOptionPane;/*facilita la aparición de un cuadro de diálogo 
								estándar que pide a los usuarios un valor o les informa de algo.*/

public class Joptionpane extends JFrame{ /*la clase Joptionpane extiende a la clase JFrame. 
											heredando todas sus funcionalidades*/    
	
	Joptionpane(){ //se define el constructor de la clase Joptionpane 
		
		setTitle("Center a JDialog"); //define el título que aparece en la parte superior de la ventana
		
		setSize(500,500); //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
		
		setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
		
		/*JOptionPane.showConfirmDialog muestra un cuadro de diálogo de confirmación con las opciones "Yes" y "No" 
		 * La selección se almacena en la variable "codigo"
		 */
		int codigo = JOptionPane.showConfirmDialog(this, 
				"¿Cómo estas?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
		
		
		//se evalua codigo para saber si se escogio "Si" o "No"
		if(codigo==JOptionPane.YES_OPTION) {
			
		}else if(codigo==JOptionPane.NO_OPTION) {
			
		}
		
		
		setVisible(true); //le confiere visibilidad a la ventana
		
		
	}//cierre del constructor
	
public static void main(String[] args) {  //método main; cuando se ejecuta, es el punto de inicio del programa 
		
		new Joptionpane(); //nueva instancia de la clase Joptionpane

	}//cierre del método main

}//cierre de la clase Joptionpane
