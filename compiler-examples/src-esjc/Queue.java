class Data {
  public int i;
}

class LinkedList {
  public LinkedNode head;

  public LinkedNode last;

  public int size;
}

class LinkedNode {
  public Data data;

  public LinkedNode next;
}

public class Queue {
  static void llAddLast(final LinkedList ll, final Data data) {
    StaticJavaLib.assertTrue((ll != null) && (data != null));

    ll.last.next = new LinkedNode();
    ll.last = ll.last.next;
    ll.last.data = data;
    ll.size++;
  }

  static boolean llIsEmpty(final LinkedList ll) {
    StaticJavaLib.assertTrue(ll != null);

    return ll.size == 0;
  }

  static LinkedList llNewLinkedList() {
    LinkedList result;

    result = new LinkedList();
    result.head = new LinkedNode();
    result.last = result.head;

    return result;
  }

  static Data llRemoveFirst(final LinkedList ll) {
    Data result;

    StaticJavaLib.assertTrue(ll.size > 0);
    result = ll.head.next.data;
    ll.head = ll.head.next;
    ll.size--;

    return result;
  }

  public static void main(final String[] args) {
    LinkedList ll;
    Data d;
    int i;

    ll = Queue.llNewLinkedList();

    for (i = 0; i < 10; i++) {
      d = new Data();
      d.i = i + 1;
      Queue.llAddLast(ll, d);
    }

    while (!Queue.llIsEmpty(ll)) {
      d = Queue.llRemoveFirst(ll);
      StaticJavaLib.println(d.i);
    }
  }
}
