import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		String symbol = scanner.next();
		System.out.println("수를 입력하세요");
		int i = scanner.nextInt();
		
		int again = i;
		
		while(true) {
			System.out.println("기호를 입력하세요");
			String symbol = scanner.next();

		
			if("=".equals(symbol)) {
				System.out.print("계산 종료    =");
				System.out.println(again);
				break;
			}
				
			System.out.println("수를 입력하세요");
			int j = scanner.nextInt();
			
			if("+".equals(symbol)) {
				System.out.println(again+j);
				again = again +j;
			}
			else if("-".equals(symbol)){
				System.out.println(again-j);
				again = again - j;
			}
			else if("*".equals(symbol)) {
				System.out.println(again*j);
				again = again * j;
			}
			else if("/".equals(symbol)) {
				System.out.println(again/j);
				again = again * j;
			}
			else {
				System.out.println("올바른 수식 입력이 아닙니다");
			}
		}
	}
}
