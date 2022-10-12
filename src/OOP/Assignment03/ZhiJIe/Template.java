package OOP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;

public class Template {

	private JFrame frame;
	private JTextField names;
	private JTextField studen;
	private JTextField email;
	private JTextField phone;
	private JTextField address;
	private JTextField nationality;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public Template() {
		gui();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void gui() {
		frame = new JFrame();
		frame.setFont(new Font("Arial", Font.BOLD, 18));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\00-WindowsData\\Pictures\\KEKW.jpg"));
		frame.setType(Type.UTILITY);
		frame.setTitle("2022 Student Registration System");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1366,768);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration System");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 40));
		lblNewLabel.setBounds(400, 11, 550, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Names:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(60, 110, 90, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		names = new JTextField();
		names.setFont(new Font("Tahoma", Font.PLAIN, 11));
		names.setBounds(160, 110, 200, 40);
		frame.getContentPane().add(names);
		names.setColumns(10);
		
		studen = new JTextField();
		studen.setColumns(10);
		studen.setBounds(160, 160, 200, 40);
		frame.getContentPane().add(studen);
		
		JLabel lblNewLabel_1_1 = new JLabel("Student ID:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(50, 160, 120, 40);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Age:");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(50, 210, 90, 40);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JComboBox age = new JComboBox();
		age.setFont(new Font("Arial", Font.BOLD, 20));
		age.setModel(new DefaultComboBoxModel(new String[] {"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		age.setBounds(160, 210, 200, 40);
		frame.getContentPane().add(age);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email ID:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(50, 260, 120, 40);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(160, 260, 200, 40);
		frame.getContentPane().add(email);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(160, 310, 200, 40);
		frame.getContentPane().add(phone);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Phone No:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(50, 310, 120, 40);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Address:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1.setBounds(50, 360, 110, 40);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		address = new JTextField();
		address.setHorizontalAlignment(SwingConstants.LEFT);
		address.setColumns(10);
		address.setBounds(160, 360, 200, 100);
		frame.getContentPane().add(address);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Gender:");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1_1.setBounds(50, 460, 120, 40);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		JRadioButton male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.BOLD, 25));
		male.setToolTipText("");
		male.setBounds(160, 460, 90, 40);
		frame.getContentPane().add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setToolTipText("");
		female.setFont(new Font("Arial", Font.BOLD, 25));
		female.setBounds(252, 460, 120, 40);
		frame.getContentPane().add(female);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Nationality:");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_2.setBounds(50, 510, 120, 40);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_2);
		
		nationality = new JTextField();
		nationality.setColumns(10);
		nationality.setBounds(160, 510, 200, 40);
		frame.getContentPane().add(nationality);
		
		JLabel lblNewLabel_1_3 = new JLabel("Year of Enrollment:");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(50, 560, 190, 40);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JComboBox enrollment = new JComboBox();
		enrollment.setFont(new Font("Arial", Font.BOLD, 25));
		enrollment.setModel(new DefaultComboBoxModel(new String[] {"2021", "2022", "2023", "2024"}));
		enrollment.setBounds(260, 560, 100, 40);
		frame.getContentPane().add(enrollment);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Year of Studies:");
		lblNewLabel_1_3_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(50, 610, 190, 40);
		frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JComboBox studies = new JComboBox();
		studies.setModel(new DefaultComboBoxModel(new String[] {"2", "3"}));
		studies.setFont(new Font("Arial", Font.BOLD, 25));
		studies.setBounds(260, 610, 100, 40);
		frame.getContentPane().add(studies);
		
		JLabel programmme = new JLabel("Programme");
		programmme.setFont(new Font("Arial", Font.BOLD, 20));
		programmme.setBounds(50, 660, 190, 40);
		frame.getContentPane().add(programmme);
		
		JComboBox program = new JComboBox();
		program.setModel(new DefaultComboBoxModel(new String[] {"SEAIR", "SEDSC", "SECEF", "SECVR", "SEIOT"}));
		program.setFont(new Font("Arial", Font.BOLD, 25));
		program.setBounds(250, 660, 110, 40);
		frame.getContentPane().add(program);
		
		JPanel panel = new JPanel();
		panel.setBounds(550, 110, 200, 225);
		frame.getContentPane().add(panel);
		
		JButton Receipt = new JButton("Generate Receipt");
		Receipt.setFont(new Font("Arial", Font.BOLD, 20));
		Receipt.setBounds(550, 360, 200, 40);
		frame.getContentPane().add(Receipt);
		
		JButton Reset = new JButton("Reset");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Reset.setFont(new Font("Arial", Font.BOLD, 20));
		Reset.setBounds(550, 410, 200, 40);
		frame.getContentPane().add(Reset);
		
		JButton Print_1_1 = new JButton("Print");
		Print_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		Print_1_1.setBounds(550, 460, 200, 40);
		frame.getContentPane().add(Print_1_1);
		
		JButton Brown = new JButton("Browns");
		Brown.setFont(new Font("Arial", Font.BOLD, 20));
		Brown.setBounds(550, 510, 200, 40);
		frame.getContentPane().add(Brown);
		
		
	}
}
