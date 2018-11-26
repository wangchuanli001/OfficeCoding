package officeCoding;

/**
 * ��������˳��ʹ����λ��ż��ǰ��
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
 * 
 * @author Administrator
 *
 */
public class Pro_13 {
	public void reOrderArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
					int t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;
				}
			}
		}
	}

	/**
	 * 1.Ҫ�뱣֤ԭ�д�����ֻ��˳���ƶ������ڽ����� 2.i�������ұ������ҵ���һ��ż���� 3.j��i+1��ʼ����ң�ֱ���ҵ���һ��������
	 * 4.��[i,...,j-1]��Ԫ���������һλ������ҵ�����������iλ�ã�Ȼ��i++�� 5.�Kֹ�l����j�����v����ʧ����
	 */
	public void reOrderArray2(int[] a) {
		if (a == null || a.length == 0)
			return;
		int i = 0, j;
		while (i < a.length) {
			while (i < a.length && !isEven(a[i]))
				i++;
			j = i + 1;
			while (j < a.length && isEven(a[j]))
				j++;
			if (j < a.length) {
				int tmp = a[j];
				for (int j2 = j - 1; j2 >= i; j2--) {
					a[j2 + 1] = a[j2];
				}
				a[i++] = tmp;
			} else {// ����ʧ��
				break;
			}
		}
	}

	boolean isEven(int n) {
		if (n % 2 == 0)
			return true;
		return false;
	}
	// ����˼·�ɣ���һ��˼·������ð���㷨��ǰż�������ͽ�����
	// �ڶ���˼·���ٴ���һ������
}
