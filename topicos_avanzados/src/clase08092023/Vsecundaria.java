package clase08092023; //la clase Vsecundaria pertenece al paquete clase08092023. 

import javax.swing.JFrame; /*funciona como la ventana principal donde se añaden componentes 
							como etiquetas, botones, campos de texto para crear una GUI.*/

import javax.swing.JDialog; //crea cuadros de diálogo y ventanas secundarias en una GUI

public class Vsecundaria extends JDialog{  /*la clase Vsecundaria extiene a la clase JDialog,
											heredando todas sus funcionalidades*/
	
	Vsecundaria(JFrame jFrame){ /*Se define el constructor de la clase Vsecundaria;
								como parámetro tiene una instancia de JFrame llamada jFrame*/
		
		super(jFrame); /*llama al constructor de la clase padre(JFrame) y hace que Vsecundaria, con su cuadro de dialogo, se suborine a JFrame*/
		
		setTitle("Ventana secundaria"); //define el título que aparece en la parte superior de la ventana
		
		setSize(400,400); //el tamaño de la ventana se dispone como 400 pixeles de ancho por 400 pixeles de largo
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
		
		setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla

		setVisible(true); //le confiere visibilidad a la ventana
		
		pack(); //el tamaño del frame se ajusta al contenido
	
		
	}//Cierre del constructor
	
}//Cierre de la clase

