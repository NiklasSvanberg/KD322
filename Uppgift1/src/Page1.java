import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;


public class Page1 extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Page1() {
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}

}
