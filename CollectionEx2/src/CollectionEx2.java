import java.util.*;
public class CollectionEx2 {
    public static void main(String[] args) {
        LinkedList<String> lst=new LinkedList<String>();
        lst.add("Ravi");
        lst.add("Vijay");
        lst.add("Shubham");
        lst.add("Gaur");
        Iterator<String> itr=lst.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
