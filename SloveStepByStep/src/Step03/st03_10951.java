package Step03;

import java.util.*;

// A + B - 4 - 입력이 끝날 때까지 A+B를 출력하는 문제. EOF에 대해 알아 보세요.
public class st03_10951 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a + b);
		}
		in.close();
	}

}