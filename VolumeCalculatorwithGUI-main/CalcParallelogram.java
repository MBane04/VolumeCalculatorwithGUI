package OpenEndedMiniProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Component;

public class CalcParallelogram extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcParallelogram frame = new CalcParallelogram();
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
	public CalcParallelogram() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalcParallelogram.class.getResource("/OpenEndedMiniProject/guicalcicon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 453);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(79, 45, 127));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(79, 45, 127));
		
		JLabel lblSurfaceAreaCalculator = new JLabel("Surface Area Calculator for Parallelogram");
		lblSurfaceAreaCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurfaceAreaCalculator.setForeground(Color.WHITE);
		lblSurfaceAreaCalculator.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblSurfaceAreaCalculator.setBackground(new Color(64, 0, 128));
		panel_2.add(lblSurfaceAreaCalculator);
		
		JTextArea textArea_1 = new JTextArea();
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String getValue = textField_1.getText();
				String getValue2 = textField.getText();
				double base = Double.parseDouble(getValue);
				double height = Double.parseDouble(getValue2);
				double output = base*height;
				textArea_1.setText(""+output);
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblEnterX = new JLabel("Enter Base: ");
		lblEnterX.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterX.setForeground(Color.WHITE);
		lblEnterX.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblEnterX.setBackground(new Color(64, 0, 128));
		
		JLabel lblSurfaceAreaCalculator_1_1 = new JLabel("Enter Height: ");
		lblSurfaceAreaCalculator_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurfaceAreaCalculator_1_1.setForeground(Color.WHITE);
		lblSurfaceAreaCalculator_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblSurfaceAreaCalculator_1_1.setBackground(new Color(64, 0, 128));
		
		JLabel lblSurfaceAreaCalculator_1_2 = new JLabel("Out: ");
		lblSurfaceAreaCalculator_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurfaceAreaCalculator_1_2.setForeground(Color.WHITE);
		lblSurfaceAreaCalculator_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblSurfaceAreaCalculator_1_2.setBackground(new Color(64, 0, 128));
		
		JTextPane txtpnBh = new JTextPane();
		txtpnBh.setText("b*h");
		
		JLabel lblSurfaceAreaCalculator_1_2_1 = new JLabel("Formula:");
		lblSurfaceAreaCalculator_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurfaceAreaCalculator_1_2_1.setForeground(Color.WHITE);
		lblSurfaceAreaCalculator_1_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblSurfaceAreaCalculator_1_2_1.setBackground(new Color(64, 0, 128));
		
		JButton btnE = new JButton("Reset");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textArea_1.setText("");
				textField.setText("");
			}
		});
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(118)
					.addComponent(lblEnterX, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
					.addGap(115))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(89)
					.addComponent(lblSurfaceAreaCalculator_1_1, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
					.addGap(115))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(66)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
					.addGap(70)
					.addComponent(btnE, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
					.addGap(64))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(105)
							.addComponent(lblSurfaceAreaCalculator_1_2))
						.addComponent(lblSurfaceAreaCalculator_1_2_1, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnBh)
						.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
					.addGap(22))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(38))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEnterX)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSurfaceAreaCalculator_1_1)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
					.addGap(56)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnE, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSurfaceAreaCalculator_1_2_1)
						.addComponent(txtpnBh, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSurfaceAreaCalculator_1_2)
						.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
		);
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {lblSurfaceAreaCalculator_1_2, lblSurfaceAreaCalculator_1_2_1});
		contentPane.setLayout(gl_contentPane);
	}
}
