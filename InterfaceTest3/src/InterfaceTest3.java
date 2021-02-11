interface Printable{
    void print();
}
interface Showable extends Printable{
    void show();
}
class InterfaceTest3 implements Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        InterfaceTest3 obj = new InterfaceTest3();
        obj.print();
        obj.show();
    }
} 