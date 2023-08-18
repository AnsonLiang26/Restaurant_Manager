import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.text.NumberFormatter;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class order3 {

	// declaration section
	private JFrame wendy;
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

	public order3() {
	}

	public void initialize() {

		// name
		wendy = new JFrame();
		wendy.setTitle("Wendy's");
		wendy.setVisible(true);
		wendy.setBounds(0, 0, 1368, 689);
		wendy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wendy.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 48, 425, 294);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		wendy.getContentPane().add(panel);
		panel.setLayout(null);

		// food items
		JLabel foodOne = new JLabel("Chicken Sandwich");
		foodOne.setFont(new Font("Tahoma", Font.PLAIN, 23));
		foodOne.setBounds(11, 10, 219, 46);
		panel.add(foodOne);

		JLabel foodTwo = new JLabel("Baconator");
		foodTwo.setFont(new Font("Tahoma", Font.PLAIN, 23));
		foodTwo.setBounds(10, 82, 219, 46);
		panel.add(foodTwo);

		JLabel foodThree = new JLabel("Hamburger");
		foodThree.setFont(new Font("Tahoma", Font.PLAIN, 23));
		foodThree.setBounds(10, 146, 219, 46);
		panel.add(foodThree);

		// food entries
		textField = new JFormattedTextField();

		// error catch
		NumberFormat format = NumberFormat.getInstance();
		NumberFormatter formatter = new NumberFormatter(format);
		formatter.setValueClass(Integer.class);
		formatter.setMinimum(0);
		formatter.setMaximum(Integer.MAX_VALUE);
		formatter.setAllowsInvalid(false);
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
		formatter_2.setCommitsOnValidEdit(true);
		foodThreeLabel = new JFormattedTextField(formatter_2);
		foodThreeLabel.setColumns(10);
		foodThreeLabel.setBounds(223, 167, 192, 25);
		panel.add(foodThreeLabel);

		//menu
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(445, 48, 338, 294);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		wendy.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblChickenSandwich = new JLabel("Chicken Sandwich $4.69");
		lblChickenSandwich.setBounds(10, 10, 318, 46);
		lblChickenSandwich.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(lblChickenSandwich);

		JLabel lblBaconator = new JLabel("Baconator $6.09");
		lblBaconator.setBounds(10, 51, 318, 46);
		lblBaconator.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(lblBaconator);

		JLabel lblHamburger = new JLabel("Hamburger $3.39");
		lblHamburger.setBounds(10, 94, 318, 46);
		lblHamburger.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(lblHamburger);

		JLabel lblSmallDrink = new JLabel("Small Drink $0.99");
		lblSmallDrink.setBounds(10, 135, 318, 46);
		lblSmallDrink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(lblSmallDrink);

		JLabel lblMediumDrink = new JLabel("Medium Drink $1.49");
		lblMediumDrink.setBounds(10, 175, 318, 46);
		lblMediumDrink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(lblMediumDrink);

		JLabel lblLargeDrink = new JLabel("Large Drink $1.79");
		lblLargeDrink.setBounds(10, 211, 318, 46);
		lblLargeDrink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(lblLargeDrink);

		// price panel
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(445, 347, 338, 295);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		wendy.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		// cost
		JLabel cost = new JLabel("Cost");
		cost.setFont(new Font("Tahoma", Font.PLAIN, 30));
		cost.setBounds(10, 10, 73, 60);
		panel_3.add(cost);

		// tax
		JLabel tax = new JLabel("Tax");
		tax.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tax.setBounds(10, 93, 73, 60);
		panel_3.add(tax);
		JLabel total = new JLabel("");
		total.setFont(new Font("Tahoma", Font.PLAIN, 30));
		total.setBounds(10, 169, 73, 60);
		panel_3.add(total);

		// cost entry
		JLabel costLabel = new JLabel("");
		costLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		costLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		costLabel.setBounds(95, 26, 233, 29);
		costLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(costLabel);

		// tax entry
		JLabel taxLabel = new JLabel("");
		taxLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		taxLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		taxLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		taxLabel.setBounds(95, 108, 233, 29);
		panel_3.add(taxLabel);

		// total
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
		wendy.getContentPane().add(panel_4);
		panel_4.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 531, 574);
		panel_4.add(tabbedPane);

		// receipt
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

		// buttons
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

		// equals button
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
		wendy.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));

		// drink items
		JLabel drinkOne = new JLabel("Small Drink");
		drinkOne.setFont(new Font("Tahoma", Font.PLAIN, 30));
		drinkOne.setBounds(11, 10, 219, 46);
		panel_5.add(drinkOne);

		JLabel drinkTwo = new JLabel("Medium Drink");
		drinkTwo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		drinkTwo.setBounds(10, 82, 219, 46);
		panel_5.add(drinkTwo);

		JLabel drinkThree = new JLabel("Large Drink");
		drinkThree.setFont(new Font("Tahoma", Font.PLAIN, 30));
		drinkThree.setBounds(10, 146, 219, 46);
		panel_5.add(drinkThree);

		NumberFormat format_3 = NumberFormat.getInstance();
		NumberFormatter formatter_3 = new NumberFormatter(format_3);
		formatter_3.setValueClass(Integer.class);
		formatter_3.setMinimum(0);
		formatter_3.setMaximum(Integer.MAX_VALUE);
		formatter_3.setAllowsInvalid(false);
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
		formatter_1.setCommitsOnValidEdit(true);
		drinkThreeLabel = new JFormattedTextField(formatter_5);
		drinkThreeLabel.setColumns(10);
		drinkThreeLabel.setBounds(223, 167, 192, 25);
		panel_5.add(drinkThreeLabel);

		// back button
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wendy.dispose();
			}
		});
		back.setBounds(1241, 0, 113, 38);
		wendy.getContentPane().add(back);

		// print receipt
		JButton receiptPrint = new JButton("Print Receipt");
		receiptPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		receiptPrint.setBounds(1130, 0, 113, 38);
		wendy.getContentPane().add(receiptPrint);

		// total
		JButton totalCalculate = new JButton("Total");
		totalCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (foodOneLabel.getText().equals("") || foodTwoLabel.getText().equals("")
						|| foodThreeLabel.getText().equals("") || drinkOneLabel.getText().equals("")
						|| drinkTwoLabel.getText().equals("") || drinkThreeLabel.getText().equals(""))
					return;

				// prices
				double itemOne = Double.parseDouble(foodOneLabel.getText());
				double priceOne = 4.69;
				double mealOne;
				mealOne = (itemOne * priceOne);
				String pMeal = String.format("%.2f", mealOne);
				costLabel.setText(pMeal);

				double itemTwo = Double.parseDouble(foodTwoLabel.getText());
				double priceTwo = 6.09;
				double mealTwo;
				mealTwo = (itemTwo * priceTwo);
				String fbMeal = String.format("%.2f", mealTwo + mealOne);
				costLabel.setText(fbMeal);

				double itemThree = Double.parseDouble(foodThreeLabel.getText());
				double priceThree = 3.39;
				double mealThree;
				mealThree = (itemThree * priceThree);
				String cbMeal = String.format("%.2f", mealThree + mealOne + mealTwo);
				costLabel.setText(cbMeal);

				double SmallDrink = Double.parseDouble(drinkOneLabel.getText());
				double iSmallDrink = 0.99;
				double DrinkOne;
				DrinkOne = (SmallDrink * iSmallDrink);
				String sdMeal = String.format("%.2f", DrinkOne + mealThree + mealOne + mealTwo);
				costLabel.setText(sdMeal);

				double MedDrink = Double.parseDouble(drinkTwoLabel.getText());
				double iMedDrink = 1.49;
				double DrinkTwo;
				DrinkTwo = (MedDrink * iMedDrink);
				String mdMeal = String.format("%.2f", DrinkTwo + DrinkOne + mealThree + mealOne + mealTwo);
				costLabel.setText(mdMeal);

				double LargeDrink = Double.parseDouble(drinkThreeLabel.getText());
				double iLargeDrink = 1.79;
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
		wendy.getContentPane().add(totalCalculate);

		// receipt
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

				// printing receipt
				receipt.append("\nChicken Sandwich:\t\t" + Qty1 + "\nBaconator:\t\t" + Qty2 + "\nHamburger:\t\t" + Qty3
						+ "\nSmall Drink:\t\t" + Qty4 + "\nMedium Drink:\t\t" + Qty5 + "\nLarge Drink:\t\t" + Qty6
						+ "\n\nThanks for ordering!");
				
				// adding to history
				restaurant.addOrderToHistory("\nChicken Sandwich:\t\t" + Qty1 + "\nBaconator:\t\t" + Qty2 + "\nHamburger:\t\t" + Qty3
						+ "\nSmall Drink:\t\t" + Qty4 + "\nMedium Drink:\t\t" + Qty5 + "\nLarge Drink:\t\t" + Qty6
						+ "\n\nThanks for ordering!");

			}
		});

		receiptCalculate.setBounds(908, 0, 113, 38);
		wendy.getContentPane().add(receiptCalculate);
	}
	
	// printing receipt
	private void printReceipt(JPanel panel) {
		PrinterJob printerJob = PrinterJob.getPrinterJob();
		printerJob.setJobName("Print Receipt");
		printerJob.setPrintable(new Printable() {
			public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
				if (pageIndex > 0) {
					return Printable.NO_SUCH_PAGE;
				}
				Graphics2D graphics2D = (Graphics2D) graphics;
				graphics2D.translate(pageFormat.getImageableX() * 2, pageFormat.getImageableY() * 2);
				graphics2D.scale(0.5, 0.5);
				;
				panel.paint(graphics2D);
				return Printable.PAGE_EXISTS;

			}
		});

		// error
		boolean result = printerJob.printDialog();
		if (result) {
			try {
				printerJob.print();
			} catch (PrinterException printerException) {
				JOptionPane.showMessageDialog(null, "Could not print", "Error", JOptionPane.INFORMATION_MESSAGE);
			}
		}

	}

}