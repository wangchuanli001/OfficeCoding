package officeCoding;

/**
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
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
