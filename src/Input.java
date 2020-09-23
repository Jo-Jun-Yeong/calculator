import java.util.Scanner;

public class Input {
	//첫번째 입력하는 부분
	public static int getFirst(Scanner scanner) {
		System.out.println("첫번째 숫자를 입력하세요 ");
		int i = scanner.nextInt();		
		return i;
	}
	//기호 입력하는 부분
	public static String getSymbol(Scanner scanner) {
		System.out.println("기호를 입력하세요");
		String symbol = scanner.next();
		return symbol;
	}
	//두번쨰 입력하는 부분
	public static int getSecond(Scanner scanner) {
		System.out.println("숫자를 입력하세요.");
		int j = scanner.nextInt();
		return j;
	}
}
