package array;

import java.util.Scanner;

public class ex8958 {
	public static void main(String[] args) {
//		"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
//		문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
//		"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//		OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 주어진 갯수
		String ss = "";
		
		String arr[] = new String[n];
		char charr[];
		
		for(int i = 0; i < n; i++) {
			ss = sc.next();
			arr[i] = ss;
		}
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			int count = 0;
			charr = new char[arr[i].length()]; //글자수만큼의 배열 생성
			for(int j = 0; j < arr[i].length(); j++) {
				charr[j] = arr[i].charAt(j);
				if(charr[j] == 'O') {
					count++;
					sum += count;
				}else {
					count = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
