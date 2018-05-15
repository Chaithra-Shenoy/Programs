class Link
{
private  Link head;
private  Link tail;
private  Link next;
public  void addLast(Link newNode) {

            if (newNode == null)

                  return;

            else {

                  newNode.next = null;

                  if (head == null) {

                        head = newNode;

                        tail = newNode;

                  } else {

                        tail.next = newNode;

                        tail = newNode;

                  }

            }

      }
public void addFirst(Link newNode) {

            if (newNode == null)

                  return;

            else {

                  if (head == null) {

                        newNode.next = null;

                        head = newNode;

                        tail = newNode;

                  } else {

                        newNode.next = head;

                        head = newNode;

                  }

            }

      }
public static void main(String[] args)
{

addFirst("chaithra");
System.out.println("Data inserted");
addLast((Link)50);
System.out.println("data added at tha last");
}
}


