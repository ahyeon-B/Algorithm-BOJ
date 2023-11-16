package Step04;

import java.util.*;
// 과제 안 내신 분..? - 과제 제출 기한이 지났습니다.
public class st04_5597 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int []arr = new int[30];
		
		for(int i = 0; i < 28; i++) {
			int st = in.nextInt();
			arr[st - 1] = 1;
		}
		
		for(int i = 0; i < 30; i++) {
			if(arr[i] == 0)
				System.out.println(i + 1);
		}
		in.close();
	}

}