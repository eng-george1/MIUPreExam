import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkeListS {
	Node head;

	public class Node {
		String data;
		Node next;

		Node(String d) {
			data = d;
			next = null;
		}
	}

public Node Pop()
{
	Node n=head;
	head=head.next;
	return n;
}
public void posh(String s)
{
	if(s==null)
		return;
	Node n=new Node(s);
	n.next=this.head;
	this.head=n;
}
	
	public String[] atLeastTwice(LinkeListS linkS) {
		Set<String> dup = new HashSet<String>();
		Set<String> tempUniq = new HashSet<String>();
		if (!tempUniq.add(linkS.head.data))
			dup.add(linkS.head.data);
		if (linkS.head.next != null) {
			linkS.head = linkS.head.next;
			atLeastTwice(linkS);
		}
		return dup.toArray(new String[0]);
	}

	public String minValue() {
		if (head == null)
			return null;
		Node n = head;
		String min = head.data;
		while (n != null) {
			if (n.data.compareTo(min) < 0)
				min = n.data;
			n = n.next;
		}
		return min;
	}

	void deleteNode1(int key) {
		if (head == null)
			return;
		Node n = head;
		Node previous = null;
		Node selected = null;
		while (n != null) {
			if (n.data.equals(key)) {
				selected = n;

				break;
			}
			previous = n;
			n = n.next;
		}
		if (selected == null)
			return;
		if (previous == null)
			head = selected.next;
		else
			previous.next = selected.next;
	}

	void deleteNodeIndex(int index) {
		if (head == null)
			return;
		Node n = head;
		Node previous = null;
		Node selected = null;
		int count = 0;
		while (n != null) {
			if (count == index) {
				selected = n;
				break;
			}
			previous = n;
			n = n.next;
			count++;
		}
		if (selected == null)
			return;
		if (previous == null)
			head = selected.next;
		else
			previous.next = selected.next;
	}

	void deleteNode(Node previous, Node n, int key) {
		if (n == null)
			return;
		if (n.data.equals(key)) {
			if (previous == null)
				head = n.next;
			previous.next = n.next;
		}
		deleteNode(n, n.next, key);
	}

	public void push(Node n) {
		n.next = head;
		head = n;

	}

	public void insertAfter(Node prev_node, String new_data) {
		Node n = new Node(new_data);
		n.next = prev_node.next;
		prev_node.next = n;
	}

	public void append(String new_data) {
		Node n = new Node(new_data);
		if (head == null)
			head = n;
		Node tempn = head;
		while (tempn.next != null) {
			tempn = tempn.next;
		}
		tempn.next = n;
	}

	String printList(LinkeListS.Node n) {

		if (n == null)
			return "";
		StringBuilder nodes = new StringBuilder();

		nodes.append(n.data);
		if (n.next != null)
			nodes.append(",");
		// nodes.append(",");
		return nodes.append(printList(n.next)).toString();

	}

	void printList1(LinkeListS.Node n) {
		StringBuilder nodes = new StringBuilder();
		while (n != null) {
			if (!nodes.isEmpty())
				nodes.append(",");
			nodes.append(n.data);
			n = n.next;
		}
		System.out.print(nodes);
	}
}
