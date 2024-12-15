
import java.util.Scanner;

public class lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Введите число: ");
		 int number = scanner.nextInt();
		 if (number % 3 == 0) {
			 System.out.println(number + " делится на 3.");
			 } else {
				 System.out.println(number + " не делится на 3.");
				 }
		 scanner.close(); }
	}



