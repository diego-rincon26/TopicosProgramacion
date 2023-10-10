package ejercicios;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Image;

public class Correo_y_contrasena extends JFrame {


    Correo_y_contrasena() {
		setTitle("Gestor de contenido"); //define el título que aparece en la parte superior de la ventana
		
		setSize(500,500);  //el tamaño de la ventana se dispone como 500 pixeles de ancho por 500 pixeles de largo por 500 pixeles de ancho

		setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el proceso cuando se cierra la ventana
		
		componentesInit();
		
		setLocationRelativeTo(null); //establece a la ventana en el centro de la pantalla
		
		setVisible(true); //le confiere visibilidad a la ventana
    }

    public void componentesInit() {
        Container cpane = this.getContentPane();
        Color azulClaro = new Color(173, 216, 230);
        cpane.setBackground(azulClaro);
        setLayout(null);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);

        int h = screenSize.height / 2;
        int w = screenSize.width / 2;

        // Cargar la imagen
        ImageIcon imagenIcon = new ImageIcon(getClass().getResource("/img/methods.jpg"));
        Image img = imagenIcon.getImage();
        Image nuevaImg = img.getScaledInstance(300, 200, java.awt.Image.SCALE_SMOOTH);
        imagenIcon = new ImageIcon(nuevaImg);

        JLabel imagenLabel = new JLabel(imagenIcon);
        imagenLabel.setBounds(w - 180, 200, 300, 200); // Posicionar la imagen en la parte superior
        add(imagenLabel);

        JButton btn1 = new JButton("Confirmar");
        btn1.setBounds((screenSize.width / 2), (screenSize.height / 2) + 80, 75, 50);
        btn1.setBackground(Color.BLUE); // Color de fondo del botón
        btn1.setForeground(Color.BLACK); // Color del texto del botón
        add(btn1);

        JPanel correoPanel = new JPanel(); // Panel para correo electrónico y scaja de texto
        correoPanel.setLayout(new GridLayout(1, 2));
        correoPanel.setBounds(w - 160, h - 30, 250, 30);
        correoPanel.setBackground(Color.WHITE); // Color de fondo del panel

        JLabel correoLabel = new JLabel("Correo electrónico:");
        correoLabel.setForeground(Color.BLACK);
        correoPanel.add(correoLabel);

        JTextField correoTextField = new JTextField(20);
        correoPanel.add(correoTextField);
        cpane.add(correoPanel);

        JPanel passPanel = new JPanel(); // Panel para contraseña y caja de texto
        passPanel.setLayout(new GridLayout(1, 2));
        passPanel.setBounds(w - 160, h - 10, 250, 30);
        passPanel.setBackground(Color.WHITE); // Color de fondo del panel

        JLabel passLabel = new JLabel("Contraseña:");
        passPanel.add(passLabel);

        JPasswordField pass = new JPasswordField(20);
        passPanel.add(pass);
        cpane.add(passPanel);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char[] passwordChars = pass.getPassword();
                String ingresada = new String(passwordChars);
                String correcta = "hola"; 

                if (ingresada.equals(correcta)) {
                    JOptionPane.showMessageDialog(null, "Contraseña correcta", "Mensaje",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

                pass.setText(""); // Limpia el campo de contraseña después de verificarla
            }
        });
        

    }

    public static void main(String[] args) {
        new Correo_y_contrasena();
    }

}
