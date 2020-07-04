package Ventanas;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventanagif  extends JFrame{
	public JPanel panel = new JPanel();
	
	public Ventanagif(int n) {
		setSize(800,450);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("00092217");
		iniciarComponentes(n);
	}
	private void iniciarComponentes(int n) {
		panel.setLayout(null);
		this.getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		panel.setOpaque(true);
		JLabel label = new JLabel();
		if(n==1) {
			ImageIcon img = new ImageIcon("src/Recursos/ensamblaje2.gif");
			
			label.setBounds(20,20,700,400);
			label.setIcon(new ImageIcon(img.getImage()));
		}else {
			ImageIcon img = new ImageIcon("src/Recursos/ensamblaje3.gif");
			label.setBounds(20,20,700,400);
			label.setIcon(new ImageIcon(img.getImage()));
		}
		
		label.repaint();
		panel.add(label);
	}
	
}
