package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		while(true) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
			/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */	
			Arithmetic c = null; 
			switch(operation) {
				case("+"): 
					    c = new Add();
						break;
				case("-"):
				    	c = new Sub();
						break;      
				case("*"):
				    	c = new Mul();
						break;
				case("/"):
				    	c = new Div();
						break;
		        default :
		        		break;
			}
			
			if(c != null) {
				System.out.println( c.calculate(a, b) );
			}
			
		}
	}
}
