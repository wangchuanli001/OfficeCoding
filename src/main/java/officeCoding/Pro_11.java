package officeCoding;

/**
 * 二进制中1的个数 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 
 * @author Administrator
 *
 */
public class Pro_11 {
	public int NumberOf1(int n) {
		String b = Integer.toBinaryString(n);
		char[] c = b.toCharArray();
		int t = 0;
		for (int i = 0; i < c.length; i++) {

			if (c[i] == '1') {
				t++;
			}

		}
		return t;
	}
}
