package cr.com.jairo.window;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class MainMenu extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtDevelopedByJairo;
	int xMouse, yMouse;
	
	private JLabel labelExit;
	
	public static void main(String[] args) {
		MainMenu mm = new MainMenu();
		mm.setVisible(true);
	}
	
	public MainMenu() {
		getContentPane().setForeground(new Color(128, 0, 255));
		getContentPane().setBackground(new Color(128, 128, 255));

		this.setTitle("TetrisJ");
		this.setSize(400, 650);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);

		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		try {
            FondoSwing fondo = new FondoSwing(ImageIO
            		.read(new File("C:\\Users\\jairo O\\eclipse-workspace\\TetrisJ\\textures\\fondo.jpg")));
            JPanel panel = (JPanel) this.getContentPane();
            contentPane.setLayout(null);
            
    		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
    			@Override
    			public void mouseDragged(MouseEvent e) {
    				contentPaneMouseDragged(e);
    			     
    			} 
    		});
    		contentPane.addMouseListener(new MouseAdapter() {
    			@Override
    			public void mousePressed(MouseEvent e) {
    				contentPaneMousePressed(e);
    			}
    		});
    		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.setBounds(146, 317, 100, 42);
		btnInicio.setForeground(new Color(0, 0, 0));
		btnInicio.setBackground(SystemColor.inactiveCaptionBorder);
		btnInicio.setFont(new Font("HP Simplified Hans", Font.PLAIN, 21));
		btnInicio.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0, 204, 204), new Color(0, 51, 255), Color.CYAN, Color.BLUE));
		btnInicio.setOpaque(false);
		
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Window window = new Window();
				btnInicio.removeActionListener(this); 
				dispose();
			}
		});
		
		textField = new JTextField();
		textField.setBounds(53, 109, 268, 97);
		textField.setForeground(new Color(255, 255, 255));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setFont(new Font("Ebrima", Font.BOLD | Font.ITALIC, 30));
		textField.setText("Tetris J");
		textField.setColumns(10);
		textField.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0, 51, 204), new Color(51, 204, 204), new Color(0, 51, 255), new Color(0, 204, 204)));
		textField.setOpaque(false);
		
		txtDevelopedByJairo = new JTextField();
		txtDevelopedByJairo.setBounds(224, 618, 176, 32);
		txtDevelopedByJairo.setBackground(new Color(128, 128, 255));
		txtDevelopedByJairo.setHorizontalAlignment(SwingConstants.CENTER);
		txtDevelopedByJairo.setForeground(SystemColor.textHighlightText);
		txtDevelopedByJairo.setEditable(false);
		txtDevelopedByJairo.setText("Developed by Jairo");
		txtDevelopedByJairo.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtDevelopedByJairo.setColumns(10);
		txtDevelopedByJairo.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtDevelopedByJairo.setOpaque(false);
		panel.setBorder(fondo);
		contentPane.setLayout(null);
		
		JPanel btnExit = new JPanel();
		btnExit.setBounds(368, 0, 32, 32);
		contentPane.add(btnExit);
		btnExit.setOpaque(false); 
		
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				labelExit.setForeground(Color.red);
			}			
			@Override
			public void mouseExited(MouseEvent e) {
				btnExit.setBackground(Color.white);
			    labelExit.setForeground(Color.black);
			} 
		});
		
		labelExit = new JLabel("X");
		labelExit.setBounds(0, 0, 32, 36);
		btnExit.add(labelExit);
		labelExit.setHorizontalAlignment(SwingConstants.CENTER);
		labelExit.setForeground(SystemColor.black);
		labelExit.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		contentPane.add(btnInicio);
		contentPane.add(txtDevelopedByJairo);
		contentPane.add(textField);
		} catch (IOException ex) {
	        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	    } 
	} 
	
	private void contentPaneMousePressed(java.awt.event.MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }
	
	private void contentPaneMouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
}
}
