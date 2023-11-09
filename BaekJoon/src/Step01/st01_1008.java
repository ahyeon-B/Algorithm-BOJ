package Step01;

import java.util.Scanner;
// A/B - 나눗셈 문제
public class st01_1008 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a = in.nextDouble();
		double b = in.nextDouble();
		
		in.close();
		System.out.println(a/b);
	}
}
