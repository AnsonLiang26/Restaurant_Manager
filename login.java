import java.awt.event.*;
import javax.swing.*;

public class login {

	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JButton registerButton;
	private JPanel panel;
	public login() {

		
		
		panel = new JPanel();
		

		panel.setLayout(null);

		userLabel = new JLabel("Username: ");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);

		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);

		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);

		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);

		button = new JButton("Login");
		button.setBounds(10, 88, 80, 25);;
		panel.add(button);

		registerButton = new JButton("Register");
		registerButton.setBounds(100, 88, 100, 25);
		panel.add(registerButton);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		initButtonEvents();
		
	
	}
	
	private void initButtonEvents() {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] creds = Util.readATextFile("loginCreds.txt");
				
				for(int i=0; i < creds.length; i+= 4) {
					if(creds[i].equals(userText.getText()) && creds[i+1].equals(passwordText.getText())) {
						Window.setCurrentUsername(userText.getText());
						Window.createRestaurant();
					}	
				}
				
			}
		});
		
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Window.changePanel("register");
			}
		});
	}

	public JPanel getJPanel() {
		return panel;
	}

}
