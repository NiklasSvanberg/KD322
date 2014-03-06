//private int year;  c) Instansvariabel
//private int size;  c) Instansvariabel
//private static int nbrOfHouses;   b) Klassvariabel
//public static final int MIN_SIZE =10; b) Klassvariabel
//public House(int _year,int _size){ a) Konstruktor 
//diverse kod 
//} 
//public static int getNbrHouses(){  e) Klassmetod
//return nbrOfHouses; 
//} 
//public int getYear(){ d) Instansmetod
//diverse kod 
//} 
//public int getSize(){ d) Instansmetod
//diverse kod 
//} 
//} 
//f) Variabeln kan inte ändras
//g) House

//   year: int
//   size: int
//   nbrOfHouses: int
//   MIN_SIZE: int = 10

//   House(int size, int year)
//   getNbrHouses()
//   getYear(): int
//   getSize(): int



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import javax.swing.JTextArea;


public class HouseGUI extends JFrame {

	private static final int MIN_SIZE = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(29, 26, 355, 130);
		contentPane.add(textArea);
		textArea.setBounds(26, 26, 380, 160);
		
		House[] HouseArray = new House[10];
		HouseArray[0] = new House(1960, 55);
		HouseArray[1] = new House(1940, 64);
		HouseArray[2] = new House(1955, 70);
		
		for(int i = 0; i < 10; i++){
			if(HouseArray[i]!= null){
				textArea.append("Huset är byggt " + HouseArray[i].getYear() + " och är " + HouseArray[i].getSize() + " kvm stort\n");
			}
		}
		textArea.append("Det finns " +House.getNbrHouses() + " Hus");
	}

}
