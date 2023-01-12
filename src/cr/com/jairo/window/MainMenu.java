package cr.com.jairo.window;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class MainMenu extends JFrame {
	private JTextField textField;
	
	public static void main(String[] args) {
		MainMenu mm = new MainMenu();
		mm.setVisible(true);
	}
	
	
	public MainMenu() {
		getContentPane().setForeground(new Color(128, 0, 255));
		getContentPane().setBackground(new Color(128, 128, 255));

		this.setSize(445, 629);
		this.setResizable(false);
		this.setTitle("TetrisJ");
		this.setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("Inicio");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("HP Simplified Hans", Font.PLAIN, 21));
		

		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Window window = new Window();
				MainMenu mainMenu = new MainMenu();
				mainMenu.dispose();
			}
		});
		
		textField = new JTextField();
		textField.setForeground(new Color(128, 128, 255));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setFont(new Font("Ebrima", Font.BOLD | Font.ITALIC, 30));
		textField.setText("Tetris J");
		textField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(155)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(73)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(90, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(110)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(113)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(231, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

		
	}
}
