package cr.com.jairo.window;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;

public class Window {
	
	public static final int WIDTH = 314, HEIGHT = 630;
	private JFrame window;
	private Board board;
	
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

}
