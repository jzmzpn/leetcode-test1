package linkedlist.addtwonumbers;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode root = l1;
		int carry = 0;
		while(l1 != null || l2 != null) {
			carry = l1.val + l2.val + carry;
			if(carry >= 10) {
				l1.val = carry - 10;
				carry = 1;
			} else {
				l1.val = carry;
				carry = 0;
			}
			
			if(l1.next == null && l2.next == null) {
				break;
			}
			if(l1.next == null) {
                l1.next = new ListNode(0);
                l1 = l1.next;
            } else {
			    l1 = l1.next;
            }
            if(l2.next == null) {
                l2.next = new ListNode(0);
                l2 = l2.next;
            } else {
			    l2 = l2.next;
            }
		}
		if(carry == 1) {
			l1.next = new ListNode(1);
		}
        return root;
    }
	
	public static void main(String[] args) {
//		ListNode l13 = new ListNode(3);
//		ListNode l12 = new ListNode(4, l13);
//		ListNode l11 = new ListNode(2, l12);
//
//		ListNode l23 = new ListNode(4);
//		ListNode l22 = new ListNode(6, l23);
//		ListNode l21 = new ListNode(5, l22);
		//ListNode l13 = new ListNode(3);
		//ListNode l12 = new ListNode(4, l13);
		ListNode l11 = new ListNode(0);

		//ListNode l23 = new ListNode(4);
		ListNode l22 = new ListNode(3);
		ListNode l21 = new ListNode(7, l22);
		AddTwoNumbers a = new AddTwoNumbers();
		ListNode addTwoNumbers = a.addTwoNumbers(l11, l21);
		System.out.println(addTwoNumbers.val);
		System.out.println(addTwoNumbers.next.val);
		//System.out.println(addTwoNumbers.next.next.val);
		//System.out.println(addTwoNumbers.next.next.next.val);
	}
}


