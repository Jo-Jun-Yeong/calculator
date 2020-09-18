import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요");
		int i = scanner.nextInt();
		int result = i;
		while(true) {
			System.out.println("기호를 입력하세요 :     ");
			String symbol = scanner.next();
			if ("=".equals(symbol)) {
				System.out.print("계산 종료   ");
				System.out.println(result);
				break;
			}
			
			System.out.println("두번째 값을 입력하세요");
			int j = scanner.nextInt();
		
			if("+".equals(symbol)) {
				result = result + j;
				System.out.println(result);
			}
			else if("-".equals(symbol)) {
				result = result - j;
				System.out.println(result);
			}
			else if("*".equals(symbol)) {
				result = result * j;
				System.out.println(result);
			}
			else if("/".equals(symbol)) {
				result = result / j;
				System.out.println(result);
			}
			else {
				System.out.println("사칙연산에 해당되지 않는 입력입니다.");
			}
		}		
	}
}
