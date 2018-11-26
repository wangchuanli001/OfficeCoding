package officeCoding;

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
