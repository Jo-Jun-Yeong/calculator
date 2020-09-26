import java.util.Scanner;
public class Calculator {		
		static int calculate(int i , String symbol, int j) {
		//if 시작
			int result = 0;
			if("+".equals(symbol)) {
				result = i + j;
				System.out.println(result);
			}
			else if("-".equals(symbol)) {
				result = i - j;
				System.out.println(result);	
			}
			else if("*".equals(symbol)) {
				result = i * j;
				System.out.println(result);
			}
			else if("/".equals(symbol)) {
				result = i / j;
				System.out.println(result);
			}
			else {
				System.out.println("잘못된 사칙연산입니다");
			}
			return result;
		}

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String InputValue = scanner.nextLine();
	int i = Input.getFirst(scanner);
	int result = i;
	while(true) {
	String symbol = Input.getSymbol(scanner);
	
	if("=".equals(symbol)) {
		Output.print(result);
		break;
	}

	int j = Input.getSecond(scanner);
	result = calculate(result, symbol, j);
		}
	}
}
	