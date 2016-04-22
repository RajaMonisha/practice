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
    for(int i=0;i<size;i++) {
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
   public Node findLoopBeginning() {
      Node temp1 = start;
      for(int i=1;i<size;i++) {
        Node temp2 = temp1.next;
        for(int j=i+1;j<=size;j++) {
          if(temp2.next == temp1) {
            return temp1;
          }
          temp2 = temp2.next;
        }
        temp1 = temp1.next;
      }
      return null;
   }
}
public class LoopBeginning {
   
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.insert(1);
    list.insert(6);
    list.insert(7);
    list.insert(8);
    list.insert(4);
    //Forming a loop
    Node temp = list.start;
    for(int i=1;i<=4 && i<list.size;i++) {
      if(i==4) {
        list.end.next = temp;
        list.end = temp;
        list.size++;
      }
      temp = temp.next;

    }
    System.out.print("List");
    list.print();
    Node loop_beginning = new Node();
    try {
      loop_beginning = list.findLoopBeginning();
      System.out.print("\nBeginning of loop: "+loop_beginning.data);
    } catch(NullPointerException e) {
      System.out.print("List has no loops");
    }
  }
}