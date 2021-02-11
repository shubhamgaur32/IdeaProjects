interface Drawable{
    void draw();
    default void msg(){
        System.out.println("Default Method");
    }
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}


public class TestInterfaceDefault {
    public static void main(String[] args) {
        Drawable obj = new Rectangle();
        obj.draw();
        obj.msg();
    }
}
