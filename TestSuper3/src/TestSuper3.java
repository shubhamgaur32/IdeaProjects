class Animal{
    Animal(){
        System.out.println("Animal is Created");
    }
}
class Dog extends Animal{
    Dog(){
        //Here Super() is implicitly invoked by constructor
        System.out.println("Dog is Created");
    }
}


public class TestSuper3 {
    public static void main(String[] args) {
        Dog d=new Dog();
    }
}
