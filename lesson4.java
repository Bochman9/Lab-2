import java.util.Scanner;

public class lesson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число: ");
		int number = scanner.nextInt();
		if (number >= 5 && number <= 10) {
		System.out.println("Число " + number + " находится в диапазоне от 5 до 10 включительно.");
		} else {
		System.out.println("Число " + number + " не попадает в диапазон от 5 до 10 включительно.");
		} scanner.close();
	}
}
