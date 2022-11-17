import java.text.*;
import javax.swing.*;
public class MusicWorldApp {

	public static void main(String[] args) {
		String cdId;
		String cdTitle;
		int cdQuantity;
		double cdPrice;
		double cdSubtotal;
		double cdTotal;
		final double TAX_RATE = 6.25;
		cdId = JOptionPane.showInputDialog("This progeam calculates the total cost of a CD order\n Please enter the ID of the CD");
		cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
        cdPrice	= Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
        cdQuantity =Integer.parseInt(JOptionPane.showInputDialog("please enter the quantity to be purchased"));
        cdSubtotal = cdPrice * cdQuantity;
        cdTotal = cdSubtotal * (1 + (TAX_RATE/100));
        JOptionPane.showMessageDialog(null,
        		                      "Summary of the transaction:"
        		                      + "\n\nCD ID: " + cdId + "\nCD Title: "
        		                      + cdTitle + "\nCD Unit Price: $"
        		                      + cdPrice + "\nCD Quanity: " + cdQuantity
        		                      + "\n\nSubtotal: $" + cdSubtotal 
        		                      + "\nTax rate: " + TAX_RATE + "%" + "\nTotal: $"
        		                      + cdTotal + "\n\nEnd of Program");   
	}

}
