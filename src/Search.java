import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search {

	private JPanel panel;
	private JButton[] userChoices = {new JButton("McDonalds"), new JButton("Subway"), new JButton("Wendy's"), new JButton("Burger King"), new JButton("Congee Queen"), new JButton("Tim Hortons"), new JButton("Starbucks"), new JButton("Taco Bell"), new JButton("Pizza Pizza")};
	private String keyword = "";
	private JTextField searchBar = new JTextField(10);
	private JButton btnNewButton_6 = new JButton("Search");
	private JButton btnNewButton_7 = new JButton("Back");
	private JPanel subPanel = new JPanel();
	
	/**
	 * Create the application.
	 */
	public Search() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		panel = new JPanel();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gridBagLayout);
		
		JLabel label = new JLabel("Search");
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.gridx = 0;
		gbc.gridy = 0;
	
		panel.add(label,gbc);
		gbc.gridx = 1;
		panel.add(searchBar,gbc);
		gbc.gridx = 2;
		panel.add(btnNewButton_6,gbc);
		gbc.gridx = 3;
		panel.add(btnNewButton_7,gbc);
		gbc.gridy++;
		int numberOfButtons =0;
		for(int i =0; i < userChoices.length; i++) {
			if(userChoices[i].getText().toLowerCase().contains(keyword) || keyword.equals("")) {
			
			if(i%3 == 0) {
				gbc.gridy++;
				gbc.gridx = 0;
			}
			panel.add(userChoices[i],gbc);
			gbc.gridx++;
			}
		}
		initButtonEvents();
	}

	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}
	
	private void initButtonEvents() {
		
		//Restaurants 1 - 6
		
		userChoices[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Util.writeToFile(Window.getCurrentUsername() +".txt", "0");
			}
		});
		userChoices[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Util.writeToFile(Window.getCurrentUsername() +".txt", "1");
			}
		});
		
		userChoices[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Util.writeToFile(Window.getCurrentUsername() +".txt", "2");
			}
		});
		userChoices[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Util.writeToFile(Window.getCurrentUsername() +".txt", "3");
			}
		});
		userChoices[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Util.writeToFile(Window.getCurrentUsername() +".txt", "4");
			}
		});
		userChoices[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Util.writeToFile(Window.getCurrentUsername() +".txt", "5");
			}
		});
		userChoices[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Util.writeToFile(Window.getCurrentUsername() +".txt", "6");
			}
		});
		userChoices[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Util.writeToFile(Window.getCurrentUsername() +".txt", "7");
			}
		});
		userChoices[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Util.writeToFile(Window.getCurrentUsername() +".txt", "8");
			}
		});
		
		
		//Search button
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			keyword = searchBar.getText().toLowerCase();
			initialize();
			Window.changePanel("search");
			
			}
		});
		
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Window.changePanel("restaurant");
			}
		});
	}

}
