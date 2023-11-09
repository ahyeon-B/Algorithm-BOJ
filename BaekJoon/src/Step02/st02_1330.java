package Step02;

import java.util.*;

// 두 수 비교하기 - 두 수를 비교한 결과를 출력하는 문제
public class st02_1330 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a > b) 
			System.out.println(">");
		else if(a < b)
			System.out.println("<");
		else if(a == b)
			System.out.println("==");
		
		in.close();
	}
}