package officeCoding;

/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
 * 
 * @author Administrator
 *
 */
public class Pro_08 {
	public int JumpFloor(int target) {
		if (target == 1)
			return 1;
		if (target == 2)
			return 2;
		return JumpFloor(target - 1) + JumpFloor(target - 2);
	}
}
