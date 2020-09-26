import java.util.Scanner;

public class StringCalculator {
	public static int calculate(int first, String symbol, int second) {
		int result = first;
		if("+".equals(symbol)) {
			result = result + second;
			System.out.println("덧샘    :"+result);
		}
		else if("-".equals(symbol)) {
			result = result - second;
			System.out.println("뺄샘    :"+result);	
		}
		else if("*".equals(symbol)) {
			result = result * second;
			System.out.println("곱샘    :"+result);
		}
		else if("/".equals(symbol)) {
			result = result / second;
			System.out.println("나눗셈    :"+result);
		}
		else {
			System.out.println("잘못된 사칙연산입니다");
		}
		return result;
	}
	
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String value = scanner.nextLine();					// 엔터하기전 까지의 값을 입력받는다
	System.out.println("value   :"+value);
	String [] values = value.split(" ");				//입력한 값을 " " 을 기준으로 나눈다
//	System.out.println("values     :"+values[1]);
	int first = Integer.parseInt(values[0]);			//첫번째 입력값 
//	System.out.println("first      :"+first);
	int result = first;
	int i = 1;
	while( i < values.length)
	{ 	
		String symbol = values[i];	 					//사칙연산
//		System.out.println("symbol   :"+symbol);
		
		int second = Integer.parseInt(values[i+1]);		//두번쨰부터의 입력 한 수
//		System.out.println("second   :"+second);
		
		result = calculate(result, symbol, second);
		
		i = i+2;
	}
	Output.print(result);
	}
}
