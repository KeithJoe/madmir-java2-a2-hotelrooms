import javax.swing.JOptionPane;

public class HotelBilling {
	//Declared a constant
	final static float SALES_TAX = 0.13f;

	//Decl;ared variables
	public static void main(String[] args) {
		double roomPrice = 99.00;
		double coupon = 0.10;
		int roomBooked = 5;
		double totalBill;
		
	///Shows output message
		totalBill = computeBill(roomPrice);
		JOptionPane.showMessageDialog(null, "The total with tax for one of your rooms is " + totalBill);

		totalBill = computeBill(roomPrice, coupon);
		JOptionPane.showMessageDialog(null, "The total with tax for one room is $  " + totalBill + 
				 "\nthis includes a dicount of " + coupon*100 + "%");

		totalBill = computeBill(roomPrice, coupon, roomBooked);
		JOptionPane.showMessageDialog(null, "The total with tax for " + roomBooked  + " room(s) is $ " + totalBill + 
				 "\nthis includes a dicount of " + coupon*100 + "%");

	}
	
	//Output the details of computeBill
	public static double computeBill(double rate) {
		double tax = rate * SALES_TAX;
		double finalRate = rate + tax;
		finalRate = twoDecimalRounding(finalRate);
		return finalRate;
	}
	
	//Outputs the details of computeBill with coupon
	public static double computeBill(double rate, double coupon) {
		double tax = rate * SALES_TAX;
		double finalRate = rate + tax;
		finalRate = finalRate * (1 - coupon);
		finalRate = twoDecimalRounding(finalRate);
		return finalRate;
	}
	
	//Output the details of computeBill with coupon and number of rooms booked
	public static double computeBill(double rate, double coupon, int roomBooked) {
		double tax = rate * SALES_TAX;
		double finalRate = rate + tax;
		finalRate = finalRate * (1 - coupon) * roomBooked;
		finalRate = twoDecimalRounding(finalRate);
		return finalRate;
	}
	
	//This method receives a double and returns the same double rounded to two decimal points
	public static double twoDecimalRounding(double decimal) {
		decimal = decimal * 100;
		decimal = decimal + 0.5;
		decimal = (int) decimal;
		decimal = decimal/100;
		return decimal;
		
	}
}
