import javax.swing.*;
import java.text.*;
public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.#");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		double total = weight / Math.pow(height/100,2);
		JOptionPane.showMessageDialog(null, "BMI = "+frm.format(total)+
										"\nYou're "+(total<18.5?"Underweight":total<=24.9?
										"Normal-weight":total<=29.9?"Overweight":"Obesity"),
										"BMI",
										JOptionPane.WARNING_MESSAGE);
	}

}
