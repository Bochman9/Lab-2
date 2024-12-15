import java.util.Scanner;

public class lesson6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число: ");
		int number = scanner.nextInt();
		if (number % 5 == 2 && number % 7 == 1) {
			System.out.println("Число удовлетворяет критериям."); 
			} else { 
				System.out.println("Число не удовлетворяет критериям.");
				}
		scanner.close(); 
	}

}