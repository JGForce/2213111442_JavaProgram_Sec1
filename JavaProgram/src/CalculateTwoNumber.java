import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Num1 = new JLabel("Enter Number1");
		Num1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Num1.setBounds(54, 6, 153, 55);
		contentPane.add(Num1);
		
		JLabel Num2 = new JLabel("Enter Number2");
		Num2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Num2.setBounds(54, 72, 135, 48);
		contentPane.add(Num2);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(186, 21, 192, 29);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		txtNumber2 = new JTextField();
		txtNumber2.setColumns(10);
		txtNumber2.setBounds(186, 84, 192, 29);
		contentPane.add(txtNumber2);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResult.setBounds(191, 317, 120, 29);
		contentPane.add(lblResult);
		
		JLabel Operator = new JLabel("Operator");
		Operator.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Operator.setBounds(54, 146, 112, 19);
		contentPane.add(Operator);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(186, 143, 112, 29);
		comboBox.addItem("+");
		comboBox.addItem("-");
		comboBox.addItem("*");
		comboBox.addItem("/");
		contentPane.add(comboBox);
	
		
		JRadioButton oneDigit = new JRadioButton("1 digit");
		oneDigit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		oneDigit.setBounds(215, 209, 109, 23);
		contentPane.add(oneDigit);
		
		JRadioButton twoDigit = new JRadioButton("2 digit");
		twoDigit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		twoDigit.setBounds(215, 239, 109, 23);
		contentPane.add(twoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);

		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					//sum = num1+num2;
					operator = (String)comboBox.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1*num2;
					if(operator.equals("/"))
						sum = num1/num2;
					
					DecimalFormat frmNumber = null;
					//JRadioButton
					if(oneDigit.isSelected())
						frmNumber = new DecimalFormat("#,###.0");
					else if(twoDigit.isSelected())
						frmNumber = new DecimalFormat("#,###.00");
					
					
					lblResult.setText(frmNumber.format(sum));
				}
			}
		});
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOK.setBounds(87, 357, 120, 35);
		contentPane.add(btnOK);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExit.setBounds(230, 357, 120, 35);
		contentPane.add(btnExit);
		
		JLabel Digit = new JLabel("How to show digit");
		Digit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Digit.setBounds(54, 201, 135, 35);
		contentPane.add(Digit);
		
	}
}
