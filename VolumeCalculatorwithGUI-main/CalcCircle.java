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
import java.util.Scanner;
public class CalcCircle extends JFrame {

	private JPanel contentPane;
	private JTextField txtHuh;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcCircle frame = new CalcCircle();
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
	public CalcCircle() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalcCircle.class.getResource("/OpenEndedMiniProject/guicalcicon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(79, 45, 127));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(79, 45, 127));
		Scanner in = new Scanner(System.in);
		JLabel lblSurfaceAreaCalculator = new JLabel("Surface Area Calculator for Circle");
		lblSurfaceAreaCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurfaceAreaCalculator.setForeground(Color.WHITE);
		lblSurfaceAreaCalculator.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblSurfaceAreaCalculator.setBackground(new Color(64, 0, 128));
		panel_2.add(lblSurfaceAreaCalculator);
		JTextArea txtrHuh = new JTextArea();
		txtrHuh.setText("");
		txtHuh = new JTextField();
		txtHuh.setText("");
		txtHuh.setColumns(10);
		
		JTextPane txtpnHere = new JTextPane();
		txtpnHere.setText("PI*r^2");
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String getValue = txtHuh.getText();
				
				double radius = Double.parseDouble(getValue);
				double tempnumb = (Math.pow(radius, 2));
				
				
				txtrHuh.setText(tempnumb+" *("+Math.PI+") "+" = "+tempnumb*(Math.PI));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		
		
		
		JLabel lblEnterX = new JLabel("Enter Radius: ");
		lblEnterX.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterX.setForeground(Color.WHITE);
		lblEnterX.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblEnterX.setBackground(new Color(64, 0, 128));
		
		JLabel lblSurfaceAreaCalculator_1_2 = new JLabel("Out: ");
		lblSurfaceAreaCalculator_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurfaceAreaCalculator_1_2.setForeground(Color.WHITE);
		lblSurfaceAreaCalculator_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblSurfaceAreaCalculator_1_2.setBackground(new Color(64, 0, 128));
		
		
		
		JLabel lblSurfaceAreaCalculator_1_2_1 = new JLabel("Formula:");
		lblSurfaceAreaCalculator_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurfaceAreaCalculator_1_2_1.setForeground(Color.WHITE);
		lblSurfaceAreaCalculator_1_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblSurfaceAreaCalculator_1_2_1.setBackground(new Color(64, 0, 128));
		
		JButton btnE = new JButton("Reset");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHuh.setText("");
				txtpnHere.setText("");
			}
		});
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(92)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(82))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEnterX, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(217)
							.addComponent(txtHuh, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
					.addGap(255))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(66)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
					.addGap(70)
					.addComponent(btnE, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
					.addGap(64))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(189)
					.addComponent(txtpnHere, GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
					.addGap(18))
				.addComponent(lblSurfaceAreaCalculator_1_2_1, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(105)
					.addComponent(lblSurfaceAreaCalculator_1_2)
					.addGap(4)
					.addComponent(txtrHuh, GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
					.addGap(18))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEnterX)
						.addComponent(txtHuh, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(89)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnE, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnHere, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSurfaceAreaCalculator_1_2_1))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSurfaceAreaCalculator_1_2)
						.addComponent(txtrHuh, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
