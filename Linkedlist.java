
import java.util.*;   
class Linkedlist
{
    private String data;
    private Linkedlist nextNode;
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        insertFirst(data);
    }


    public Linkedlist getNextNode() {
        return nextNode;

    }
    public void setNextNode(Linkedlist nextNode) {
        this.nextNode = nextNode;
        insert("deena",1);
    }

    public void insertFirst(String data){

        insert(data, 0);


 
    }
    public void insert(String data, int position){
        System.out.println("data   "+data);
        System.out.println("position   "+position);

        }

    public static void main(String[] arg){
        String j;
        Linkedlist n = new Linkedlist();
        System.out.println("Enter the name to be inserted");
        Scanner d=new Scanner(System.in);
        j=d.next();
        n.insertFirst(j);
        }
    }


