package algorithm;

import java.util.Scanner;

public class ex8393 {
	public static void main(String[] args) {
		// 1���� �ڿ��� n������ �� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n >= 1 && n <= 10000) {
			int result = 0;
			for(int i = 1; i <= n; i++) {
				result += i;
			}
			System.out.println(result);
		}
	}
}
