import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		System.out.println("두개의 값을 입력하시오");
		Scanner scanner = new Scanner(System.in);
		int frist = scanner.nextInt();
		System.out.print("첫번째 입력 값:    ");
		System.out.println(frist);
		
		int second = scanner.nextInt();
		System.out.print("번째 입력 값:    ");
		System.out.println(second);
		
		System.out.println("덧셈  "+(frist + second));
		System.out.println("뺄셈  "+(frist - second));
		System.out.println("곱셈  "+(frist * second));
		System.out.println("나눗셈  "+(frist / second));
	}
}
