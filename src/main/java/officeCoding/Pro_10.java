package officeCoding;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 
 * @author Administrator
 *
 */
public class Pro_10 {
	public static int RectCover(int target) {
		if (target ==0) {
			return 0;
		}
		int a = 0;
        int b = 1;
        int t = 1;
        while(target -- > 0){
            t = a + b;
            a = b;
            b = t;
        }
        return t;
	}

	public static void main(String[] args) {
		System.out.println(RectCover(0));
	}
}
