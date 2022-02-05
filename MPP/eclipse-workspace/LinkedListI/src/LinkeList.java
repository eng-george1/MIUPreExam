
public class LinkeList {
	Node head;

	public class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void deleteNode1(int key) {
		if (head == null)
			return;
		Node n = head;
		Node previous=null;
		Node selected=null;
		while (n != null) {
			if (n.data == key) {
				selected = n;

				break;
			}
			previous = n;
			n = n.next;
		}
		if (selected == null)
			return;
		if(previous==null)
			head=selected.next;
		else
		previous.next = selected.next;
	}

	void deleteNodeIndex(int index) {
		if (head == null)
			return;
		Node n = head;
		Node previous=null;
		Node selected=null;
		int count=0;
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
		if(previous==null)
			head=selected.next;
		else
		previous.next = selected.next;
	}
	
	void deleteNode(Node previous, Node n, int key) {
		if (n == null)
			return;
		if (n.data == key) {
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
	public void insertAfter(Node prev_node, int new_data)
	{
	Node n=new Node(new_data);
	n.next=prev_node.next;
	prev_node.next=n;
	}
	public void append(int new_data)
	{
		Node n=new Node(new_data);
		if(head==null)
			head=n;
		Node tempn=head;
		while(tempn.next!=null)
		{
			tempn=tempn.next;
		}
		tempn.next=n;
	}
	String printList(LinkeList.Node n) {

		if (n == null)
			return "";
		StringBuilder nodes = new StringBuilder();

		nodes.append(Integer.toString(n.data));
		if (n.next != null)
			nodes.append(",");
		// nodes.append(",");
		return nodes.append(printList(n.next)).toString();

	}

	void printList1(LinkeList.Node n) {
		StringBuilder nodes = new StringBuilder();
		while (n != null) {
			if (!nodes.isEmpty())
				nodes.append(",");
			nodes.append(Integer.toString(n.data));
			n = n.next;
		}
		System.out.print(nodes);
	}
}
