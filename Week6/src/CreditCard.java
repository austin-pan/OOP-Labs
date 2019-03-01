import java.util.Calendar;

public class CreditCard {
	private int expiryMonth, expiryYear;
	private String firstName, lastName;
	private String ccNumber;
	
	public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber) {
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ccNumber= ccNumber;
	}
	
	public String formatExpiryDate() {
		int formattedYear = expiryYear - ((expiryYear / 100) * 100);
		return "" + expiryMonth + "/" + formattedYear;
	}
	
	public String formatFullName() {
		return firstName + " " + lastName;
	}
	
	public String formatCCNumber() {
		String formattedNum = "";
		for(int i = 0; i < ccNumber.length(); i++) {
			if(i > 0  &&  i % 4 == 0)
				formattedNum += " ";
			formattedNum += ccNumber.charAt(i);
		}
		return formattedNum;
	}
	
	public boolean isValid() {
		Calendar currDate = Calendar.getInstance();
		return expiryYear > currDate.get(Calendar.YEAR)  ||  (expiryYear == currDate.get(Calendar.YEAR)  &&  (expiryMonth - 1) > currDate.get(Calendar.MONTH));
	}
	
	public String toString() {
		String info = "Number: " + this.formatCCNumber() + "\nExpiration date: " + this.formatExpiryDate() + "\nAccount holder: " + this.formatFullName() + "\nIs valid: " + this.isValid();
		return info;
	}
}
