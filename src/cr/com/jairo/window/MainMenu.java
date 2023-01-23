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
import javax.swing.LayoutStyle.ComponentPlacement;


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
				MainMenu mm = new MainMenu();
				mm.setVisible(false);
				btnNewButton.removeActionListener(this);
			}
		});
		
		textField = new JTextField();
		textField.setForeground(new Color(128, 128, 255));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setFont(new Font("Ebrima", Font.BOLD | Font.ITALIC, 30));
		textField.setText("Tetris J");
		textField.setColumns(10);
		
		txtDevelopedByJairo = new JTextField();
		txtDevelopedByJairo.setBackground(new Color(128, 128, 255));
		txtDevelopedByJairo.setHorizontalAlignment(SwingConstants.CENTER);
		txtDevelopedByJairo.setForeground(new Color(0, 0, 0));
		txtDevelopedByJairo.setEditable(false);
		txtDevelopedByJairo.setText("Developed by Jairo");
		txtDevelopedByJairo.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtDevelopedByJairo.setColumns(10);
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
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(255, Short.MAX_VALUE)
					.addComponent(txtDevelopedByJairo, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(110)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(113)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
					.addComponent(txtDevelopedByJairo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		getContentPane().setLayout(groupLayout);
		
	}
}
