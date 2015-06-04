

import java.awt.BorderLayout;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class BasicApplet extends JApplet{		
	
		private static final long serialVersionUID = 1L;

		public void init(){
			JPanel panel = new JPanel(new BorderLayout());
			panel.setOpaque(true);
			JLabel label = new JLabel("Test Label");
			setContentPane(panel);
			setSize(600,400);
	}
}