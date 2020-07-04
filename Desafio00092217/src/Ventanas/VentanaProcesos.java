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
	public JButton btnAvanzar9 = new JButton();
	public JButton btnAvanzar10 = new JButton();
	public JButton btnAvanzar11 = new JButton();
	public JButton btnAvanzar12 = new JButton();
	public JButton btnAvanzar13 = new JButton();
	public JButton btnAvanzar14 = new JButton();
	public JButton btnAvanzar15 = new JButton();
	public JButton btnAvanzar16 = new JButton();
	public JButton btnAvanzar17 = new JButton();
	public JButton btnAvanzar18 = new JButton();
	public JButton btnAvanzar19 = new JButton();
	public JButton btnAvanzar20 = new JButton();
	public JButton btnAvanzar21 = new JButton();
	public JButton btnAvanzar22 = new JButton();
	public JButton btnAvanzar23 = new JButton();
	public JButton btnAvanzar24 = new JButton();
	public JButton btnAvanzar25 = new JButton();
	public JButton btnAvanzar26 = new JButton();
	public JButton btnAvanzar27 = new JButton();
	public JButton btnAvanzar28 = new JButton();
	public JButton btnAvanzar29 = new JButton();
	public JButton btnAvanzar30 = new JButton();
	public JButton btnAvanzar31 = new JButton();
	public JButton btnAvanzar32 = new JButton();
	public JButton btnAvanzar33 = new JButton();
	public JButton btnAvanzar34 = new JButton();
	public JButton btnAvanzar35 = new JButton();
	public JButton btnAvanzar36 = new JButton();
	public JButton btnAvanzar37 = new JButton();
	public JButton btnAvanzar38 = new JButton();
	public JButton btnAvanzar39 = new JButton();
	public JButton btnAvanzar40 = new JButton();
	public JButton btnAvanzar41 = new JButton();
	public JButton btnAvanzar42 = new JButton();
	public JButton btnAvanzar43 = new JButton();
	public JButton btnAvanzar44 = new JButton();
	public JButton btnAvanzar45 = new JButton();
	public JButton btnAvanzar46 = new JButton();
	public JButton btnAvanzar47 = new JButton();
	public JButton btnAvanzar48 = new JButton();
	
	public JLabel dibujo1 = new JLabel();
	public JLabel proceso1 = new JLabel();
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
		panel.add(agregarImagen(dibujo1,"src/Recursos/mostrar1.png", 80, 420, 250,250,250,250,true));
		panel.add(agregarLabel(dialogo1,"Para empezar pon un número", 120, 380, 450, 30,18,true));
		panel.add(agregarLabel(dialogo2,"por favor", 120, 400, 350, 30,18,true));
		
		panel.add(agregarImagen(proceso1,"src/Recursos/procesos/1.jpg", 500, 200, 450,100,400,100,false));
		
		panel.add(colocarFlechaDer("src/Recursos/mostrar2.png","vamos hazlo","",true,false,btnAvanzar1,40,600,50,20,250,250,true,btnAvanzar2,false,"src/Recursos/procesos/1.jpg", 500, 200, 450,100,400,100));
		panel.add(colocarFlechaDer("src/Recursos/indiferente.png","Que te tardas...","",true,false,btnAvanzar2,40,600,50,20,250,250,false,btnAvanzar3,false,"src/Recursos/procesos/1.jpg", 500, 200, 450,100,400,100));
		panel.add(colocarFlechaDer("src/Recursos/estresado.png","eeeh...","",true,false,btnAvanzar3,40,600,50,20,250,250,false,btnAvanzar4,false,"src/Recursos/procesos/1.jpg", 500, 200, 450,100,400,100));
		panel.add(colocarFlechaDer("src/Recursos/idunno.png","Recorde que no lo necesitare","así que no puse la opción.",true,true,btnAvanzar4,40,600,50,20,250,250,false,btnAvanzar5,false,"src/Recursos/procesos/1.jpg", 500, 200, 450,100,400,100));
		panel.add(colocarFlechaDer("src/Recursos/mostrar2.png","Pues todo lo que mostraré","ya ha sido calculado",true,true,btnAvanzar5,40,600,50,20,250,250,false,btnAvanzar6,false,"src/Recursos/procesos/1.jpg", 500, 200, 450,100,400,100));
		panel.add(colocarFlechaDer("src/Recursos/mostrar1.png","Este es el modelo que estare","utilizando, amalo <3",true,true,btnAvanzar6,40,600,50,20,250,250,false,btnAvanzar7,true,"src/Recursos/procesos/1.jpg", 500, 200, 450,100,400,100));
		panel.add(colocarFlechaDer("src/Recursos/mostrar2.png","Esta es mi malla","chido, ¿no?",true,true,btnAvanzar7,
				40,600,50,20,250,250,false,btnAvanzar8,true,"src/Recursos/procesos/2.png", 500, 100, 450,450,450,450));
		panel.add(colocarFlechaDer("src/Recursos/semidabder.png","aplicare las codiciones de Dirichlet","y de Neumann a estos 2 nodos",true,true,btnAvanzar8,
				40,600,50,20,250,250,false,btnAvanzar9,true,"src/Recursos/procesos/condiciones_1.JPG", 500, 250,270,80,270,80));
		//mallas y tetraedros
		panel.add(colocarFlechaDer("src/Recursos/semidabder.png","Ta dah, ahora procedo a mostrarte","los tetraedros ",true,true,btnAvanzar9,
				40,600,50,20,250,250,false,btnAvanzar10,true,"src/Recursos/procesos/CUBODN.jpg", 500, 100, 450,450,450,450));
		
		panel.add(colocarFlechaDer("src/Recursos/semidabizq.png","Número 1","",true,false,btnAvanzar10,
				40,600,50,20,250,250,false,btnAvanzar11,true,"src/Recursos/procesos/CUBO_1.jpg", 500, 100, 450,450,450,450));
		panel.add(colocarFlechaDer("src/Recursos/semidabder.png","Número 2","",true,false,btnAvanzar11,
				40,600,50,20,250,250,false,btnAvanzar12,true,"src/Recursos/procesos/CUBO_2.jpg", 500, 100, 450,450,450,450));
		panel.add(colocarFlechaDer("src/Recursos/semidabizq.png","Número 3","",true,false,btnAvanzar12,
				40,600,50,20,250,250,false,btnAvanzar13,true,"src/Recursos/procesos/CUBO_3.jpg", 500, 100, 450,450,450,450));
		panel.add(colocarFlechaDer("src/Recursos/semidabder.png","Número 4","",true,false,btnAvanzar13,
				40,600,50,20,250,250,false,btnAvanzar14,true,"src/Recursos/procesos/CUBO_4.jpg", 500, 100, 450,450,450,450));
		panel.add(colocarFlechaDer("src/Recursos/semidabizq.png","Número 5","",true,false,btnAvanzar14,
				40,600,50,20,250,250,false,btnAvanzar15,true,"src/Recursos/procesos/CUBO_5.jpg", 500, 100, 450,450,450,450));
		panel.add(colocarFlechaDer("src/Recursos/semidabder.png","Número 6","",true,false,btnAvanzar15,
				40,600,50,20,250,250,false,btnAvanzar16,true,"src/Recursos/procesos/CUBO_6.jpg", 500, 100, 450,450,450,450));
		//tabla de conectividades
		panel.add(colocarFlechaDer("src/Recursos/mostrar3.png","Utilizando los nodos y los tetraedros","se hace la tabla de conectividad",true,true,btnAvanzar16,
				40,600,50,20,250,250,false,btnAvanzar17,true,"src/Recursos/procesos/TablaConectividades.PNG", 550,150,400,200,400,200));
		//Pasos 1-6 MEF
		panel.add(colocarFlechaDer("src/Recursos/mostrar2.png","Ahora si, paso 1 de MEF","",true,false,btnAvanzar17,
				40,600,50,20,250,250,false,btnAvanzar18,true,"src/Recursos/procesos/paso1_1.jpg", 500, 200,400,220,400,220));
		panel.add(colocarFlechaDer("src/Recursos/idunno.png","Ya que nuestro mundo no me gusta","nos pasaremos a este",true,true,btnAvanzar18,
				40,600,50,20,250,250,false,btnAvanzar19,true,"src/Recursos/procesos/Grafica1.png", 500, 100,500,500,500,500));
		panel.add(colocarFlechaDer("src/Recursos/semidabder.png","Paso 2 del MEF","",true,true,btnAvanzar19,
				40,600,50,20,250,250,false,btnAvanzar20,true,"src/Recursos/procesos/paso2_1.jpg", 500, 220,400,180,400,180));
		panel.add(colocarFlechaDer("src/Recursos/semidabizq.png","Paso 3 del MEF","",true,true,btnAvanzar20,
				40,600,50,20,250,250,false,btnAvanzar21,true,"src/Recursos/procesos/paso3_1.jpg", 500, 220,380,140,380,140));
		panel.add(colocarFlechaDer("src/Recursos/semidabder.png","Paso 4 del MEF","",true,true,btnAvanzar21,
				40,600,50,20,250,250,false,btnAvanzar22,true,"src/Recursos/procesos/paso4_1.jpg", 500, 220,350,150,350,150));
		panel.add(colocarFlechaDer("src/Recursos/semidabizq.png","Paso 5 del MEF","",true,true,btnAvanzar22,
				40,600,50,20,250,250,false,btnAvanzar23,true,"src/Recursos/procesos/paso5_1.jpg", 500, 220,300,120,300,120));
		panel.add(colocarFlechaDer("src/Recursos/mostrar1.png","Aun paso 5","Con calma no apresures",true,true,btnAvanzar23,
				40,600,50,20,250,250,false,btnAvanzar24,true,"src/Recursos/procesos/paso5_3.jpg", 500, 75,520,290,520,290));
		panel.add(colocarFlechaDer("src/Recursos/mostrar2.png","Aun paso 5","seguimos",true,true,btnAvanzar24,
				40,600,50,20,250,250,false,btnAvanzar25,true,"src/Recursos/procesos/paso5_2.jpg", 500, 75,600,400,600,400));
		panel.add(colocarFlechaDer("src/Recursos/indiferente.png","Fin del paso 5","no estuvo tan mal, ¿no?",true,true,btnAvanzar25,
				40,600,50,20,250,250,false,btnAvanzar26,true,"src/Recursos/procesos/paso5_2.jpg", 500, 75,600,400,600,400));
		panel.add(colocarFlechaDer("src/Recursos/mostrar2.png","Cuando lo nombras y los separas de las matrices","A y B queda así, la forma fuerte",true,true,btnAvanzar26,
				40,600,50,20,250,250,false,btnAvanzar27,true,"src/Recursos/procesos/formaFuerte.jpg", 500, 250,250,120,250,120));
		panel.add(colocarFlechaDer("src/Recursos/mostrar3.png","Paso 6 del MEF","Usaremos a una vaca a la moda",true,true,btnAvanzar27,
				40,600,50,20,250,250,false,btnAvanzar28,true,"src/Recursos/procesos/paso6_1.jpg", 500, 150,400,250,400,250));
		panel.add(colocarFlechaDer("src/Recursos/mostrar2.png","Paso 6 del MEF","de nuevo",true,true,btnAvanzar28,
				40,600,50,20,250,250,false,btnAvanzar29,true,"src/Recursos/procesos/paso6_2.jpg", 500, 75,500,500,500,500));
		//forma debil
		panel.add(colocarFlechaDer("src/Recursos/mostrar1.png","Ahora tenemos la forma debil","",true,true,btnAvanzar29,
				40,600,50,20,250,250,false,btnAvanzar30,true,"src/Recursos/procesos/formaDebil.jpg", 500, 250,320,100,320,100));
		//sistema local
		panel.add(colocarFlechaDer("src/Recursos/mostrar1.png","Sistema global","",true,true,btnAvanzar30,
				40,600,50,20,250,250,false,btnAvanzar31,true,"src/Recursos/procesos/sistemaLocal.jpg", 500, 200,450,250,450,250));
		
		panel.add(colocarFlechaDer("src/Recursos/semidabder.png","Para definir los componentes de las matrices","necesitaremos de estos datos",true,true,btnAvanzar31,
				40,600,50,20,250,250,false,btnAvanzar32,true,"src/Recursos/procesos/definicionComponentes_1.jpg", 500, 175,400,280,400,280));
		panel.add(colocarFlechaDer("src/Recursos/semidabizq.png","Y estos, además tengo que decirte algo"," sobre el siguiente paso",true,true,btnAvanzar32,
				40,600,50,20,250,250,false,btnAvanzar33,true,"src/Recursos/procesos/definicionComponentes_2.jpg", 500, 200,320,150,320,150));
		panel.add(colocarFlechaDer("src/Recursos/indiferente.png","Aquí en C usaremos el método de gallerkin","modificado o no nos cuadrará",true,true,btnAvanzar33,
				40,600,50,20,250,250,false,btnAvanzar34,true,"src/Recursos/procesos/definicionComponentes_3.jpg", 500, 250,350,120,350,120));
		panel.add(colocarFlechaDer("src/Recursos/indiferente.png","Continuando","",true,true,btnAvanzar34,
				40,600,50,20,250,250,false,btnAvanzar35,true,"src/Recursos/procesos/definicionComponentes_4.jpg", 500, 150,500,350,500,350));
		panel.add(colocarFlechaDer("src/Recursos/estresado.png","C nos queda así","algo largo, lo se",true,true,btnAvanzar35,
				40,600,50,20,250,250,false,btnAvanzar36,true,"src/Recursos/procesos/definicionComponentes_5.jpg", 300, 75,850,400,850,400));
		panel.add(colocarFlechaDer("src/Recursos/mostrar1.png","Vamos con la matriz K ahora no usaremos ","Gallerkin modificado pues ahora si cuadra",true,true,btnAvanzar36,
				40,600,50,20,250,250,false,btnAvanzar37,true,"src/Recursos/procesos/definicionComponentes_6.jpg", 450, 75,700,400,700,400));
		panel.add(colocarFlechaDer("src/Recursos/semidabder.png","Matriz L","",true,true,btnAvanzar37,
				40,600,50,20,250,250,false,btnAvanzar38,true,"src/Recursos/procesos/definicionComponentes_7.jpg", 500, 150,650,300,650,300));
		panel.add(colocarFlechaDer("src/Recursos/semidabizq.png","Matriz G, de nuevo usaremos Gallerkin","modificado",true,true,btnAvanzar38,
				40,600,50,20,250,250,false,btnAvanzar39,true,"src/Recursos/procesos/definicionComponentes_8.jpg", 500, 150,650,300,650,300));
		panel.add(colocarFlechaDer("src/Recursos/mostrar1.png","sigamos","",true,true,btnAvanzar39,
				40,600,50,20,250,250,false,btnAvanzar40,true,"src/Recursos/procesos/definicionComponentes_9.jpg", 400, 100,750,300,750,300));
		panel.add(colocarFlechaDer("src/Recursos/mostrar3.png","Así de bonito queda","",true,true,btnAvanzar40,
				40,600,50,20,250,250,false,btnAvanzar41,true,"src/Recursos/procesos/definicionComponentes_10.jpg", 50, 75,1050,300,1050,300));
		
		//asdka
		panel.add(colocarFlechaDer("src/Recursos/mostrar2.png","Aquí hubiera puesto mi animación","",true,true,btnAvanzar41,
				40,600,50,20,250,250,false,btnAvanzar42,true,"", 50, 75,1200,300,1200,300));
		panel.add(colocarFlechaDer("src/Recursos/situvierauno.png","si la hubiera hecho","",true,true,btnAvanzar42,
				40,600,50,20,250,250,false,btnAvanzar43,true,"", 500, 200,500,500,500,500));
		panel.add(colocarFlechaDer("src/Recursos/mostrar1.png","Ah no, si lo hice","",true,true,btnAvanzar43,
				40,600,50,20,250,250,false,btnAvanzar44,true,"", 50, 75,1200,300,1200,300));
		panel.add(colocarFlechaDer("src/Recursos/mostrar1.png","y tambien este","",true,true,btnAvanzar44,
				40,600,50,20,250,250,false,btnAvanzar45,true,"", 50, 75,1200,300,1200,300));
		panel.add(colocarFlechaDer("src/Recursos/mostrar1.png","ta daah","",true,true,btnAvanzar45,
				40,600,50,20,250,250,false,btnAvanzar46,true,"", 50, 75,1200,300,1200,300));
		panel.add(colocarFlechaDer("src/Recursos/mostrar3.png","Y... Y...","Y...",true,true,btnAvanzar46,
				40,600,50,20,250,250,false,btnAvanzar47,true,"", 50, 75,1200,300,1200,300));
		panel.add(colocarFlechaDer("src/Recursos/estresado.png","Adios","",true,true,btnAvanzar47,
				40,600,50,20,250,250,false,btnAvanzar48,true,"", 50, 75,1200,300,1200,300));
		
		
		
		
		
		
		
		
		//panel.add(colocarFlechaIz(10, 400, 80, 30));
		

	}
	
	private JLabel agregarLabel(JLabel label, String texto, int x, int y, int width, int heigth, int size, boolean fl) {
		label.setText(texto);
		label.setBounds(x, y, width, heigth);
		label.setFont(new Font("Helvetica", Font.PLAIN, size));
		label.setVisible(fl);
		return label;
	}

	private JLabel agregarImagen(JLabel label, String nombre, int x, int y, int width, int heigth, int size1, int size2, boolean visible) {
		ImageIcon img1 = new ImageIcon(nombre);
		label.setBounds(x, y, width, heigth);
		label.setIcon(new ImageIcon(img1.getImage().getScaledInstance(size1,size2, Image.SCALE_SMOOTH)));
		label.setVisible(visible);
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


	private JButton colocarFlechaDer(String imagen,String texto1, String texto2,boolean fl1,
			boolean fl2,JButton btn,int x, int y, int width, int heigth, int size1, int size2,
			boolean visible,JButton btn2,
			boolean visible2, String imagen2, int x2, int y2, int width2, int heigth2, int size12, int size22) {
		
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
				ImageIcon img2 = new ImageIcon(imagen2);
				proceso1.setBounds(x2, y2, width2, heigth2);
				proceso1.setIcon(new ImageIcon(img2.getImage().getScaledInstance(size12,size22, Image.SCALE_SMOOTH)));
				proceso1.repaint();
				dialogo1.setText(texto1);
				dialogo2.setText(texto2);
				dialogo1.setVisible(fl1);
				dialogo2.setVisible(fl2);
				proceso1.setVisible(visible2);
				btn.setVisible(false);
				btn2.setVisible(true);
				if(btn == btnAvanzar43) {
					Ventanagif ventanagif = new Ventanagif(1);
					ventanagif.setVisible(true);
				};
				if(btn == btnAvanzar45) {
					Ventanagif ventanagif = new Ventanagif(2);
					ventanagif.setVisible(true);
				};
			}
		});
		return btn;
	}
	
}
