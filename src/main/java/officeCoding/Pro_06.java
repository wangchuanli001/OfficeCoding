package officeCoding;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
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
			// 如果array[i]==array[j]==array[mid]
			// 则不能用二分查找，因为不确定array[mid]位于哪个有序子数组
			// 只能用顺序查找
			if (array[i] == array[j] && array[j] == array[mid]) {
				// 在除了Main()方法中调用其他方法需要new实例之外，其他方法中调用同一个类中的方法直接用：方法名（实参）即可，不需要其他操作
				return findInOrder(array, i, j);
			}

			if (array[i] <= array[mid])
				i = mid;
			else if (array[mid] <= array[j])
				j = mid;
		}
		return array[mid];
	}

	// 顺序查找
	public int findInOrder(int[] a, int in1, int in2) {
		int k = a[in1];
		for (int i = in1 + 1; i < in2; i++)
			if (a[i] < k)
				k = a[i];
		return k;
	}

}
