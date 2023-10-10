//sumar  dos números GUI

package ventanas;//la clase CLASE12092023 pertenece al paquete clase12092023.

//Para sumar dos números

import javax.swing.JFrame;/*funciona como la ventana principal donde se añaden componentes 
							como etiquetas, botones, campos de texto para crear una GUI.*/

import javax.swing.JButton;//crea botones a los cuales se les puede hacer clic en una GUI

import javax.swing.JDialog;//crea cuadros de diálogo y ventanas secundarias en una GUI

import javax.swing.JOptionPane;

public class Ventapmodales extends JFrame{ /*la clase Joptionpane extiende a la clase JFrame. 
											heredando todas sus funcionalidades*/ 

	public static void main(String[] args) {  //método main; cuando se ejecuta, es el punto de inicio del programa 
		
		new Ventapmodales(); //nueva instancia de la clase CLASE08092023

	}//cierre del método main*/
	
	Ventapmodales(){ //se define el constructor de la clase CLASE08092023
		
		setTitle("Center a JDialog"); //define el título que aparece en la parte superior de la ventana
		
		setSize(500,500);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo por 500 pixeles de ancho

		setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
		
		componentesInit();
		
		setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
		
		setVisible(true); //le confiere visibilidad a la ventana
		
	}//cierre del constructor
		
		public void componentesInit() {
		
			/*int codigo = JOptionPane.showConfirmDialog(this,
					"¿quieres algo?",
					"ventana",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.PLAIN_MESSAGE);
			
			if(codigo==JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(this, "Error",
						"error fatal", JOptionPane.ERROR_MESSAGE);
				
				}else if(codigo==JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(this, "Correcto",
							"todo esta bien", JOptionPane.INFORMATION_MESSAGE);
				}*/
			
			String cad1 =  JOptionPane.showInputDialog(this, "Introduzca el primer digito", "Primer dígito"
					,JOptionPane.INFORMATION_MESSAGE);
			
			String cad2 =  JOptionPane.showInputDialog(this, "Introduzca el segundo digito", "Segundo dígito"
					,JOptionPane.INFORMATION_MESSAGE);
			
			int num1 = Integer.parseInt(cad1);
			int num2 = Integer.parseInt(cad2);
			
			int resultado = num1+num2;
			
			JOptionPane.showMessageDialog(this, "La suma de ambos números es: " + resultado , "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
		}
		
		
	

} //cierre de la clase Ventapmodales

