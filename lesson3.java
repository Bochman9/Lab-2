import java.util.Scanner;
public class lesson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число: ");
		int number = scanner.nextInt();
		if (number >= 10 && number % 4 == 0) {
			System.out.println("Число удовлетворяет критериям: делится на 4 и не меньше 10.");
			} else {
		System.out.println("Число не удовлетворяет критериям.");
		}
		scanner.close();
		}
	}
