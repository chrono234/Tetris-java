package cr.com.jairo.window;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.Clip;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;

public class MainMenu extends JFrame {
	private JTextField textField;
	private JTextField txtDevelopedByJairo;
	
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
		this.setIconImage(new ImageIcon("C:\\Users\\jairo O\\eclipse-workspace\\Projecto-Visual\\src\\img\\Logo.png").getImage());
		
		try {
            FondoSwing fondo = new FondoSwing(ImageIO
            		.read(new File("C:\\Users\\jairo O\\eclipse-workspace\\TetrisJ\\textures\\fondo.jpg")));
            JPanel panel = (JPanel) this.getContentPane();
		
		JButton btnInicio = new JButton("Inicio");
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
		textField.setForeground(new Color(255, 255, 255));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setFont(new Font("Ebrima", Font.BOLD | Font.ITALIC, 30));
		textField.setText("Tetris J");
		textField.setColumns(10);
		textField.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0, 51, 204), new Color(51, 204, 204), new Color(0, 51, 255), new Color(0, 204, 204)));
		textField.setOpaque(false);
		
		txtDevelopedByJairo = new JTextField();
		txtDevelopedByJairo.setBackground(new Color(128, 128, 255));
		txtDevelopedByJairo.setHorizontalAlignment(SwingConstants.CENTER);
		txtDevelopedByJairo.setForeground(SystemColor.textHighlightText);
		txtDevelopedByJairo.setEditable(false);
		txtDevelopedByJairo.setText("Developed by Jairo");
		txtDevelopedByJairo.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtDevelopedByJairo.setColumns(10);
		txtDevelopedByJairo.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtDevelopedByJairo.setOpaque(false);
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(146)
					.addComponent(btnInicio, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(140, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(210, Short.MAX_VALUE)
					.addComponent(txtDevelopedByJairo, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(53)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(65, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(109)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(111)
					.addComponent(btnInicio, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
					.addComponent(txtDevelopedByJairo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
		);
		getContentPane().setLayout(groupLayout);
		panel.setBorder(fondo);
		} catch (IOException ex) {
	        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}
}
