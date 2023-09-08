import java.util.*;
class BSearch
{
    
    public static void main (String args []){
        Scanner sc= new Scanner(System.in);
        int A[] = new int [10];
        System.out.println("Fill Array");
        for (int i =0;i<10;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter number to Searched");
        int n= sc.nextInt();
        int l=0,u=9,m=0,f=0;
        while(l<=u){
            m=(l+u)/2;
            if (n==A[m]){
                f=1;
                break;
            }
            else if(n<A[m])
            u=m-1;
            else 
            l=m+1;
        }
        if(f==1)
        System.out.println(n+" is found at position "+(m+1));
        else 
        System.out.println(n+" is not found in Array");
    }
}