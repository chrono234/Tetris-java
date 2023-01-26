package cr.com.jairo.window;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.font.ImageGraphicAttribute;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;

public class Window {
	
	public static final int WIDTH = 314, HEIGHT = 630;
	private JFrame window;
	private Board board;
	BufferedImage backGround;
	
	
	
	public Window() {
		window = new JFrame("Tetris Game");
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
		board = new Board();
		board.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		board.setBackground(new Color(102, 102, 153));
		
		window.getContentPane().add(board, BorderLayout.CENTER);
		window.addKeyListener(board);
		
		window.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Window();
		
	}
	
	//Método para dibujar la imagen de fondo
		public void paint(Graphics g) {
			g.drawImage(backGround, 0, 0, null);
		}
	
	

}
