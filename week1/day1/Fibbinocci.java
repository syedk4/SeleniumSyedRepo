package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fNum = 0, secNum = 1, sum = 0;
		// Declaring 3 variables

		System.out.print(fNum + " " + secNum);
		// Printing first two series of fibbinocci which 0 1

		for (int i = 2; i < 11; i++) {
			// Creating for loop to iterate
			sum = fNum + secNum;
			// Adding first and second number and saving it in sum variable
			System.out.print(" " + sum);
			// Printing total of sum now now sum variable will have total of fNum and secNum
			fNum = secNum;
			// declaring secNum value to fNum now fNum will be 1
			secNum = sum;
			// declaring sum value to secNum now secNum will have 1

		}

	}

}
