package Ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class VentanaPrincipal extends JFrame{
	public VentanaPrincipal() {
		setSize(1200,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("00092217");
		iniciarComponentes();
	}
	public JPanel panel = new JPanel();
	public ImageIcon img1 = new ImageIcon("src/Recursos/semidabder.png");
	public ImageIcon img2 = new ImageIcon("src/Recursos/indiferente.png");
	public JLabel etiquetaimg = new JLabel();
	public JLabel dialogo = new JLabel();
	public JLabel dialogo2 = new JLabel();
	public JButton avanzar1 = new JButton();
	
	private void iniciarComponentes() {
		panel.setLayout(null);
		this.getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		panel.setOpaque(true);
		panel.add(agregarLabel(dialogo,"Elige una opción",120, 400, 250,20,18,true));
		panel.add(agregarLabel(dialogo2,"",120, 420, 200,30,18,false));
		panel.add(agregarImagen(80, 420, 250,250));
		panel.add(colocarBotonEmpezar("src/Recursos/Empezar1.png","src/Recursos/Empezar2.png",10,600,100,40));
		//panel.add(colocarFlechaIz( 10, 400, 80,30));
		panel.add(colocarFlechaDer(40,600,50,20));
		
	}
	
	private JLabel agregarLabel(JLabel etiqueta,String texto, int x, int y, int width, int heigth, int size, boolean fl) {
		etiqueta.setText(texto);
		etiqueta.setBounds(x, y, width, heigth);
		etiqueta.setFont(new Font("Helvetica", Font.PLAIN, size));
		etiqueta.setVisible(fl);
		return etiqueta;
	}
	
	private JLabel agregarImagen(int x, int y, int width, int heigth) {
		etiquetaimg.setBounds(x, y, width, heigth);
		etiquetaimg.setIcon(new ImageIcon(img1.getImage().getScaledInstance(width, heigth, Image.SCALE_SMOOTH)));
		return etiquetaimg;
	}
	
	private JButton colocarBotonesConTexto(String nombre,int x, int y, int width, int heigth) {
		JButton boton1 = new JButton();
		boton1.setText(nombre);
		boton1.setBounds(x, y, width, heigth);
		boton1.setEnabled(true);
		return boton1;
	}
	
	private JButton colocarBotonEmpezar(String nombre,String nombre2,int x, int y, int width, int heigth) {
		JButton boton1 = new JButton();
		ImageIcon img = new ImageIcon(nombre);
		boton1.setIcon(new ImageIcon(img.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH)));
		boton1.setBounds(x, y, width, heigth);
		boton1.setEnabled(true);
		boton1.setBackground(Color.WHITE);
		boton1.setOpaque(true);
		boton1.setBorderPainted(false);
		
		boton1.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	ImageIcon img2 = new ImageIcon(nombre2);
				boton1.setIcon(new ImageIcon(img2.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH)));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	boton1.setIcon(new ImageIcon(img.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH)));
		    }
		    
		});
		
		boton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				etiquetaimg.setIcon(new ImageIcon(img2.getImage().getScaledInstance(250,250, Image.SCALE_SMOOTH)));
				dialogo.setText("No es que hubiesen muchas");
				dialogo2.setVisible(true);
				dialogo2.setText("opciones... Continuemos");
				boton1.setVisible(false);
				avanzar1.setVisible(true);
			}
		});

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
		
		ImageIcon img = new ImageIcon("src/Recursos/flechaDe.png");
		avanzar1.setIcon(new ImageIcon(img.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH)));
		avanzar1.setBounds(x, y, width, heigth);
		avanzar1.setEnabled(true);
		avanzar1.setBackground(Color.WHITE);
		avanzar1.setOpaque(true);
		avanzar1.setBorderPainted(false);
		
		avanzar1.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	ImageIcon img2 = new ImageIcon("src/Recursos/flechaDe2.png");
		    	avanzar1.setIcon(new ImageIcon(img2.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH)));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	avanzar1.setIcon(new ImageIcon(img.getImage().getScaledInstance(width,heigth,Image.SCALE_SMOOTH)));
		    }
		    
		});
		
		avanzar1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaProcesos ventana2 = new VentanaProcesos();
				ventana2.setVisible(true);
				setVisible(false);
			}
		});
		
		return avanzar1;
	}
}
