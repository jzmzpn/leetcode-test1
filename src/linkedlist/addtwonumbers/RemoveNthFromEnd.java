package linkedlist.addtwonumbers;

import java.util.HashMap;
import java.util.Map;

public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		Map<Integer, ListNode> mapNode = new HashMap<>();
		ListNode root = head;
		int index = 0;
		while(head != null) {
			mapNode.put(index, head);
			index ++;
			head = head.next;
		}
		n = index - n;
		if(n < 0) return root;
		ListNode listNode = mapNode.get(n);
		if(listNode == null) return root;
		ListNode preNode = mapNode.get(n - 1);
		
		ListNode nexNode = mapNode.get(n + 1);
		if(preNode == null) {
			return nexNode;
		}
		preNode.next = nexNode;
		return root;
    }
	
	public ListNode removeNthFromEnd_2(ListNode head, int n) {
		Map<Integer, ListNode> mapNode = new HashMap<>();
		ListNode root = head;
		int index = 0;
		
		ListNode pre = head;
		ListNode next = null;
		while(head != null) {
			
			if(index > n) {
				pre = pre.next;
			}
			if(index >= n) {
				if(pre.next != null) {
					next = pre.next.next;
					System.out.println("---" + next);
				}
				else 
					next = null;
			}
			
			index ++;
			head = head.next;
		}
		n = index - n;
		System.out.println(pre);
		System.out.println(next);
		if(n < 0) return root;
		if(n == 0) return root.next;
		
		
		pre.next = next;
		return root;
    }
	
	public static void main(String[] args) {
		RemoveNthFromEnd rn = new RemoveNthFromEnd();
		ListNode l12 = new ListNode(3);
		ListNode l11 = new ListNode(2, l12);
//
		ListNode l23 = new ListNode(1,l11);
		//ListNode l22 = new ListNode(2, l23);
		//ListNode l21 = new ListNode(1, l22);
		System.out.println(l23);
		ListNode node = rn.removeNthFromEnd_2(l23, 3);
		System.out.println(node);
	}
}
