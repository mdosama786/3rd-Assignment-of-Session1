
public class Printtheswappedvalues {

	// Main Method
	public static void main(String[] args) {

		// Declaration and Assigning Values
		int a = 10;
		int b = 20;

		// print the output
		System.out.println("Before Swapping:\na=" + a + "\nb=" + b);

		// Swapping
		a = a + b;
		b = a - b;
		a = a - b;

		// print the output
		System.out.println("After Swapping:\na=" + a + "\nb=" + b);
	}
}