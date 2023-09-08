import java.util.*;
class Ques{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        String A[] = new String [50];
        String B[] = new String [50];
        for(int i=0;i<50;i++){
            System.out.println("Enter Country");
            A[i]= sc.nextLine();
            System.out.println("Enter Capital");
            B[i]= sc.nextLine();
        }
        System.out.println("Enter Country to be searched");
        String c= sc.nextLine();
        for(int i=0;i<50;i++){
            if (c==A[i])
            System.out.println(A[i]+"\t"+B[i]);
            break;
        }
    }
}