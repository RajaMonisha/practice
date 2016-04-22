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
   public void removeDup() {
      Node temp1 = start;
      int j;
      for(int i=1;i<size;i++) {
        Node temp2 = temp1.next;
        for(j=i+1;j<=size;j++) {
          if(temp1.data == temp2.data) {
            this.delete(j);
            j--;
          }
          temp2 = temp2.next;
        }
        temp1 = temp1.next;
      }
      
   }
}
public class RemoveDuplicates {
   
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.insert(5);
    list.insert(5);
    list.insert(5);
    list.insert(5);
    list.insert(4);
    System.out.print("Original list: ");
    list.print();
    System.out.print("\nList after removing duplicates: ");
    list.removeDup();;
    list.print();
   }
}