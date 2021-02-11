abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing circle");
    }
}

public class AbstractionTest1 {
    public static void main(String[] args) {
        Shape s;
        s=new Circle();
        s.draw();
    }
}
