package array;

import java.util.Scanner;

public class ex3052 {
	public static void main(String[] args) {
		//�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�.
		//�� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int val[] = new int[42];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			val[arr[i] % 42]++;
		}
		
		for(int j = 0; j < val.length; j++) {
			if(val[j] != 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
