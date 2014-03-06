import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class AnimalGUI extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private ArrayList<Animal>animalFarm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		animalFarm = new ArrayList<Animal>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 428, 244);
		contentPane.add(textArea);
		
		animalFarm.add(new hund(" Dante ",3, false));
		animalFarm.add(new hund(" Robert ",2, true));
		animalFarm.add(new hund(" Fido ",3, false));
		animalFarm.add(new hund(" Yngve ",2, true));
		
		for(Animal x: animalFarm){
			textArea.append (x.getInfo() + "\n");
		}
	}

}
