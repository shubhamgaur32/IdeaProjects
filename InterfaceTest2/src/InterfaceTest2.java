interface Printable{
    void print();
}
interface Showable{
    void show();
}
 public class InterfaceTest2 {
    public void print(){
        System.out.println("This is Printable");
    }
    public void show(){
        System.out.println("This is Showable");
    }

     public static void main(String[] args) {
         InterfaceTest2 obj=new InterfaceTest2();
         obj.print();
         obj.show();
     }
}
