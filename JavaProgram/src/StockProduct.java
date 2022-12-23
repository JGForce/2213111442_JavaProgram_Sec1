import java.util.*;
import java.text.DecimalFormat;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] stockProduct = new Product[4];
		DecimalFormat df = new DecimalFormat("#,###.00");
		for (int i=0;i<stockProduct.length;i++) {
			stockProduct[i] = new Product();
			System.out.print("Input product Id    : ");
			stockProduct[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			stockProduct[i].setUnit(scan.nextInt());
			while(stockProduct[i].getUnit()<0) {
				System.out.print("Input product Unit, again : ");
				stockProduct[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price : ");
			stockProduct[i].setPrice(scan.nextDouble());
			while(stockProduct[i].getPrice()<=0) {
				System.out.print("Input product Price, again : ");
				stockProduct[i].setPrice(scan.nextDouble());
			}
			System.out.println();	
		}	
		System.out.println("------------------------------------------");
		double totalCount = 0 ;
		for (int i=0;i<stockProduct.length; i++) {
			System.out.println("Product ID : " + stockProduct[i].getId() + ", " + "Total price = "
								+ df.format(stockProduct[i].calculate()) + " baht.");
			totalCount += stockProduct[i].calculate();
		}
		System.out.println("------------------------------------------");
		System.out.println("Total price of all products is " + df.format(totalCount) + " baht.");
	}
	
}
