public class ThreadEx1 extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadEx1 t1= new ThreadEx1();
        t1.start();
    }
}
