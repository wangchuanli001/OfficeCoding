package officeCoding;

/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0���� n<=39
 * 
 * @author Administrator
 *
 */
public class Pro_07 {
	public int Fibonacci(int n) {
		int a = 1, b = 1;
		int v = 0;
		if (n == 1 || n == 2)
			return 1;
		for (int i = 3; i <= n; i++) {
			v = a + b;
			a = b;
			b = v;
		}
		return v;
	}
}
