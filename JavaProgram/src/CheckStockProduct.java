import java.util.*;
public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("How many product list in stock : ");
		int size = scan.nextInt();
		
		Product[] stockProduct = new Product[size];
		
		for (int i=0;i<stockProduct.length; i++) {
			stockProduct[i] = new Product();
			System.out.println();
			System.out.print("Input product Id   : ");
			stockProduct[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			stockProduct[i].setUnit(scan.nextInt());
			while(stockProduct[i].getUnit()<0) {
				System.out.print("Input product Unit, again : ");
				stockProduct[i].setUnit(scan.nextInt());
			}
		}
		
		display("LOW", stockProduct);
		display("NORMAL", stockProduct);
		display("HIGH", stockProduct);
	}
	public static void display(String message, Product[] stockProduct) {
		System.out.println("------------------------------------------");
		System.out.println("LIST OF PRODUCT IN '" + message + "' status.");
		System.out.println("------------------------------------------");
		for (Product product : stockProduct) { 
			if (product.checkProduct().equals("LOW") && message.equalsIgnoreCase("LOW")) {
				System.out.println(">> " + product.getId() + " has " + product.getUnit() + " units.");
			} else if (product.checkProduct().equals("NORMAL") && message.equalsIgnoreCase("NORMAL")) {
				System.out.println(">> " + product.getId() + " has " + product.getUnit() + " units.");
			} else if (product.checkProduct().equals("HIGH") && message.equalsIgnoreCase("HIGH")) {
				System.out.println(">> " + product.getId() + " has " + product.getUnit() + " units.");
			}
		}
	}
}
