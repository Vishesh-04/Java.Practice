package MultiThreading;
import java.util.*;



class MyThread1 extends Thread{
    public void run()
    {
        String name=Thread.currentThread().getName();
        if(name.equals("Calc"))
        cal();
        else
        Print();
    }
    public void cal(){
        System.out.println("Calculation Task Started");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();
        System.out.println("Please enter 2nd number");
        int num2=sc.nextInt();
        int res=num1+num2;

        System.out.println(res);
        System.out.println("Calculation Task Ended");

        System.out.println("****************************************************");
        sc.close();
    }
    public void Print(){
        System.out.println("Displaying important message task");
        try{
            for(int i=0;i<3;i++)
            {
                System.out.println("Focus is important to master skills");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
        finally
        {
            System.out.println("Displaying important message task ended");
        }
    }
}

public class MultiThread6 {
    
    public static void main(String[] args) {
        System.out.println("Main Thread started");

        MyThread1 thread1 = new MyThread1();

        MyThread1 thread2 = new MyThread1();

        thread1.setName("Calc");
        thread2.setName("Print");
        
        thread1.start();
        thread2.start();
    }
}
