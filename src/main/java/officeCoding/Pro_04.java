package officeCoding;

/**
 * �ؽ�������
 * 
 * @author Administrator
 *
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
	}
}

public class Pro_04 {

	/*
	 * ������������ǰ�����������������ع�������������ǰ����������������û���ظ�����
	 */

	/**
	 * 
	 * @param pre ǰ�����
	 * @param in  �������
	 * @return ���������ڵ�
	 */
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		/*
		 * ����Ϸ����жϣ� ����Ϊ�գ�����ͺ��򳤶�Ҫһ��
		 */
		if (pre == null || in == null || pre.length != in.length)
			return null;

		return construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	/**
	 * 
	 * @param pre ǰ�����
	 * @param ps  ǰ������Ŀ�ʼλ��
	 * @param pe  ǰ������Ľ���λ��
	 * @param in  �������
	 * @param is  ��������Ŀ�ʼλ��
	 * @param ie  ��������Ľ���λ��
	 * @return ���ĸ��ڵ�
	 */
	private TreeNode construct(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if (ps > pe)
			return null;

		// ȡǰ������ĵ�һ�����־��Ǹ��ڵ�
		int value = pre[ps];
		// �������������Ѱ�Ҹ��ڵ�
		int index = is;
		while (index <= ie && value != in[index]) {
			index++;
		}
		// ������������������������û���ҵ���˵������Ĳ����ǲ��Ϸ��ģ��׳��쳣
		if (index > ie)
			throw new RuntimeException("Invalid Iuput!");

		// ������ǰ���ڵ㣬��Ϊ���ڵ㸳ֵ
		TreeNode node = new TreeNode(value);
		// �ݹ���ù�����ǰ�ڵ��������
		node.left = construct(pre, ps + 1, ps + index - is, in, is, index - 1);
		// �ݹ���ù�����ǰ�ڵ��������
		node.right = construct(pre, ps + index - is + 1, pe, in, index + 1, ie);

		return node;
	}

	private void printTree(TreeNode root) {
		if (root != null) {
			printTree(root.left);
			System.out.println(root.val + " ");
			printTree(root.right);
		}
	}

	public static void main(String[] args) {
		Pro_04 test = new Pro_04();
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
		TreeNode node = test.reConstructBinaryTree(pre, in);
		test.printTree(node);

	}

}
