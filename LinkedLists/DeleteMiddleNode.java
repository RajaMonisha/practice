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
    public void delete(int pos)
    {
         if (pos == 1) 
        {
            start = start.next;
            size--; 
            return ;
        }
        if (pos == size) 
        {
            Node temp = start;
            while (temp.next != end)
            {
                temp = temp.next;
            }
            end = temp;
            end.next = null;
            size --;
            return;
        }
        Node prev = start;
        pos = pos-1 ;
        for (int i=1; i<size-1; i++) 
        {
            if (i == pos) 
            {
                Node temp = prev;
                temp = temp.next.next;
                prev.next = temp;
                break;
            }
            prev = prev.next;
        }
        size-- ;
       
    } 
   public SinglyLinkedList remove(int n) {
      if(size==0) {
         return null;
      }
      SinglyLinkedList result = new SinglyLinkedList();
      Node temp = start;
      int i=1;
      while(temp!=null) {
         
         if(temp.data == n) {
            result.start = start;
            result.end = end;
            result.size = size;
            result.delete(i);
            return result;
         } 
         temp = temp.next;
         i++;
      }
      System.out.println("(Number not found)");
      return this;
   }
}
public class DeleteMiddleNode {
   
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(11);
      System.out.print("Original list:");
		list.print();
      System.out.print("\nNew list after deleting: ");
      SinglyLinkedList list1 = list.remove(8);;
      list1.print();
   }
}