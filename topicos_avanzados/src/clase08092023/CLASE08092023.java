	package clase08092023;//la clase CLASE08092023 pertenece al paquete clase08092023.

	import javax.swing.JFrame;/*funciona como la ventana principal donde se añaden componentes 
								como etiquetas, botones, campos de texto para crear una GUI.*/

	import javax.swing.JButton;//crea botones a los cuales se les puede hacer clic en una GUI

	import javax.swing.JDialog;//crea cuadros de diálogo y ventanas secundarias en una GUI

	public class CLASE08092023 extends JFrame{ /*la clase Joptionpane extiende a la clase JFrame. 
												heredando todas sus funcionalidades*/ 

		public static void main(String[] args) {  //método main; cuando se ejecuta, es el punto de inicio del programa 
			

			new CLASE08092023(); //nueva instancia de la clase CLASE08092023
			


		}//cierre del método main
		
		CLASE08092023(){ //se define el constructor de la clase CLASE08092023
			
			
			setTitle("Center a JDialog"); //define el título que aparece en la parte superior de la ventana
			
			setSize(500,500);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo

			setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
			
			setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
			
			JButton btn1=new JButton("Ir a ventana secundaria"); //Crea un botón con el texto "Ir a ventana secundaria" y lo agrega a la ventana principal.
			
			add(btn1); //agrega un boton con el texto "Ir a ventana secundaria"
			
			btn1.addActionListener(ae->{   //Añade un oyente de listener al botón btn1 para responder cuando se haga clic en él. 
											
				
				JDialog jd= new Vsecundaria(this);/*Cuando se hace clic en el botón, se crea una instancia de la clase 
													Vsecundaria como un cuadro de diálogo (JDialog).*/
				
				}); //cierre del listener

			
			setVisible(true); //le confiere visibilidad a la ventana
			
			
		}//cierre del constructor

	} //cierre de la clase CLASE08092023