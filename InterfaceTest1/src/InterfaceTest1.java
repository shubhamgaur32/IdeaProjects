import org.w3c.dom.css.Rect;

interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

public class InterfaceTest1 {
    public static void main(String[] args) {
        Drawable d=new Rectangle();
        d.draw();
    }
}
