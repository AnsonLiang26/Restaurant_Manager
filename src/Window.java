import java.awt.CardLayout;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {

	private static int width = 450;
	private static int height = 300;
	private static JFrame frame;
	private static JPanel container = new JPanel();
	private static CardLayout cd = new CardLayout();
	private static login login = new login();
	private static register register = new register();
	private static restaurant restaurant = null;
	private static Search search = new Search();
	private static settings settings = new settings();
	private static accountSettings accountSettings  = new accountSettings();
	private static history history  = null;

	
	private static String currentUser = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(!Util.fileExists("loginCreds.txt"))
				Util.createTextFile("loginCreds.txt");
		
		
		container.setLayout(cd);
		container.setPreferredSize(new Dimension(width, height));
		container.setMaximumSize(new Dimension(width, height));
		container.setMinimumSize(new Dimension(width, height));
	
		cd.show(container, "login");
		
		container.add(login.getJPanel(), "login");
		container.add(register.getJPanel(), "register");
		//container.add(restaurant.getPanel(), "restaurant");
		container.add(search.getPanel(), "search");
		container.add(settings.getPanel(), "settings");
		container.add(accountSettings.getPanel(), "accountSettings");
		//container.add(history.getPanel(), "history");
		
		
		createDisplay();
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    		PrintWriter pw = null;
					try {
						pw = new PrintWriter(Window.getCurrentUsername() + "history.txt");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    		pw.close();
		    		
			        
		    	if(restaurant != null) {
		        	String[] entries = restaurant.getLinkedList().getAllPanels();
		        	for(int i=0 ; i < entries.length; i++) {
		        		Util.writeToFile(Window.getCurrentUsername() +"history.txt", entries[i]);
		        	}
		        }
		        
		       
		        
		    }
		});
	}
	
	private static void createDisplay(){
		frame = new JFrame("Restaurant");
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		frame.add(container);
		frame.pack();
	}
	
	
	
	public static void changePanel(String nameOfClassYouWantToSwitchTo) {
		if(nameOfClassYouWantToSwitchTo.equals("search")) {
			container.remove(search.getPanel());
			container.add(search.getPanel(), "search");
		}
		
		if(nameOfClassYouWantToSwitchTo.equals("restaurant")) {
			container.remove(restaurant.getPanel());
			restaurant.initialize();
			container.add(restaurant.getPanel(), "restaurant");
			
		}
		
		if(nameOfClassYouWantToSwitchTo.equals("history")) {
			container.remove(history.getPanel());
			history.initialize();
			container.add(history.getPanel(), "history");
		}
			
		cd.show(container, nameOfClassYouWantToSwitchTo);
		
	}
	
	public static boolean createRestaurant() {
		if(restaurant == null) {
			restaurant = new restaurant();
			container.add(restaurant.getPanel(), "restaurant");
			cd.show(container, "restaurant");
			return true;
		}
		return false;
	}
	
	public static void createHistory() {
		history = new history();
		
	}
	
	public static String getCurrentUsername() {
		return currentUser;
	}
	public static void setCurrentUsername(String username) {	
		currentUser = username;
		System.out.println(username);

	}

	public static void closeRestaurant() {
		// TODO Auto-generated method stub
		restaurant = null;
		history = null;
	}
	
}
