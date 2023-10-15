package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Button;

public class MainScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(79, 45, 127));
		frame.setBounds(100, 100, 864, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel left_panel_2D = new JPanel();
		left_panel_2D.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		left_panel_2D.setBackground(new Color(79, 45, 127));
		
		JButton btnNewButton = new JButton("Circle");
		btnNewButton.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CircleArea frame = new CircleArea();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		
		JButton btnNewButton_1 = new JButton("Triangle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBackground(Color.WHITE);
		
		JButton btnNewButton_1_1 = new JButton("Square");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1.setBackground(Color.WHITE);
		
		JButton btnNewButton_1_2 = new JButton("Rectangle");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_2.setBackground(Color.WHITE);
		
		JButton btnNewButton_1_3 = new JButton("Parallelogram");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_3.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_3.setBackground(Color.WHITE);
		
		JButton btnNewButton_1_4 = new JButton("Trapezium");
		btnNewButton_1_4.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_4.setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(79, 45, 127));
		GroupLayout gl_left_panel_2D = new GroupLayout(left_panel_2D);
		gl_left_panel_2D.setHorizontalGroup(
			gl_left_panel_2D.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_left_panel_2D.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_left_panel_2D.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
						.addComponent(btnNewButton_1_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
						.addComponent(btnNewButton_1_3, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
						.addComponent(btnNewButton_1_2, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
						.addComponent(btnNewButton_1_1, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
					.addGap(49))
		);
		gl_left_panel_2D.setVerticalGroup(
			gl_left_panel_2D.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_left_panel_2D.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1_1, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1_2, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1_3, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1_4, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addGap(14))
		);
		
		JLabel lblNewLabel_1 = new JLabel("2D Shapes");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel_1.setBackground(new Color(79, 45, 127));
		panel.add(lblNewLabel_1);
		gl_left_panel_2D.setHonorsVisibility(false);
		gl_left_panel_2D.setAutoCreateContainerGaps(true);
		gl_left_panel_2D.setAutoCreateGaps(true);
		left_panel_2D.setLayout(gl_left_panel_2D);
		
		JPanel right_Panel_3D = new JPanel();
		right_Panel_3D.setBackground(new Color(79, 45, 127));
		right_Panel_3D.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JButton btnNewButton_1_4_2 = new JButton("Hemisphere");
		btnNewButton_1_4_2.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_4_2.setBackground(Color.WHITE);
		
		JButton btnNewButton_1_3_2 = new JButton("Sphere");
		btnNewButton_1_3_2.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_3_2.setBackground(Color.WHITE);
		
		JButton btnNewButton_1_2_2 = new JButton("Cone");
		btnNewButton_1_2_2.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_2_2.setBackground(Color.WHITE);
		
		JButton btnNewButton_1_1_2 = new JButton("Cylinder");
		btnNewButton_1_1_2.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1_2.setBackground(Color.WHITE);
		
		JButton btnNewButton_1_6 = new JButton("Rectangular Prism");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_6.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_6.setBackground(Color.WHITE);
		
		JButton btnNewButton_3 = new JButton("Cube");
		btnNewButton_3.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_3.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(79, 45, 127));
		
		JLabel lblNewLabel_1_1 = new JLabel("3D Shapes");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel_1_1.setBackground(new Color(79, 45, 127));
		panel_1.add(lblNewLabel_1_1);
		GroupLayout gl_right_Panel_3D = new GroupLayout(right_Panel_3D);
		gl_right_Panel_3D.setHorizontalGroup(
			gl_right_Panel_3D.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_right_Panel_3D.createSequentialGroup()
					.addGap(58)
					.addGroup(gl_right_Panel_3D.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_right_Panel_3D.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
							.addGap(44))
						.addGroup(gl_right_Panel_3D.createSequentialGroup()
							.addGroup(gl_right_Panel_3D.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
								.addComponent(btnNewButton_1_6, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
								.addComponent(btnNewButton_1_1_2, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
								.addComponent(btnNewButton_1_2_2, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
								.addComponent(btnNewButton_1_3_2, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
								.addComponent(btnNewButton_1_4_2, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
							.addGap(44))))
		);
		gl_right_Panel_3D.setVerticalGroup(
			gl_right_Panel_3D.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_right_Panel_3D.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(btnNewButton_1_6, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(btnNewButton_1_1_2, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(btnNewButton_1_2_2, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(btnNewButton_1_3_2, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(btnNewButton_1_4_2, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addContainerGap())
		);
		right_Panel_3D.setLayout(gl_right_Panel_3D);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(79, 45, 127));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(67)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
							.addGap(49))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(left_panel_2D, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(right_Panel_3D, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(18))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(left_panel_2D, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(right_Panel_3D, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(10))
		);
		
		JLabel lblNewLabel = new JLabel("Surface Area Calculator for 2D and 3D Shapes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblNewLabel.setBackground(new Color(64, 0, 128));
		panel_2.add(lblNewLabel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
