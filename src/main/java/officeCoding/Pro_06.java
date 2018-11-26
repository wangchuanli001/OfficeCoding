package officeCoding;

/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * 
 * @author Administrator
 *
 */
public class Pro_06 {

	public int minNumberInRotateArray(int[] array) {

		if (array == null)
			return 0;
		int i = 0, j = array.length - 1, mid = 0;
		while (array[i] >= array[j]) {
			if (j - i == 1) {
				mid = j;
				break;
			}

			mid = (i + j) / 2;
			// ���array[i]==array[j]==array[mid]
			// �����ö��ֲ��ң���Ϊ��ȷ��array[mid]λ���ĸ�����������
			// ֻ����˳�����
			if (array[i] == array[j] && array[j] == array[mid]) {
				// �ڳ���Main()�����е�������������Ҫnewʵ��֮�⣬���������е���ͬһ�����еķ���ֱ���ã���������ʵ�Σ����ɣ�����Ҫ��������
				return findInOrder(array, i, j);
			}

			if (array[i] <= array[mid])
				i = mid;
			else if (array[mid] <= array[j])
				j = mid;
		}
		return array[mid];
	}

	// ˳�����
	public int findInOrder(int[] a, int in1, int in2) {
		int k = a[in1];
		for (int i = in1 + 1; i < in2; i++)
			if (a[i] < k)
				k = a[i];
		return k;
	}

}
