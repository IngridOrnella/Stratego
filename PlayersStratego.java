import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class PlayersStratego extends JComponent {
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2=(Graphics2D)g;
		
	// instructions de dessin
	// les cases
		int Case_Dim=30;
		boolean isWhite=true;
		for(int i=0; i<10; i++) {
			
		for(int j=0; j<10; j++) {
			
			
		if (isWhite) {
		g2.setPaint(Color.WHITE);
					
		}else {
		g2.setPaint(Color.RED);
		}
		if(i==5&&j==2 || i==5&&j==3||i==5&&j==6||i==5&&j==7||i==4&&j==2 || i==4&&j==3||i==4&&j==6||i==4&&j==7) {
	        g2.setPaint(Color.BLUE);
		}
		g2.fill(new Rectangle2D.Double((j+1)*Case_Dim,(i+1)*Case_Dim, Case_Dim,Case_Dim));
		isWhite=!isWhite;
		}
		isWhite=!isWhite;
		}
		g2.dispose();
		
	    }
	
}
