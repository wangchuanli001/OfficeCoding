package officeCoding;

/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
 * 
 * @author Administrator
 *
 */
public class Pro_09 {
	public int JumpFloorII(int target) {
		if (target == 0 || target == 1) {
			return 1;
		}
		return 2 * JumpFloorII(target - 1);
	}
}
