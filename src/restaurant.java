import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class restaurant {

	private static JPanel panel = new JPanel();
	private JButton[] userFavourites = {new JButton("McDonalds"), new JButton("Subway"), new JButton("Wendy's"), new JButton("Burger King"), new JButton("Congee Queen"), new JButton("Tim Hortons"), new JButton("StarBucks"), new JButton("Taco Bell"), new JButton("Pizza Pizza")};
	private JButton btnNewButton_4 = new JButton("Settings");
	private JButton btnNewButton_5 = new JButton("Search");
	private JButton btnNewButton_6 = new JButton("Log out");
	private JButton btnNewButton_7 = new JButton("History");
	private static MyLinkedList list;
	private  order1 order1 = new order1();
	private  order2 order2 = new order2();
	private  order3 order3 = new order3();
	private  order4 order4 = new order4();
	private  order5 order5 = new order5();
	private  order6 order6 = new order6();
	private  order7 order7 = new order7();
	private  order8 order8 = new order8();
	private  order9 order9 = new order9();
	/**
	 * Create the application.
	 */
	public restaurant() {
		list =new MyLinkedList();
		if(Util.fileExists(Window.getCurrentUsername()+"history.txt"))
		if(Util.readATextFile(Window.getCurrentUsername()+"history.txt").length > 0) {
			
			int numberOfOrdersAdded = 0;
			String[] previousOrders = Util.readATextFile(Window.getCurrentUsername() + "history.txt");
			int index = previousOrders.length-1;
			while(index >= 0) {
				if(previousOrders[index].equals("null")) {
					index--;
					continue;
				}
				String str = previousOrders[index-8];
				for(int j=7; j >= 0; j--) {
					str += "\n" + previousOrders[index-j];
				}
				list.add(str);
				index = index - 9;
			}
		}
		
		if(!Util.fileExists(Window.getCurrentUsername() + ".txt")) {
			Util.createTextFile(Window.getCurrentUsername() + ".txt");
			Util.createTextFile(Window.getCurrentUsername() + "history.txt");
		}
		initialize();
		initButtonEvents();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		
		
		panel = new JPanel();
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Restaurant");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 2;
		gbc_btnNewButton_6.gridy = 0;
		panel.add(btnNewButton_6, gbc_btnNewButton_6);
		
		
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 3;
		gbc_btnNewButton_4.gridy = 0;
		panel.add(btnNewButton_4, gbc_btnNewButton_4);
		
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 4;
		gbc_btnNewButton_5.gridy = 0;
		panel.add(btnNewButton_5, gbc_btnNewButton_5);
		
		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_10.gridx = 1;
		gbc_btnNewButton_10.gridy = 0;
		panel.add(btnNewButton_7, gbc_btnNewButton_10);
		
		
		gbc_lblNewLabel.gridy =1;
		JPanel subPan = new JPanel();
		
		if(Util.readATextFile(Window.getCurrentUsername() +".txt").length >0) {
		
			subPan.setLayout(new GridBagLayout());
			String[] pref = Util.readATextFile(Window.getCurrentUsername() + ".txt");
			boolean[] prefs = new boolean[9];
			
			for(int j =0; j < pref.length; j++) {
				for(int i =0; i<9; i++) {
					if(Integer.parseInt(pref[j]) == i)
						prefs[i] = true;
				}
			}
			int numberOfFavourites = 0;
			for(int i =0; i < userFavourites.length; i++) {
				
				if(prefs[i]) {
					subPan.add(userFavourites[i],  gbc_lblNewLabel);
					numberOfFavourites++;
					if(numberOfFavourites % 3 == 0 && i != 0) {
						gbc_lblNewLabel.gridy++;
						gbc_lblNewLabel.gridx = 0;
					}
					else
						gbc_lblNewLabel.gridx++;
				
				}
			}
			
			subPan.setBorder(BorderFactory.createLineBorder(Color.black));
			subPan.setPreferredSize(new Dimension(400, 200));
		}
		else {
			subPan.setLayout(new BorderLayout());
			
			JLabel noFav = new JLabel();
			JLabel noFav2 = new JLabel("<html>You have no favourites.<br/>Use the search to find some restaurants.</html>");
			
			subPan.add(noFav, BorderLayout.CENTER);
			subPan.add(noFav2, BorderLayout.CENTER);
			
			
	
		}
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		gbc_lblNewLabel.gridwidth = 5;
		gbc_lblNewLabel.gridheight = 15;
		
		panel.add(subPan, gbc_lblNewLabel);
		
		
	}
	public static void addOrderToHistory(String str) {
		list.add(str);
		if(list.getNumberOfOrders() > 5)
			list.pop();
	}

	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}
	
	public static MyLinkedList getLinkedList() {
		return list;
	}
	
	private void initButtonEvents() {
		//setting button
		userFavourites[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order1.initialize();
			}
		});
		userFavourites[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order2.initialize();
			}
		});
		userFavourites[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order3.initialize();
			}
		});
		userFavourites[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order4.initialize();
			}
		});
		userFavourites[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order5.initialize();
			}
		});
		userFavourites[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order6.initialize();
			}
		});
		userFavourites[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order7.initialize();
			}
		});
		userFavourites[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order8.initialize();
			}
		});
		userFavourites[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order9.initialize();
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Window.changePanel("settings");
			}
		});
		
		//search button
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Window.changePanel("search");
			}
		});
		btnNewButton_7.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent arg0){
				Window.createHistory();
				Window.changePanel("history");
			}
		});
		//log out button
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Window.closeRestaurant();
				Window.changePanel("login");
			}
		});
		
	}
	
	public static void clearLinkedList() {
		list = new MyLinkedList();
	}

}
