package officeCoding;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。 n<=39
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
