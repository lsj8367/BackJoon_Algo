package array;

import java.util.Scanner;

public class ex2577 {
	public static void main(String[] args) {
//		�� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		���� ��� A = 150, B = 266, C = 427 �̶��
//		A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�
//		����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		int result = a * b * c;
		int arr[] = new int[10];
		
		int val = Integer.toString(result).length();
		
		for(int i = 0; i < val; i++) {
			arr[result % 10]++;
			result /= 10;
		}
		
		for(int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		

	}

}
