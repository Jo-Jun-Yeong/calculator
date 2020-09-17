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

		Scanner symbol = new Scanner(System.in);
		String Symbol = scanner.next();
		System.out.println("입력한 기호:    " + Symbol);
		System.out.println(frist + Symbol + second);
		if("+".equals(Symbol)) {
			System.out.println(frist + second);
		}
		else if("-".equals(Symbol)) {
			System.out.println(frist - second);
		}
		else if ("*".equals(Symbol)) {
			System.out.println(frist * second);
		}
		else if("/".equals(Symbol)) {
			System.out.println(frist / second);
		}
		else {
			System.out.println("사칙연산에 해당되지 않는 입력입니다.");
		}
	}
}
