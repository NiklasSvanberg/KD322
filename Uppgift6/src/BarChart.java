import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class BarChart extends JFrame {
	
	private JPanel contentPane;
	
	private Document doc;
	
	private ArrayList<Program> programsList = new ArrayList<Program>();
	
	private JPanel contentPane1;
	
	private BarChart barChart;
	
	private Diagram Diagram_;
	
	
	private Document openXmlFile(String fileName) { 
		Document doc = null;
		try { 
			File fXmlFile = new File(fileName);  
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();  
			doc = dBuilder.parse(fXmlFile);   
			doc.getDocumentElement().normalize();
			} catch
			(Exception e) {
				e.printStackTrace();  
				} 
		return doc; }
	

	/**
	 * Launch the application.
	 */
	/**
	public static void main1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarChart frame = new BarChart();
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
	public BarChart() {
		
		
		
		doc = openXmlFile("ht2013_antagning.xml");
		Element root = doc.getDocumentElement(); 
		NodeList nodes = root.getChildNodes();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Diagram_ = new Diagram();
		Diagram_.setSize(436,225);
		Diagram_.setLocation(5,143);
		contentPane.add(Diagram_);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(5, 43, 440, 28);
		contentPane.add(textArea);
		textArea.setText("First element: " + root.getNodeName());
		
		JLabel JLabel = new JLabel("");
		JLabel.setBounds(5, 5, 440, 28);
		contentPane.add(JLabel);
		JLabel.setText("Antal program: " + loadAllPrograms().size());
		
		
		programsList = loadAllPrograms();
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(6, 104, 439, 28);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray()));
		
		
		
		comboBox.addItemListener(new ItemChangeListener());
		
	}
	
	class ItemChangeListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent event) {
			if(event.getStateChange()== ItemEvent.SELECTED){
				Program program = (Program)event.getItem();
			
				
			}
			
		}
		
		
	}
	
	private ArrayList<Program>loadAllPrograms() { 
		
	ArrayList<Program> output = new ArrayList<Program>();

	
	NodeList programs = doc.getElementsByTagName("Program"); 
	for (int i = 0; i < programs.getLength(); i++) {
		
	
	    Node node = programs.item(i);
	    Element elm = (Element) node;
	    
	    String name = elm.getElementsByTagName("name").item(0).getTextContent();
	    String code = elm.getElementsByTagName("code").item(0).getTextContent();
	    int women = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
	    int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());
	   
	
	
	Program program = new Program(name, code, women, men);
	    output.add(program);
	  }
	return output; }
	
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarChart frame = new BarChart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	/**public void BarChart1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}*/
}
