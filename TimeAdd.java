// Java Program to find the
// sum of all duration in
// the form of MM : SS.
import java.io.*;

class TimeAdd {

	// Print sum of two duration.
	static void printSum(int h[], int m[], int s[])
	{
		int total = 0;

		// finding total seconds
		for (int i = 0; i < 2; i++) {
			total += s[i];
			total += (m[i] * 60);
			total += (h[i] * 3600);
			
		}

		// print the hours.
		System.out.print(total / 3600 + " : ");
		total %= 3600;

		// print the minutes.
		System.out.print(total / 60 + ": ");
		total %= 60;

		// print the hours.
		System.out.println(total);
	}

	// Driver code
	public static void main(String[] args)
	{
		int h[] = { 1 , 20 };
		int m[] = {  60 , 60 };
		int s[] = { 1, 1 };
		
		printSum(h, m, s);
	}
}

