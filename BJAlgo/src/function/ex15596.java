package function;

public class ex15596 {
//	a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
//	���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
	long sum(int[] a) {
		long ans = 0;
		for(int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}
