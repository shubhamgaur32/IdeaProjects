import java.util.*;
public class CollectionEx1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Shubham");
        list.add("Gaur");
        //Traversing list through Iterator
        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
