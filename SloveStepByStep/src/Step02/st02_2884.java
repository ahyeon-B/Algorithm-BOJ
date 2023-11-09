package Step02;

import java.util.*;

// 알람 시계 - 시계 계산 문제
public class st02_2884 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		in.close();
		
		if(m<45) {
			h--;
			m = 60 - (45 - m);
			if(h<0)
				h=23;
			System.out.println(h + " " + m);
		} else
			System.out.println(h + " " + (m - 45));
	}

}
