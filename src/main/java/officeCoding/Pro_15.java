package officeCoding;
/**��ת����
 * ����һ��������ת��������������ı�ͷ��
 * @author Administrator
 *
 */
/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Pro_15 {
	public static ListNode ReverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode head1 = head;
		ListNode p1 = head;
		ListNode p2 = null;
		ListNode tag = null;
		for (; p1.next != null; p1 = p1.next)
			;
		p2 = tag = p1;
		for (p1 = head; p1 != tag;) {
			head1 = p1.next;
			p1.next = tag.next;
			tag.next = p1;
			p1 = head1;
		}
		return tag;
	   }
}
