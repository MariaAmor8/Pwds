package FPrincipal;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal extends JFrame{
	JTextField txtUsuario;
	JTextField txtContrasenia;
	
	public void ejecutar() {
		this.setPreferredSize(new Dimension(350,250));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(3,2));
		
		this.add(new JLabel("Nombre de usuario"));
		this.txtUsuario = new JTextField();
		this.add(txtUsuario);
		this.add(new JLabel("Contraseña"));
		this.txtContrasenia = new JTextField();
		this.add(this.txtContrasenia);
		
		JButton bEviar = new JButton("Registrarse");
		this.add(bEviar);
		
		
		this.pack();
	}
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.ejecutar();
	}

}
