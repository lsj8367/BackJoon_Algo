package array;

import java.util.Scanner;

public class ex4344 {
	public static void main(String[] args) {
		/*
		���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
		�Է�
		ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
		��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
		���
		�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
		*/
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int a = 0;
		int sum = 0;
		int count = 0;
		int arr[] = new int[0];
		float average = 0;
		
		for(int i = 0; i < c; i++) {
			a = sc.nextInt();
			arr = new int[a];
			sum = 0;
			count = 0;
			average = 0;
			
			for(int j = 0; j < a; j++) {
				int b = sc.nextInt();
				arr[j] = b;
				sum += arr[j];
			}
			average = (float)sum / a;

			for(int k = 0; k < a; k++) {
				if((float)arr[k] > average) {
					count++;
				}
			}
			System.out.printf("%.3f", ((float)count / (float)a * 100));
			System.out.println("%");
			
		}
		
	}
}
