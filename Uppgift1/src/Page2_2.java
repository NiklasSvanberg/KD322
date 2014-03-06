import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;


public class Page2_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page2_2 frame = new Page2_2();
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
	public Page2_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 325);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setBounds(10, 11, 46, 14);
		contentPane.add(lblNamn);
		
		JLabel lblPersonnummer = new JLabel("Personnummer:");
		lblPersonnummer.setBounds(10, 36, 75, 14);
		contentPane.add(lblPersonnummer);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(10, 61, 46, 14);
		contentPane.add(lblAdress);
		
		JLabel lblTelNummer = new JLabel("Tel. nummer:");
		lblTelNummer.setBounds(10, 86, 75, 14);
		contentPane.add(lblTelNummer);
		
		JLabel lblEpost = new JLabel("E-post:");
		lblEpost.setBounds(10, 111, 46, 14);
		contentPane.add(lblEpost);
		
		textField = new JTextField();
		textField.setBounds(100, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 33, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 58, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(100, 83, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(100, 108, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblBild = new JLabel("Bild:");
		lblBild.setBounds(10, 183, 46, 14);
		contentPane.add(lblBild);
		
		textField_5 = new JTextField();
		textField_5.setBounds(100, 136, 46, 61);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnBlddra = new JButton("Bl\u00E4ddra...");
		btnBlddra.setBounds(156, 179, 89, 23);
		contentPane.add(btnBlddra);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(100, 230, 89, 23);
		contentPane.add(btnSpara);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Page2_2.class.getResource("/images/gym1.png")));
		lblNewLabel.setBounds(261, 36, 101, 126);
		contentPane.add(lblNewLabel);
	}
}
