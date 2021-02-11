public class RTUpcasting {
    void run(){
        System.out.println("running");
    }

}
class Splendor extends RTUpcasting{
    void run(){
        System.out.println("running safely with 60km");
    }

    public static void main(String[] args) {
        RTUpcasting b=new Splendor();//Upcasting
        b.run();
    }
}
