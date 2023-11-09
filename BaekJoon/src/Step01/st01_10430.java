package Step01;

import java.util.*;

// 나머지 - 네 개의 계산식을 계산하는 문제
public class st01_10430 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		
		in.close();
	}
}
