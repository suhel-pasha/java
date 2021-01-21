import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		String number = scanner.nextLine();
		while(!number.equals("")) {
			long num = Long.parseLong(number);
			if(prime(num)==0) 
				System.out.println("'"+num+"' is a Prime Number!!!!!!");
			else 
	            System.out.println("'"+num+"' is not a Prime Number!!!!!");
			
			
			System.out.println();
			System.out.println("Enter a new number to try again or return key to exit");
			
			number = scanner.nextLine();
			
			
		}
		System.out.println("Thank you!!!!!");
		
		scanner.close();
	}

	private static long prime(long num) {
		long count =0;
		for (long i = 2; i < num/2; i++) {
			if(num%i==0)
				count++;
			
		}
		return count;
	}


	}


