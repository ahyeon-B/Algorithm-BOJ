package Step02;

import java.util.*;

// 사분면 고르기 - 점이 어느 사분면에 있는지 알아내는 문제
public class st02_14681 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		
		if(x>0) {
			if (y>0)
				System.out.println("1");
			else
				System.out.println("4");
		} else if (x<0) {
			if (y>0)
				System.out.println("2");
			else
				System.out.println("3");
		}
		in.close();
	}

}
