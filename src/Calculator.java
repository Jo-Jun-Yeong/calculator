import java.util.Scanner;
public class Calculator {
		static int getFirstValue(Scanner scanner) {
			System.out.println("첫번째 값을 입력하세요");
			int i = scanner.nextInt();
			return i;
		}
		
		static String getSymbol(Scanner scanner) {
			System.out.println("기호를 입력하세요 :     ");
			String symbol = scanner.next();
			//if문의 종료문자가 다음으로 와야함
			return symbol;
		}
		
		static int getSecondValue(Scanner scanner) {
			System.out.println("두번째 값을 입력하세요");
			int j = scanner.nextInt();
			return j;
		}
		
		static int calculate(int i,String symbol, int j) {
			//사칙연산을 이용해서 결과값을 반환하는 열
			int result = 0;
			if("+".equals(symbol)) {
				result = i + j;
				System.out.println(result);
			}
			else if("-".equals(symbol)) {
				result = i- j;
				System.out.println(result);
			}
			else if("*".equals(symbol)) {
				result = i* j;
				System.out.println(result);
			}
			else if("/".equals(symbol)) {
				result = i / j;
				System.out.println(result);
			}
			else {
				System.out.println("사칙연산에 해당되지 않는 입력입니다.");
			}
			return result;
		}
		
		static void print(int result) {
			System.out.println("계산 종료   "   +  result);
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int i = getFirstValue(scanner);
			int result = i;
			while(true) {
			String  symbol = getSymbol(scanner);
			if ("=".equals(symbol)) {
				print(result);
				break;
			}				
			int j =getSecondValue(scanner);
			result = calculate(result, symbol, j);
}			
	}
}