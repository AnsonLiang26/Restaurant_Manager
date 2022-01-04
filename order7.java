import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.text.NumberFormatter;

import java.awt.Color;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class order7 {

	private JFrame tim;
	private JTextField textField;
	private JTextField foodTwoLabel;
	private JTextField foodThreeLabel;
	private JTextField drinkOneLabel;
	private JTextField drinkTwoLabel;
	private JTextField drinkThreeLabel;
	private JTextArea receipt;
	private JTextField textField_7;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	private JTextField calculatorScreen;


	public order7() {
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		tim = new JFrame();
		tim.setTitle("Tim Hortons");
		tim.setVisible(true);
		tim.setBounds(0, 0, 1368, 689);
		tim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tim.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 48, 425, 294);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		tim.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel foodOne = new JLabel("Bagel");
		foodOne.setFont(new Font("Tahoma", Font.PLAIN, 25));
		foodOne.setBounds(11, 10, 219, 46);
		panel.add(foodOne);

		JLabel foodTwo = new JLabel("Cubano Sandwich");
		foodTwo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		foodTwo.setBounds(10, 82, 219, 46);
		panel.add(foodTwo);

		JLabel foodThree = new JLabel("Shortbread Cookies");
		foodThree.setFont(new Font("Tahoma", Font.PLAIN, 25));
		foodThree.setBounds(10, 146, 219, 46);
		panel.add(foodThree);

		textField = new JFormattedTextField();
		NumberFormat format = NumberFormat.getInstance();
		NumberFormatter formatter = new NumberFormatter(format);
		formatter.setValueClass(Integer.class);
		formatter.setMinimum(0);
		formatter.setMaximum(Integer.MAX_VALUE);
		formatter.setAllowsInvalid(false);
		// If you want the value to be committed on each keystroke instead of focus lost
		formatter.setCommitsOnValidEdit(true);
		JFormattedTextField foodOneLabel = new JFormattedTextField(formatter);
		foodOneLabel.setBounds(223, 26, 192, 25);
		panel.add(foodOneLabel);
		foodOneLabel.setColumns(10);

		NumberFormat format_1 = NumberFormat.getInstance();
		NumberFormatter formatter_1 = new NumberFormatter(format_1);
		formatter_1.setValueClass(Integer.class);
		formatter_1.setMinimum(0);
		formatter_1.setMaximum(Integer.MAX_VALUE);
		formatter_1.setAllowsInvalid(false);
		// If you want the value to be committed on each keystroke instead of focus lost
		formatter_1.setCommitsOnValidEdit(true);
		foodTwoLabel = new JFormattedTextField(formatter_1);
		foodTwoLabel.setColumns(10);
		foodTwoLabel.setBounds(223, 101, 192, 25);
		panel.add(foodTwoLabel);

		NumberFormat format_2 = NumberFormat.getInstance();
		NumberFormatter formatter_2 = new NumberFormatter(format_2);
		formatter_2.setValueClass(Integer.class);
		formatter_2.setMinimum(0);
		formatter_2.setMaximum(Integer.MAX_VALUE);
		formatter_2.setAllowsInvalid(false);
		// If you want the value to be committed on each keystroke instead of focus lost
		formatter_2.setCommitsOnValidEdit(true);
		foodThreeLabel = new JFormattedTextField(formatter_2);
		foodThreeLabel.setColumns(10);
		foodThreeLabel.setBounds(223, 167, 192, 25);
		panel.add(foodThreeLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(445, 48, 338, 294);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		tim.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(445, 347, 338, 295);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		tim.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JLabel cost = new JLabel("Cost");
		cost.setFont(new Font("Tahoma", Font.PLAIN, 30));
		cost.setBounds(10, 10, 73, 60);
		panel_3.add(cost);

		JLabel tax = new JLabel("Tax");
		tax.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tax.setBounds(10, 93, 73, 60);
		panel_3.add(tax);

		JLabel total = new JLabel("");
		total.setFont(new Font("Tahoma", Font.PLAIN, 30));
		total.setBounds(10, 169, 73, 60);
		panel_3.add(total);

		JLabel costLabel = new JLabel("");
		costLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		costLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		costLabel.setBounds(95, 26, 233, 29);
		costLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(costLabel);

		JLabel taxLabel = new JLabel("");
		taxLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		taxLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		taxLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		taxLabel.setBounds(95, 108, 233, 29);
		panel_3.add(taxLabel);

		JLabel lblNewLabel_1_1_2 = new JLabel("Total");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1_1_2.setBounds(10, 169, 73, 60);
		panel_3.add(lblNewLabel_1_1_2);

		JLabel totalLabel = new JLabel("");
		totalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		totalLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		totalLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		totalLabel.setBounds(93, 187, 235, 29);
		panel_3.add(totalLabel);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(793, 48, 551, 594);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		tim.getContentPane().add(panel_4);
		panel_4.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 531, 574);
		panel_4.add(tabbedPane);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_2, null);
		panel_2.setLayout(null);

		receipt = new JTextArea();
		receipt.setEditable(false);
		receipt.setBounds(10, 0, 516, 537);
		panel_2.add(receipt);
		receipt.setColumns(10);

		// calculator
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_6, null);
		panel_6.setLayout(null);

		calculatorScreen = new JTextField();
		calculatorScreen.setBounds(80, 10, 408, 35);
		panel_6.add(calculatorScreen);
		calculatorScreen.setColumns(10);

		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = calculatorScreen.getText() + seven.getText();
				calculatorScreen.setText(EnterNumber);

			}
		});
		seven.setBounds(80, 65, 100, 35);
		panel_6.add(seven);

		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = calculatorScreen.getText() + eight.getText();
				calculatorScreen.setText(EnterNumber);

			}
		});
		eight.setBounds(176, 65, 119, 35);
		panel_6.add(eight);

		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = calculatorScreen.getText() + nine.getText();
				calculatorScreen.setText(EnterNumber);

			}
		});
		nine.setBounds(293, 65, 100, 35);
		panel_6.add(nine);

		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = calculatorScreen.getText() + four.getText();
				calculatorScreen.setText(EnterNumber);

			}
		});
		four.setBounds(80, 98, 100, 35);
		panel_6.add(four);

		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = calculatorScreen.getText() + five.getText();
				calculatorScreen.setText(EnterNumber);

			}
		});
		five.setBounds(176, 98, 119, 35);
		panel_6.add(five);

		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = calculatorScreen.getText() + six.getText();
				calculatorScreen.setText(EnterNumber);

			}
		});
		six.setBounds(293, 98, 100, 35);
		panel_6.add(six);

		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = calculatorScreen.getText() + one.getText();
				calculatorScreen.setText(EnterNumber);

			}
		});
		one.setBounds(80, 131, 100, 35);
		panel_6.add(one);

		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = calculatorScreen.getText() + two.getText();
				calculatorScreen.setText(EnterNumber);

			}
		});
		two.setBounds(176, 131, 119, 35);
		panel_6.add(two);

		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = calculatorScreen.getText() + three.getText();
				calculatorScreen.setText(EnterNumber);
			}
		});
		three.setBounds(293, 131, 100, 35);
		panel_6.add(three);

		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = calculatorScreen.getText() + zero.getText();
				calculatorScreen.setText(EnterNumber);

			}
		});

		zero.setBounds(80, 164, 100, 35);
		panel_6.add(zero);

		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(calculatorScreen.getText());
				calculatorScreen.setText("");
				operations = "+";
			}
		});
		plus.setBounds(403, 65, 85, 35);
		panel_6.add(plus);

		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(calculatorScreen.getText());
				calculatorScreen.setText("");
				operations = "-";
			}
		});
		minus.setBounds(403, 98, 85, 35);
		panel_6.add(minus);

		// eyes here
		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(calculatorScreen.getText());
				calculatorScreen.setText("");
				operations = "*";
			}
		});
		multiply.setBounds(403, 131, 85, 35);
		panel_6.add(multiply);

		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = calculatorScreen.getText() + dot.getText();
				calculatorScreen.setText(EnterNumber);
			}
		});
		dot.setBounds(176, 164, 119, 35);
		panel_6.add(dot);

		JButton equals = new JButton("=");
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(calculatorScreen.getText());
				if (operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					calculatorScreen.setText(answer);
				}
				if (operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					calculatorScreen.setText(answer);
				}
				if (operations == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					calculatorScreen.setText(answer);
				}
			}
		});
		equals.setBounds(403, 164, 85, 35);
		panel_6.add(equals);

		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorScreen.setText(null);
			}
		});
		clear.setBounds(293, 164, 100, 35);
		panel_6.add(clear);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 347, 425, 294);
		tim.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));

		JLabel drinkOne = new JLabel("Tall Coffee");
		drinkOne.setFont(new Font("Tahoma", Font.PLAIN, 30));
		drinkOne.setBounds(11, 10, 219, 46);
		panel_5.add(drinkOne);

		JLabel drinkTwo = new JLabel("Grande Coffee");
		drinkTwo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		drinkTwo.setBounds(10, 82, 219, 46);
		panel_5.add(drinkTwo);

		JLabel drinkThree = new JLabel("Venti Coffee");
		drinkThree.setFont(new Font("Tahoma", Font.PLAIN, 30));
		drinkThree.setBounds(10, 146, 219, 46);
		panel_5.add(drinkThree);

		NumberFormat format_3 = NumberFormat.getInstance();
		NumberFormatter formatter_3 = new NumberFormatter(format_3);
		formatter_3.setValueClass(Integer.class);
		formatter_3.setMinimum(0);
		formatter_3.setMaximum(Integer.MAX_VALUE);
		formatter_3.setAllowsInvalid(false);
		// If you want the value to be committed on each keystroke instead of focus lost
		formatter_3.setCommitsOnValidEdit(true);
		drinkOneLabel = new JFormattedTextField(formatter_3);
		drinkOneLabel.setColumns(10);
		drinkOneLabel.setBounds(223, 26, 192, 25);
		panel_5.add(drinkOneLabel);

		NumberFormat format_4 = NumberFormat.getInstance();
		NumberFormatter formatter_4 = new NumberFormatter(format_4);
		formatter_4.setValueClass(Integer.class);
		formatter_4.setMinimum(0);
		formatter_4.setMaximum(Integer.MAX_VALUE);
		formatter_4.setAllowsInvalid(false);
		// If you want the value to be committed on each keystroke instead of focus lost
		formatter_4.setCommitsOnValidEdit(true);
		drinkTwoLabel = new JFormattedTextField(formatter_4);
		drinkTwoLabel.setColumns(10);
		drinkTwoLabel.setBounds(223, 101, 192, 25);
		panel_5.add(drinkTwoLabel);

		NumberFormat format_5 = NumberFormat.getInstance();
		NumberFormatter formatter_5 = new NumberFormatter(format_5);
		formatter_5.setValueClass(Integer.class);
		formatter_5.setMinimum(0);
		formatter_5.setMaximum(Integer.MAX_VALUE);
		formatter_5.setAllowsInvalid(false);
		// If you want the value to be committed on each keystroke instead of focus lost
		formatter_1.setCommitsOnValidEdit(true);
		drinkThreeLabel = new JFormattedTextField(formatter_5);
		drinkThreeLabel.setColumns(10);
		drinkThreeLabel.setBounds(223, 167, 192, 25);
		panel_5.add(drinkThreeLabel);

		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tim.dispose();
			}
		});
		back.setBounds(1241, 0, 113, 38);
		tim.getContentPane().add(back);

		JButton receiptPrint = new JButton("Print Receipt");
		receiptPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		receiptPrint.setBounds(1130, 0, 113, 38);
		tim.getContentPane().add(receiptPrint);

		JButton totalCalculate = new JButton("Total");
		totalCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (foodOneLabel.getText().equals("") || foodTwoLabel.getText().equals("")
						|| foodThreeLabel.getText().equals("") || drinkOneLabel.getText().equals("")
						|| drinkTwoLabel.getText().equals("") || drinkThreeLabel.getText().equals(""))
					return;

				double itemOne = Double.parseDouble(foodOneLabel.getText());
				double priceOne = 1.39;
				double mealOne;
				mealOne = (itemOne * priceOne);
				String pMeal = String.format("%.2f", mealOne);
				costLabel.setText(pMeal);

				double itemTwo = Double.parseDouble(foodTwoLabel.getText());
				double priceTwo = 5.99;
				double mealTwo;
				mealTwo = (itemTwo * priceTwo);
				String fbMeal = String.format("%.2f", mealTwo + mealOne);
				costLabel.setText(fbMeal);

				double itemThree = Double.parseDouble(foodThreeLabel.getText());
				double priceThree = 0.99;
				double mealThree;
				mealThree = (itemThree * priceThree);
				String cbMeal = String.format("%.2f", mealThree + mealOne + mealTwo);
				costLabel.setText(cbMeal);

				double SmallDrink = Double.parseDouble(drinkOneLabel.getText());
				double iSmallDrink = 1.85;
				double DrinkOne;
				DrinkOne = (SmallDrink * iSmallDrink);
				String sdMeal = String.format("%.2f", DrinkOne + mealThree + mealOne + mealTwo);
				costLabel.setText(sdMeal);

				double MedDrink = Double.parseDouble(drinkTwoLabel.getText());
				double iMedDrink = 2.10;
				double DrinkTwo;
				DrinkTwo = (MedDrink * iMedDrink);
				String mdMeal = String.format("%.2f", DrinkTwo + DrinkOne + mealThree + mealOne + mealTwo);
				costLabel.setText(mdMeal);

				double LargeDrink = Double.parseDouble(drinkThreeLabel.getText());
				double iLargeDrink = 2.45;
				double DrinkThree;
				DrinkThree = (LargeDrink * iLargeDrink);
				String ldMeal = String.format("%.2f",
						DrinkThree + DrinkTwo + DrinkOne + mealThree + mealOne + mealTwo);
				costLabel.setText(ldMeal);

				double cTotal = Double.parseDouble(costLabel.getText());
				double allTotal = cTotal * 0.13;
				String iTotal = String.format("%.2f", allTotal);
				taxLabel.setText(iTotal);

				allTotal = allTotal + cTotal;
				String aTotal = String.format("%.2f", allTotal);
				totalLabel.setText(aTotal);

			}
		});
		totalCalculate.setBounds(1018, 0, 113, 38);
		tim.getContentPane().add(totalCalculate);

		JButton receiptCalculate = new JButton("Receipt");
		receiptCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (foodOneLabel.getText().equals("") || foodTwoLabel.getText().equals("")
						|| foodThreeLabel.getText().equals("") || drinkOneLabel.getText().equals("")
						|| drinkTwoLabel.getText().equals("") || drinkThreeLabel.getText().equals(""))
					return;
				double Qty1 = Double.parseDouble(foodOneLabel.getText());
				double Qty2 = Double.parseDouble(foodTwoLabel.getText());
				double Qty3 = Double.parseDouble(foodThreeLabel.getText());
				double Qty4 = Double.parseDouble(drinkOneLabel.getText());
				double Qty5 = Double.parseDouble(drinkTwoLabel.getText());
				double Qty6 = Double.parseDouble(drinkThreeLabel.getText());

				receipt.append("\nBagel:\t\t" + Qty1 + "\nCubano Sandwich:\t" + Qty2 + "\nShortbread Cookies:\t\t" + Qty3
						+ "\nTall Coffee:\t\t" + Qty4 + "\nGrande Coffee:\t\t" + Qty5 + "\nVenti Coffee:\t\t" + Qty6
						+ "\n\nThanks for ordering!");
				
				restaurant.addOrderToHistory(("\nBagel:\t\t" + Qty1 + "\nCubano Sandwich:\t" + Qty2 + "\nShortbread Cookies:\t\t" + Qty3
						+ "\nTall Coffee:\t\t" + Qty4 + "\nGrande Coffee:\t\t" + Qty5 + "\nVenti Coffee:\t\t" + Qty6
						+ "\n\nThanks for ordering!"));

			}
		});

		receiptCalculate.setBounds(908, 0, 113, 38);
		tim.getContentPane().add(receiptCalculate);
	}
}