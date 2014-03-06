import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JComponent;


public class Diagram extends JComponent {

	private static final long serialVersionUID = 1L;
	private int women;
	private int men;
	private float total;
	
	public Diagram(int men, int women, float total) {
		super();
		this.women = women;
		this.men = men;
		this.total = total;
	}

	public Diagram() {
		this.women = 0;
		this.men = 0;
		this.total = 0;
	}

	
	
	public void updateValues(int men, int women){
		System.out.println("update values");
		
		this.women = women;
		this.men = men;
		this.total = this.women = this.men;
		System.out.println(this.men + " " + this.women + " " + this.total);
	
		this.invalidate();
		this.repaint();
	
	}
	
	/**
	public void setNewPosition(int x, int y){
		System.out.println("setNewPosition: " + x + " " + y);
		this.x = x;
		this.y = y;
		
		repaint(200,0,400,400);
		
	}
	*/
	//private void repaint(int men, int women) {
		
		
	//}
	
	protected void paintComponent(Graphics g){
		
		//double men1 = 0, women1 =0, total1 =0;
				
				/**
				float percentage;
				float percentage1;
				
				percentage = (float)(this.men/this.total);
				percentage1 = (float)(this.women/this.total);
				*/
				
				
				/**
				System.out.println("The percentage for men are =" + percentage + "%");
				
				System.out.println("The percentage for women are =" + percentage1 + "%");

				System.out.println("Enter the score obtained");
				*/
		
		int width = getWidth();
		int height = getHeight();
		
		if(this.women > 0){
			float percent = (women/total);
			float pixelValue = height*percent;
			
			System.out.println("Paint (women): " + women + " of " + total +" (" + percent + "%");
			int posX = (width/2) - (width/4);
			int posY = (int) (height-pixelValue);
			
			g.setColor(Color.BLUE);
			g.fillRect(posX, posY, width/4,(int) pixelValue);
		}else{
			System.out.println("women");
		}
		
		if(this.men > 0){
			float percent = (men/total);
			float pixelValue = height*percent;
			
			int posX = (width/2) - (width/4);
			int posY = (int) (height-pixelValue);
			
			g.setColor(Color.RED);
			g.fillRect(posX, posY, width/4, (int) pixelValue);
		}else{
			System.out.println("men");
			
			
		}
		g.setColor(Color.black);
		g.drawLine(0,0,width,0);
		g.drawString("Total" + total + " sökande",0,15);
		
		g.setColor(Color.black);
		g.drawLine(0,height-1,width,height-1);
		
		
	}
}