import java.util.LinkedList;
import java.util.Stack;

public class LinkedListI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hello");
		LinkeList list = new LinkeList();
		list.head = list.new Node(1);
		LinkeList.Node second = list.new Node(2);
		LinkeList.Node third = list.new Node(3);

		list.head.next = second;
		second.next = third;
		third.next = list.new Node(4);
		System.out.println(list.printList(list.head));
		// list.deleteNode(list.head,list.head,5);
		list.deleteNodeIndex(4);
		System.out.println(list.printList(list.head));
		StringBuilder s = new StringBuilder();
		s.append("hi");

		System.out.println(Integer.toString("geo".compareTo("Ahm")));

		LinkeListS listS = new LinkeListS();
		listS.head = listS.new Node("Harry");
		LinkeListS.Node secondS = listS.new Node("Bob");
		LinkeListS.Node thirdS = listS.new Node("Steve");

		listS.head.next = secondS;
		secondS.next = thirdS;
		thirdS.next = listS.new Node("Zoo");
		System.out.println(list.printList(list.head));
		// list.deleteNode(list.head,list.head,5);
		System.out.println(listS.minValue());

//		System.out.print(s.equals("hi"));
//		System.out.print(s.compareTo(new StringBuilder("hi22")));
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("a");
		list1.add("b");
		list1.add("d");
		list1.add("a1");
		list1.add("b");
		list1.add("c");
		list1.add("b");
		list1.add("d");
		list1.add("m");
		LinkedList<String> list2 = atLeastTwice2(list1);
		LinkedList<String> list3 = atLeastTwice(list1);
		System.out.println("Twice");
		System.out.println(list2.toString());
		System.out.println(list3.toString());
		// --------------------
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(4);
		s1.push(6);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		s1.push(7);
		s1.push(8);
		Stack<Integer> tempS = new Stack<Integer>();
		boolean b = StackS.find(9, s1, tempS);
		System.out.println(b);

	}

	public static LinkedList<String> atLeastTwice2(LinkedList<String> list1) {
		LinkedList<String> list = (LinkedList<String>) list1.clone();
		LinkedList<String> returnList = new LinkedList<String>();
		if (list.size() > 0) {
			String last = list.removeLast();
			if (list.contains(last)) {
				
				if (!returnList.contains(last))
					returnList.add(last);

			}
			returnList.addAll(atLeastTwice(list));
		}
		return returnList;
	}

	public static LinkedList<String> atLeastTwice(LinkedList<String> list) {
		LinkedList<String> returnList = new LinkedList<String>();

		if (list.size() > 0) {
			String last = list.getLast();
			list.remove(list.size() - 1);

			if (list.contains(last)) {
				returnList.addAll(atLeastTwice(list));
				if (!returnList.contains(last))
					returnList.add(last);

			}
			returnList.addAll(atLeastTwice(list));
			/*
			 * else { atLeastTwice(list); }
			 */
		}

		return returnList;

	}

}
