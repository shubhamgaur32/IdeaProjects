public class ThreadEx2 implements Runnable{
    public void run() {
        System.out.println("Thread is Running...");
    }

    public static void main(String[] args) {
        ThreadEx2 obj=new ThreadEx2();
        Thread t2=new Thread(obj);
        t2.start();
    }
}

