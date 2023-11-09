package Step01;

import java.util.Scanner;
	 
// 사칙 연산 - 모든 연산 문제
public class st01_10869 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
	 
	       in.close();
	 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}