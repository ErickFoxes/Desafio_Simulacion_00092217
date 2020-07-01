package Ventanas;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class VentanaPrincipal extends JFrame{
	public VentanaPrincipal() {
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("00092217");
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		panel.setOpaque(true);
		panel.add(agregarLabel("Hola", 10, 10, 50,30));
		panel.add(agregarImagen("src/Recursos/Queotraopcion2.png", 10, 80, 400,400));
		panel.add(colocarFlechaIz( 10, 400, 80,30));
		panel.add(colocarFlechaDer( 400, 400, 80,30));
		
	}
	
	private JLabel agregarLabel(String texto, int x, int y, int width, int heigth) {
		JLabel etiqueta = new JLabel(texto);
		etiqueta.setBounds(x, y, width, heigth);
		return etiqueta;
	}
	
	private JLabel agregarImagen(String nombre, int x, int y, int width, int heigth) {
		ImageIcon img1 = new ImageIcon(nombre);
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(x, y, width, heigth);
		etiqueta.setIcon(new ImageIcon(img1.getImage().getScaledInstance(340, 300, Image.SCALE_SMOOTH)));
		return etiqueta;
	}
	
	private JButton colocarBotonesConTexto(String nombre,int x, int y, int width, int heigth) {
		JButton boton1 = new JButton();
		boton1.setText(nombre);
		boton1.setBounds(x, y, width, heigth);
		boton1.setEnabled(true);
		return boton1;
	}
	
	private JButton colocarBotones(String nombre,int x, int y, int width, int heigth) {
		JButton boton1 = new JButton();
		ImageIcon img = new ImageIcon(nombre);
		boton1.setIcon(new ImageIcon(img.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH)));
		boton1.setBounds(x, y, width, heigth);
		boton1.setEnabled(true);
		boton1.setBackground(Color.WHITE);
		boton1.setOpaque(true);
		boton1.setBorderPainted(false);

		return boton1;
	}
	private JButton colocarFlechaIz(int x, int y, int width, int heigth) {
		JButton boton1 = new JButton();
		ImageIcon img = new ImageIcon("src/Recursos/flechaIZ.png");
		boton1.setIcon(new ImageIcon(img.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH)));
		boton1.setBounds(x, y, width, heigth);
		boton1.setEnabled(true);
		boton1.setBackground(Color.WHITE);
		boton1.setOpaque(true);
		boton1.setBorderPainted(false);
		
		boton1.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	ImageIcon img2 = new ImageIcon("src/Recursos/flechaIZ2.png");
				boton1.setIcon(new ImageIcon(img2.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH)));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	boton1.setIcon(new ImageIcon(img.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH)));
		    }
		});
		return boton1;
	}
	private JButton colocarFlechaDer(int x, int y, int width, int heigth) {
		JButton boton1 = new JButton();
		ImageIcon img = new ImageIcon("src/Recursos/flechaDe.png");
		boton1.setIcon(new ImageIcon(img.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH)));
		boton1.setBounds(x, y, width, heigth);
		boton1.setEnabled(true);
		boton1.setBackground(Color.WHITE);
		boton1.setOpaque(true);
		boton1.setBorderPainted(false);
		
		boton1.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	ImageIcon img2 = new ImageIcon("src/Recursos/flechaDe2.png");
				boton1.setIcon(new ImageIcon(img2.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH)));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	boton1.setIcon(new ImageIcon(img.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH)));
		    }
		});
		return boton1;
	}
}
