package officeCoding;

import java.util.ArrayList;
import java.util.Stack;

/**
 * ��β��ͷ�������� ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList
 * 
 * @author Administrator
 */
class ListNode {// ������ڵ㹹��
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class Pro_03 {

	static ListNode head = null;// ����һ��ͷ�ڵ�

	public static void main(String[] args) {
		addNode(5);
		addNode(8);
		ArrayList<Integer> list = printListFromTailToHead(head);
		System.out.println(list);
	}

	// ���к�ջ��һ�Ժû��ѣ���β��ͷ��ӡ������Ȼ�벻������ջ�İ�æ��
	// ���ԣ��Ȱ�������Ķ��������ŵ�һ��ջ��ȥ��Ȼ��˳���ջ��Ķ���pop����������ô��
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<Integer>();
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}

	// input
	public static void addNode(int d) {
		ListNode newNode = new ListNode(d);
		if (head == null) {
			head = newNode;
		}
		ListNode tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = newNode;
	}

	// delete
	public boolean deleteNode(int index) {
		if (index < 1 || index > length()) {
			return false;// �����ǰindex�������в�����
		}
		if (index == 1) {// ���indexָ������ͷ�ڵ�
			head = head.next;
			return true;
		}
		int i = 2;
		ListNode preNode = head;// ǰһ���ڵ㣨��ͷ�ڵ㿪ʼ��
		ListNode curNode = preNode.next;// ��ǰ�ڵ�
		while (curNode != null) {
			if (i == index) {
				preNode.next = curNode.next;// ɾ�����ڵ㣬ǰ�ڵ����ӵ��½ڵ�
				return true;
			}
			preNode = curNode;
			curNode = curNode.next;
			i++;
		}
		return false;
	}

	// ���ؽڵ㳤��

	public int length() {
		int length = 0;
		ListNode tmp = head;
		while (tmp != null) {
			length++;
			tmp = tmp.next;
		}
		return length;
	}

	// ����ת

	public ListNode ReverseIteratively(ListNode head) {
		ListNode pReversedHead = head;
		ListNode pNode = head;
		ListNode pPrev = null;
		while (pNode != null) {
			ListNode pNext = pNode.next;
			if (pNext == null) {
				pReversedHead = pNode;
			}
			pNode.next = pPrev;
			pPrev = pNode;
			pNode = pNext;
		}
		this.head = pReversedHead;
		return this.head;
	}

	// ���ҵ�������м�ڵ�

	public ListNode SearchMid(ListNode head) {
		ListNode p = this.head, q = this.head;
		while (p != null && p.next != null && p.next.next != null) {
			p = p.next.next;
			q = q.next;
		}
		System.out.println("Mid:" + q.val);
		return q;
	}

	// ���ҵ��� ��k��Ԫ��

	public ListNode findElem(ListNode head, int k) {
		if (k < 1 || k > this.length()) {
			return null;
		}
		ListNode p1 = head;
		ListNode p2 = head;
		for (int i = 0; i < k; i++)// ǰ��k��
			p1 = p1.next;
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}

	// ����

	public ListNode orderList() {
		ListNode nextNode = null;
		int tmp = 0;
		ListNode curNode = head;
		while (curNode.next != null) {
			nextNode = curNode.next;
			while (nextNode != null) {
				if (curNode.val > nextNode.val) {
					tmp = curNode.val;
					curNode.val = nextNode.val;
					nextNode.val = tmp;
				}
				nextNode = nextNode.next;
			}
			curNode = curNode.next;
		}
		return head;
	}

	// ��β��ͷ������������õݹ鷽ʽʵ��

	public void printListReversely(ListNode pListHead) {
		if (pListHead != null) {
			printListReversely(pListHead.next);
			System.out.println("printListReversely:" + pListHead.val);
		}
	}

	// �ж������Ƿ��л������������л�ʱ��β�ڵ���ͬ

	public boolean IsLoop(ListNode head) {
		ListNode fast = head, slow = head;
		if (fast == null) {
			return false;
		}
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				System.out.println("�������л�");
				return true;
			}
		}
		return !(fast == null || fast.next == null);
	}

	// �ҳ����������

	public ListNode FindLoopPort(ListNode head) {
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				break;
		}
		if (fast == null || fast.next == null)
			return null;
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
