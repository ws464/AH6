import java.util.List;
import java.util.LinkedList;
import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    // todo
    LinkedList<String> ret = new LinkedList<String>();
    Node<String> curr = head;
    while(curr != null){
      ret.add(curr.val);
      curr = curr.next;
    }
    return ret;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    System.out.println(Solution.linkedListValues(a)); 
    // -> [ "a", "b", "c", "d" ] 
  }
}
