package officeCoding;

/**
 * �����е�����k����� ����һ����������������е�����k����㡣
 * 
 * @author Administrator
 *
 */
/*
 * public class ListNode { int val; ListNode next = null;
 * 
 * ListNode(int val) { this.val = val; } }
 */
public class Pro_14 {
	public ListNode FindKthToTail(ListNode head, int k) {
		if (k <= 0)
			return null;
		ListNode p1 = head;
		ListNode p2 = head;
		// p2��ǰ�ƶ�k���ڵ�
		for (int i = 0; i < k - 1; i++) {
			if (p2 == null)
				return null;
			p2 = p2.next;
		}
		if (p2 == null)
			return null;
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
}
