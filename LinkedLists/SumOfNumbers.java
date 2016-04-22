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
}  
public class SumOfNumbers {
  public static SinglyLinkedList sum(SinglyLinkedList num1,SinglyLinkedList num2) {
      SinglyLinkedList result = new SinglyLinkedList();
      int rem = 0;
      int add = 0,a1=0,a2=0;
      int maxsize = Math.max(num1.size,num2.size);
      for(int i=1;i<=maxsize;i++) {
        a1 = (num1.start!=null)?num1.start.data:0;
        a2 = (num2.start!=null)?num2.start.data:0;
        add = a1 + a2 + rem;
        rem =0;
        if(add<10) {
          result.insert(add);
        } else {
          result.insert(add%10);
          rem = add/10; 
        }
        
        if(num1.start !=null) {
          num1.start = num1.start.next;
        }
        if(num2.start !=null) {
          num2.start = num2.start.next;
        }
      }
      if(rem>0) {
        result.insert(rem);
      }
      return result;
   }
  public static void main(String[] args) {
    SinglyLinkedList num1 = new SinglyLinkedList();
    SinglyLinkedList num2 = new SinglyLinkedList();
    num2.insert(9);
    num2.insert(9);
    num2.insert(9);
    num1.insert(1);
    num1.insert(0);
    //num2.insert(2);
    System.out.print("\nNum1 : ");
    num1.print();
    System.out.print("\nNum2 : ");
    num2.print();
    SinglyLinkedList sum = sum(num1,num2);
    System.out.print("\nSum ");
    sum.print();
   }
}