class Shape{
    void draw(){
        System.out.println("Drawing..");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle...");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square...");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle...");
    }
}

public class RTPShape {
    public static void main(String[] args) {
        Shape s;
        s=new Triangle();
        s.draw();
        s=new Square();
        s.draw();
        s=new Circle();
        s.draw();
    }

}
