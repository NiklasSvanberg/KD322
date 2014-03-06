import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;


public class BikeStoreGUI extends JFrame {
	
	BikeStore bikeInfo;
	
	private TextArea textArea;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		getContentPane().setLayout(null);
		bikeInfo = new BikeStore();
		bikeInfo.addBike("svart", 10,2000);
		bikeInfo.addBike("blå", 12,4000);
		bikeInfo.addBike("rosa", 6,1000);
		bikeInfo.addBike("röd", 30,7000);
		bikeInfo.addBike("rosa", 22,6000);
		bikeInfo.addBike("grön", 14,40000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new TextArea();
		textArea.setBounds(169, 10, 255, 160);
		contentPane.add(textArea);
		textArea.append(bikeInfo.getAllBikes());
			
		textField = new JTextField();
		textField.setBounds(44, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(44, 73, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(44, 42, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLggTill = new JButton("L\u00E4gg till...");
		btnLggTill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int price1 = Integer.parseInt(textField_2.getText());
				int size1 = Integer.parseInt(textField_1.getText());
				bikeInfo.addBike(textField.getText(),price1,size1);
				textArea.setText(bikeInfo.getAllBikes().toString());
			}
		});
		btnLggTill.setBounds(41, 176, 89, 23);
		contentPane.add(btnLggTill);
		
		JLabel lblFrg = new JLabel("F\u00E4rg:");
		lblFrg.setBounds(10, 14, 46, 14);
		contentPane.add(lblFrg);
		
		JLabel lblStorlek = new JLabel("Storlek:");
		lblStorlek.setBounds(0, 45, 46, 14);
		contentPane.add(lblStorlek);
		
		JLabel lblPris = new JLabel("Pris:");
		lblPris.setBounds(10, 76, 46, 14);
		contentPane.add(lblPris);
	}
}
