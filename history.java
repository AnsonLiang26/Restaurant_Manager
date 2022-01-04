import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class history {
	private JPanel panel = new JPanel();
	private JButton back = new JButton("Back");
	private JPanel subPanel = new JPanel();

	
	public history() {
		
		initialize();
		initButtonEvents();
	}
	public void initialize() {
		
		restaurant.getLinkedList().printList();
		
		panel.setVisible(true);
		panel.add(back);
		subPanel.setLayout(new GridLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5,5,5,5);
		//Create scroll pane of right section here.
		JScrollPane scroll = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//Increase scroll speed
		// https://alvinalexander.com/blog/post/jfc-swing/how-increase-speed-jscrollpane-mouse-wheel/#:~:text=Just%20use%20the%20reference%20to,setUnitIncrement(16)%3B
		scroll.getVerticalScrollBar(). setUnitIncrement(16);
		String[] currentOrders = restaurant.getLinkedList().getAllPanels();
		
		
		JTextArea[] jta = new JTextArea[5];
		JPanel[] jps = new JPanel[5];
		for(int i =0; i < jps.length; i++) {
			jta[i] = new JTextArea();
			jps[i] = new JPanel();
			jta[i].setText(currentOrders[i]);
			jps[i].add(jta[i]);
			subPanel.add(jps[i], gbc);
			gbc.gridy++;
			
		}
		panel.add(subPanel);
	}
	
	private void initButtonEvents() {
		//setting button
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Window.changePanel("restaurant");
			}
		});
	}
	
	public JPanel getPanel() {
		return panel;
	}
}
