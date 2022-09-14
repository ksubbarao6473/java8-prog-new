package info.ds.collections.prog;

public class LinkedListDemo {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}

	public static void main(String[] args) {
		int[] ar = {2,9,4,8,1,5};
		Node head = null;
		//LinkedList<String> ls = new LinkedList();
		//ls.size();
		for(int i=0;i<ar.length;i++) {
			Node t = new Node(ar[i]);
			if(head==null) {
			 head = t;
			}else {
				Node q = head;
				while(q.next!=null) {
					q = q.next;
				}
				q.next=t;
			}
		}
		
		Node t1 = head;
		while(t1!=null) {
			System.out.println(t1.data);
			t1=t1.next;
		}

	}

}
