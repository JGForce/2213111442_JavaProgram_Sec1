import javax.swing.*;
public class Shop100Baht {

	public static void main(String[] args) {
		Product sold = new Product();
		
		int choice = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?");
		if(choice == 0) {
			sold = new PattanakarnBranch();
		}
			
		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		
		JOptionPane.showMessageDialog(null, sold);
		
	}

}
