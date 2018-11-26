package officeCoding;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头遍历链表 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
 * 
 * @author Administrator
 */
class ListNode {// 单链表节点构建
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class Pro_03 {

	static ListNode head = null;// 创建一个头节点

	public static void main(String[] args) {
		addNode(5);
		addNode(8);
		ArrayList<Integer> list = printListFromTailToHead(head);
		System.out.println(list);
	}

	// 队列和栈是一对好基友，从尾到头打印链表，当然离不开借助栈的帮忙啦
	// 所以，先把链表里的东西，都放到一个栈里去，然后按顺序把栈里的东西pop出来，就这么简单
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
			return false;// 如果当前index在链表中不存在
		}
		if (index == 1) {// 如果index指定的是头节点
			head = head.next;
			return true;
		}
		int i = 2;
		ListNode preNode = head;// 前一个节点（从头节点开始）
		ListNode curNode = preNode.next;// 当前节点
		while (curNode != null) {
			if (i == index) {
				preNode.next = curNode.next;// 删除当节点，前节点连接到下节点
				return true;
			}
			preNode = curNode;
			curNode = curNode.next;
			i++;
		}
		return false;
	}

	// 返回节点长度

	public int length() {
		int length = 0;
		ListNode tmp = head;
		while (tmp != null) {
			length++;
			tmp = tmp.next;
		}
		return length;
	}

	// 链表反转

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

	// 查找单链表的中间节点

	public ListNode SearchMid(ListNode head) {
		ListNode p = this.head, q = this.head;
		while (p != null && p.next != null && p.next.next != null) {
			p = p.next.next;
			q = q.next;
		}
		System.out.println("Mid:" + q.val);
		return q;
	}

	// 查找倒数 第k个元素

	public ListNode findElem(ListNode head, int k) {
		if (k < 1 || k > this.length()) {
			return null;
		}
		ListNode p1 = head;
		ListNode p2 = head;
		for (int i = 0; i < k; i++)// 前移k步
			p1 = p1.next;
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}

	// 排序

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

	// 从尾到头输出单链表，采用递归方式实现

	public void printListReversely(ListNode pListHead) {
		if (pListHead != null) {
			printListReversely(pListHead.next);
			System.out.println("printListReversely:" + pListHead.val);
		}
	}

	// 判断链表是否有环，单向链表有环时，尾节点相同

	public boolean IsLoop(ListNode head) {
		ListNode fast = head, slow = head;
		if (fast == null) {
			return false;
		}
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				System.out.println("该链表有环");
				return true;
			}
		}
		return !(fast == null || fast.next == null);
	}

	// 找出链表环的入口

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
