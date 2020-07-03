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

public class VentanaProcesos extends JFrame {
	
	public JPanel panel = new JPanel();
	public JButton btnAvanzar1 = new JButton();
	public JButton btnAvanzar2 = new JButton();
	public JButton btnAvanzar3 = new JButton();
	public JButton btnAvanzar4 = new JButton();
	public JButton btnAvanzar5 = new JButton();
	public JButton btnAvanzar6 = new JButton();
	public JButton btnAvanzar7 = new JButton();
	public JButton btnAvanzar8 = new JButton();
	
	public JLabel dibujo1 = new JLabel();
	public JLabel dialogo1 = new JLabel();
	public JLabel dialogo2 = new JLabel();
	
	public VentanaProcesos() {
			setSize(1200,700);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setTitle("00092217");
			iniciarComponentes();
		}

	private void iniciarComponentes() {
		panel.setLayout(null);
		this.getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		panel.setOpaque(true);
		panel.add(agregarImagen(dibujo1,"src/Recursos/mostrar1.png", 80, 420, 250,250,250,250));
		panel.add(agregarLabel(dialogo1,"Para empezar pon un número", 120, 400, 250, 30,18,true));
		panel.add(agregarLabel(dialogo2,"por favor", 120, 420, 250, 30,18,true));
		panel.add(colocarFlechaDer("src/Recursos/mostrar2.png","vamos hazlo","",true,false,btnAvanzar1,40,600,50,20,250,250,true,btnAvanzar2));
		panel.add(colocarFlechaDer("src/Recursos/indiferente.png","Que te tardas...","",true,false,btnAvanzar2,40,600,50,20,250,250,false,btnAvanzar3));
		panel.add(colocarFlechaDer("src/Recursos/estresado.png","eeeh...","",true,false,btnAvanzar3,40,600,50,20,250,250,false,btnAvanzar4));
		panel.add(colocarFlechaDer("src/Recursos/idunno.png","Recorde que no lo necesitare","así que no puse la opción.",true,true,btnAvanzar4,40,600,50,20,250,250,false,btnAvanzar5));
		panel.add(colocarFlechaDer("src/Recursos/mostrar2.png","Pues todo lo que mostraré","ya ha sido calculado",true,true,btnAvanzar5,40,600,50,20,250,250,false,btnAvanzar1));
		//panel.add(colocarFlechaIz(10, 400, 80, 30));
		

	}
	
	private JLabel agregarLabel(JLabel label, String texto, int x, int y, int width, int heigth, int size, boolean fl) {
		label.setText(texto);
		label.setBounds(x, y, width, heigth);
		label.setFont(new Font("Helvetica", Font.PLAIN, size));
		label.setVisible(fl);
		return label;
	}

	private JLabel agregarImagen(JLabel label, String nombre, int x, int y, int width, int heigth, int size1, int size2) {
		ImageIcon img1 = new ImageIcon(nombre);
		label.setBounds(x, y, width, heigth);
		label.setIcon(new ImageIcon(img1.getImage().getScaledInstance(size1,size2, Image.SCALE_SMOOTH)));
		return label;
	}

	private JButton colocarBotonesConTexto(String nombre, int x, int y, int width, int heigth) {
		JButton boton1 = new JButton();
		boton1.setText(nombre);
		boton1.setBounds(x, y, width, heigth);
		boton1.setEnabled(true);
		return boton1;
	}

	private JButton colocarBotones(JButton btn,String nombre, int x, int y, int width, int heigth) {
		ImageIcon img = new ImageIcon(nombre);
		btn.setIcon(new ImageIcon(img.getImage().getScaledInstance(width, heigth, Image.SCALE_SMOOTH)));
		btn.setBounds(x, y, width, heigth);
		btn.setEnabled(true);
		btn.setBackground(Color.WHITE);
		btn.setOpaque(true);
		btn.setBorderPainted(false);
		return btn;
	}


	private JButton colocarFlechaDer(String imagen,String texto1, String texto2,boolean fl1, boolean fl2,JButton btn,int x, int y, int width, int heigth, int size1, int size2,boolean visible,JButton btn2) {
		ImageIcon img = new ImageIcon("src/Recursos/flechaDe.png");
		btn.setIcon(new ImageIcon(img.getImage().getScaledInstance(width, heigth, Image.SCALE_SMOOTH)));
		btn.setBounds(x, y, width, heigth);
		btn.setEnabled(true);
		btn.setBackground(Color.WHITE);
		btn.setOpaque(true);
		btn.setBorderPainted(false);
		btn.setVisible(visible);

		btn.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				ImageIcon img2 = new ImageIcon("src/Recursos/flechaDe2.png");
				btn.setIcon(new ImageIcon(img2.getImage().getScaledInstance(width, heigth, Image.SCALE_SMOOTH)));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btn.setIcon(new ImageIcon(img.getImage().getScaledInstance(width, heigth, Image.SCALE_SMOOTH)));
			}
		});
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon img1 = new ImageIcon(imagen);
				dibujo1.setIcon(new ImageIcon(img1.getImage().getScaledInstance(size1,size2, Image.SCALE_SMOOTH)));
				dialogo1.setText(texto1);
				dialogo2.setText(texto2);
				dialogo1.setVisible(fl1);
				dialogo2.setVisible(fl2);
				btn.setVisible(false);
				btn2.setVisible(true);
			}
		});
		return btn;
	}
}
