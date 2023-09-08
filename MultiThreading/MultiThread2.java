package MultiThreading;


class MyThread extends Thread
{
    public void run(){
        System.out.println("Child Thread");
}
}



public class MultiThread2 {
    
    public static void main(String[] args) {
        System.out.println("Main Thread");
        MyThread obj = new MyThread();
        obj.start();
    }
}