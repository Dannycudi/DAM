import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Box;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Dimension;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Joc extends JFrame {

	private JPanel contentPane;
	
	static int fallos = 1;
	static int aciertos = 0;
	static String palabra = "";
	static char[] arrayGuiones;
	JLabel lblPalabra;
	JLabel lblImg;
	
	//Declarem els botons per poder deshabilitar-los després
	JButton btnA; JButton btnB; JButton btnC; JButton btnD; JButton btnE; JButton btnF; JButton btnG; JButton btnH; JButton btnI; JButton btnJ;
	JButton btnK; JButton btnL; JButton btnM; JButton btnN; JButton btnNN; JButton btnO; JButton btnP; JButton btnQ; JButton btnR; JButton btnS;
	JButton btnT; JButton btnU; JButton btnV; JButton btnW; JButton btnX; JButton btnY; JButton btnZ; 
	
	String rutaImagen = "./img/" + fallos + ".png";
	ImageIcon img = new ImageIcon(rutaImagen);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		while (!comprobarPalabra()) palabra = JOptionPane.showInputDialog(null, "Introduce la palabra:");
		palabra = palabra.toLowerCase();
		
		arrayGuiones = new char[palabra.length()];
		palabra = palabra.toLowerCase();
		
		arrayGuiones = new char[palabra.length()];
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Joc frame = new Joc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Joc() {
		
		reiniciarArrayGuiones();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 572);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnA = new JButton("A");
		btnA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnA.setEnabled(false);
				comprobarLetra('a');
			}
		});
		btnA.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnA.setBounds(33, 309, 60, 60);
		btnA.setFocusPainted(false);
		contentPane.add(btnA);
		
		btnB = new JButton("B");
		btnB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnB.setEnabled(false);
				comprobarLetra('b');
			}
		});
		btnB.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnB.setBounds(103, 309, 60, 60);
		contentPane.add(btnB);
		
		btnC = new JButton("C");
		btnC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnC.setEnabled(false);
				comprobarLetra('c');
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnC.setBounds(173, 309, 60, 60);
		contentPane.add(btnC);
		
		btnD = new JButton("D");
		btnD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnD.setEnabled(false);
				comprobarLetra('d');
			}
		});
		btnD.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnD.setBounds(243, 309, 60, 60);
		contentPane.add(btnD);
		
		btnE = new JButton("E");
		btnE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnE.setEnabled(false);
				comprobarLetra('e');
			}
		});
		btnE.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnE.setBounds(313, 309, 60, 60);
		contentPane.add(btnE);
		
		btnF = new JButton("F");
		btnF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnF.setEnabled(false);
				comprobarLetra('f');
			}
		});
		btnF.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnF.setBounds(383, 309, 60, 60);
		contentPane.add(btnF);
		
		btnG = new JButton("G");
		btnG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnG.setEnabled(false);
				comprobarLetra('g');
			}
		});
		btnG.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnG.setBounds(453, 309, 60, 60);
		contentPane.add(btnG);
		
		btnH = new JButton("H");
		btnH.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnH.setEnabled(false);
				comprobarLetra('h');
			}
		});
		btnH.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnH.setBounds(523, 309, 60, 60);
		contentPane.add(btnH);
		
		btnK = new JButton("K");
		btnK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnK.setEnabled(false);
				comprobarLetra('k');
			}
		});
		btnK.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnK.setBounds(103, 380, 60, 60);
		contentPane.add(btnK);
		
		btnJ = new JButton("J");
		btnJ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnJ.setEnabled(false);
				comprobarLetra('j');
			}
		});
		btnJ.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnJ.setBounds(33, 380, 60, 60);
		contentPane.add(btnJ);
		
		btnL = new JButton("L");
		btnL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnL.setEnabled(false);
				comprobarLetra('l');
			}
		});
		btnL.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnL.setBounds(173, 380, 60, 60);
		contentPane.add(btnL);
		
		btnI = new JButton("I");
		btnI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnI.setEnabled(false);
				comprobarLetra('i');
			}
		});
		btnI.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnI.setBounds(593, 309, 60, 60);
		contentPane.add(btnI);
		
		btnM = new JButton("M");
		btnM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnM.setEnabled(false);
				comprobarLetra('m');
			}
		});
		btnM.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnM.setBounds(243, 380, 60, 60);
		contentPane.add(btnM);
		
		btnN = new JButton("N");
		btnN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnN.setEnabled(false);
				comprobarLetra('n');
			}
		});
		btnN.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnN.setBounds(313, 380, 60, 60);
		contentPane.add(btnN);
		
		btnNN = new JButton("\u00D1");
		btnNN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNN.setEnabled(false);
				comprobarLetra('ñ');
			}
		});
		btnNN.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNN.setBounds(383, 380, 60, 60);
		contentPane.add(btnNN);
		
		btnO = new JButton("O");
		btnO.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnO.setEnabled(false);
				comprobarLetra('o');
			}
		});
		btnO.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnO.setBounds(453, 380, 60, 60);
		contentPane.add(btnO);
		
		btnP = new JButton("P");
		btnP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnP.setEnabled(false);
				comprobarLetra('p');
			}
		});
		btnP.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnP.setBounds(523, 380, 60, 60);
		contentPane.add(btnP);
		
		btnQ = new JButton("Q");
		btnQ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnQ.setEnabled(false);
				comprobarLetra('q');
			}
		});
		btnQ.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnQ.setBounds(593, 380, 60, 60);
		contentPane.add(btnQ);
		
		btnR = new JButton("R");
		btnR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnR.setEnabled(false);
				comprobarLetra('r');
			}
		});
		btnR.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnR.setBounds(33, 451, 60, 60);
		contentPane.add(btnR);
		
		btnS = new JButton("S");
		btnS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnS.setEnabled(false);
				comprobarLetra('s');
			}
		});
		btnS.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnS.setBounds(103, 451, 60, 60);
		contentPane.add(btnS);
		
		btnT = new JButton("T");
		btnT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnT.setEnabled(false);
				comprobarLetra('t');
			}
		});
		btnT.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnT.setBounds(173, 451, 60, 60);
		contentPane.add(btnT);
		
		btnU = new JButton("U");
		btnU.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnU.setEnabled(false);
				comprobarLetra('u');
			}
		});
		btnU.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnU.setBounds(243, 451, 60, 60);
		contentPane.add(btnU);
		
		btnV = new JButton("V");
		btnV.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnV.setEnabled(false);
				comprobarLetra('v');
			}
		});
		btnV.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnV.setBounds(313, 451, 60, 60);
		contentPane.add(btnV);
		
		btnW = new JButton("W");
		btnW.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnW.setEnabled(false);
				comprobarLetra('w');
			}
		});
		btnW.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnW.setBounds(383, 451, 60, 60);
		contentPane.add(btnW);
		
		btnX = new JButton("X");
		btnX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnX.setEnabled(false);
				comprobarLetra('x');
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnX.setBounds(453, 451, 60, 60);
		contentPane.add(btnX);
		
		btnY = new JButton("Y");
		btnY.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnY.setEnabled(false);
				comprobarLetra('y');
			}
		});
		btnY.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnY.setBounds(523, 451, 60, 60);
		contentPane.add(btnY);
		
		btnZ = new JButton("Z");
		btnZ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnZ.setEnabled(false);
				comprobarLetra('z');
			}
		});
		btnZ.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnZ.setBounds(593, 451, 60, 60);
		contentPane.add(btnZ);
		
		lblPalabra = new JLabel("-------");
		lblPalabra.setBackground(Color.WHITE);
		lblPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		lblPalabra.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblPalabra.setBounds(313, 227, 340, 60);
		contentPane.add(lblPalabra);
		
		lblImg = new JLabel("");
		lblImg.setIcon(img);
		lblImg.setBounds(33, 27, 265, 260);
		contentPane.add(lblImg);
		
		
		actualizarLblPalabra();
	}

	private void reiniciarArrayGuiones() {
		
		for (int i = 0; i < arrayGuiones.length; i++) arrayGuiones[i] = '-';
		
	}
	
	private void actualizarLblPalabra() {
		
		String text = "";
		for (int i = 0; i < arrayGuiones.length; i++) text = text + arrayGuiones[i];
		
		lblPalabra.setText(text);
		
	}

	private void actualizarImagen() {
		
		fallos++;
		rutaImagen = "./img/" + fallos + ".png";
		img = new ImageIcon(rutaImagen);
		lblImg.setIcon(img);
		
	}
	
	public void comprobarLetra(char letra) {
		
		int pos = -1;
		
		for (int i = 0; i < palabra.length(); i++) {
			
			if (palabra.charAt(i) == letra) {
				if (arrayGuiones[i] == '-') {
					arrayGuiones[i] = letra;
					aciertos++;
				}
				pos = i;
			}
			
		}
		
		if (pos != -1) {
			actualizarLblPalabra();
		}
		else actualizarImagen();
		
		comprobarEstado();
				
	}
	
	public void comprobarEstado() {
		
		if (fallos == 7) {
			JOptionPane.showMessageDialog(null, "Has perdido! La palabra era " + palabra.toUpperCase() + "!", "7 ERRORES", JOptionPane.INFORMATION_MESSAGE);
			preguntarJuegoNuevo();
		}
		else if (aciertos == palabra.length()) {
			JOptionPane.showMessageDialog(null, "Felicidades! Has ganado!", "ENHORABUENA!", JOptionPane.INFORMATION_MESSAGE);
			preguntarJuegoNuevo();
		}
		
	}
	
	public void preguntarJuegoNuevo() {
		
		int opcion = JOptionPane.showConfirmDialog(null, "Quieres jugar de nuevo?", "JUEGO NUEVO", JOptionPane.YES_NO_OPTION);
		if (opcion == 0) reiniciarJuego();
		else System.exit(1);
		
	}
	
	public void reiniciarJuego() {
		
		contentPane.setVisible(false);
		palabra = "";
		while (!comprobarPalabra()) palabra = JOptionPane.showInputDialog(null, "Introduce la palabra:");
		palabra = palabra.toLowerCase();
		
		habilitarBotones();
		
		aciertos = 0;
		fallos = 0;
		
		arrayGuiones = new char[palabra.length()];
		reiniciarArrayGuiones();
		actualizarImagen();
		actualizarLblPalabra();
		
		contentPane.setVisible(true);
		
	}
	
	public static Boolean comprobarPalabra() {
		
		if (palabra == null) System.exit(1);
		if (palabra.isEmpty()) return false;
		if (palabra.length() > 16) return false;
		
		for (int i = 0; i < palabra.length(); i++) {
			
			if (!((palabra.charAt(i) > 64 && palabra.charAt(i) < 91) || (palabra.charAt(i) > 96 && palabra.charAt(i) < 123) || palabra.charAt(i) == 'ñ' || palabra.charAt(i) == 'Ñ'))  return false;
			
		}
		
		return true;
	}
	
	public void habilitarBotones() {
		
		for (int i = 0; i < contentPane.getComponents().length; i++) {
			
			if (contentPane.getComponent(i) instanceof JButton) contentPane.getComponent(i).setEnabled(true);
			
		}
		
	}
	
}
