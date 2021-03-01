import java.util.*;
public class CollectionEx3 {
    public static void main(String[] args) {
        Vector<String> v=new Vector<String>();
        v.add("Ravi");
        v.add("Vijay");
        v.add("Shubham");
        v.add("Gaur");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
