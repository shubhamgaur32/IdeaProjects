abstract class Bike{
    Bike(){
        System.out.println("Bike Created Successfully");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear Changed");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("Running Smoothly");
    }
}


public class AbstractionTest2 {
    public static void main(String[] args) {
        Bike obj=new Honda();
        obj.run();
        obj.changeGear();
    }
}
