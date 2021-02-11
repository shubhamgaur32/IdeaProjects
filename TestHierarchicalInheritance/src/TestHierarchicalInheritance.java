class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Meowing...");
    }
}
class TestHierarchicalInheritance{
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat();
        c.meow();
        //c.bark(); //This will give CT Error
    }
}