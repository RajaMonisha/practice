class Node {
	protected int data;
	protected Node next;
}
class SinglyLinkedList {
	protected Node start,end;
   int size = 0;
	public void insert(int n) {
		Node new1 = new Node();
		new1.data = n;
		if(start==null) {
         start = new1;
			end = start;
         size++;
		} else {
			end.next = new1;
			end = new1;
         size++;
		}
	}
	public void print() {
		Node temp = new Node();
		temp = start;
		while(temp != null) {
			System.out.print(temp.data+"  ");
         temp = temp.next;
		}
	}
   public SinglyLinkedList nthToLast(int n) {
      if(n>size || size==0) {
         return null;
      }
      int i;
      SinglyLinkedList result = new SinglyLinkedList();
      result.start = start;
      for(i=1;i<size;i++) {
         if(i == n) {
            result.size = size-(i-1);
            result.end = end;
            return result;
         } 
         result.start = result.start.next;
      }
      return null;
   }
}
public class NthToLastElement {
   
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(9);
      System.out.print("Original list\n");
		list.print();
      System.out.print("List from nth element\n");
      list.nthToLast(7);
      SinglyLinkedList list1 = list.nthToLast(3);
      list1.print();
	}
}