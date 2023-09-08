package MultiThreading;

/**
 * MultiThread1
 */
public class MultiThread1 {

    public static void main(String[] args) {
        System.out.println("Main Thread");
        String n= Thread.currentThread().getName();
        System.out.println("Before");
        System.out.println("The name of Current Thread = "+n);
        System.out.println("The Priority of Current Thread = "+Thread.currentThread().getPriority());
        System.out.println("After");
        Thread t= Thread.currentThread();
        t.setName("PW");
        t.setPriority(1);
        String n1= Thread.currentThread().getName();
        System.out.println("The name of Current Thread = "+n1);
        System.out.println("The Priority of Current Thread = "+Thread.currentThread().getPriority());
    }
}