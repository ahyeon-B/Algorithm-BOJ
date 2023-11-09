package Step02;

import java.util.*;

// 오븐 시계 - 범위가 더 넓은 시간 계산 문제
public class st02_2525 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int min = a * 60 + b + c;
		int hour = min/60%24;
		min = min%60;
		System.out.println(hour + " " + min);		
		
		in.close();
	}

}
