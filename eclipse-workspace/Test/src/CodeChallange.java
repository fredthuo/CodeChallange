import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CodeChallange {

 
	public void ProblemOne(Scanner sc) {
		int x, y; //Initialize variables
        int sum;
        System.out.println("Enter firs integer");
        x = sc.nextInt(); // Get Integer from user
        System.out.println("Enter second integer");
        y = sc.nextInt(); // Get Second Integer from User 
        sum = x + y; // Get the sum
        System.out.println("The sum is: " + sum); // Print the Sum
	} 
	
	public void ProblemTwo(Scanner sc) {
		try {
			System.out.println(System.in.available());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter stair size");
		int size = sc.nextInt();
		for (int i = 1; i<=size; i++)  // Count number of stairs
		{
			for (int j=1; j<=size;j++) // If the number is larger than the number of stairs add
			{
				if((i+j)>size) // If the number is larger than the number of steps already in place it will add another step
				{
				System.out.print("#");
			} 
				else {
				System.out.println(" "); // If the number is less the number of steps it will add a space and then go to a different number
			}
			
		}
			System.out.println();
		}
	}
	
	public void ProblemThree(Scanner sc)  {		
		 //Scanner
		System.out.println("Enter time now");
		String time = sc.next(); //Get time from user
		sc.close(); //Close Scanner
		try {
			String result = timeConversion(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
	}
	

	private static String timeConversion(String time) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm"); // Get the time format 
		SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm"); // Parses the format
		Date date = parseFormat.parse(time); // Gets time from user
		System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date)); // Parses the format and transforms to 24 hrs form
		return time;
	}

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CodeChallange one = new CodeChallange();
		one.ProblemOne(sc);
		one.ProblemTwo(sc);
		one.ProblemThree(sc);
		sc.close();

	}
	

}













