package array;

import java.util.Scanner;

public class ex8958 {
	public static void main(String[] args) {
//		"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�.
//		������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
//		"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
//		OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // �־��� ����
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
			charr = new char[arr[i].length()]; //���ڼ���ŭ�� �迭 ����
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
