package algorithm;

import java.util.Scanner;

public class ex10950 {
	public static void main(String[] args) {
		// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		// �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println((a + b));
		}
	}
}
