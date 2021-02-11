class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class BabyDog extends Dog{
    void sleep(){
        System.out.println("Sleeping...");
    }
}
class TestMultilevelInheritance{
    public static void main(String[] args) {
        BabyDog b=new BabyDog();
        b.sleep();
        b.bark();
        b.eat();
    }
}