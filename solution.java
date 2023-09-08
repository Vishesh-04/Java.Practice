// public class solution {
//     public static void main(String[] args) {
//         int a[] = new int [4];
//         double b[]=new double[4];
//         char ch []=new char[4];
//         String s[]=new String[4];
//         System.out.println(a[1]);
//         System.out.println(b[1]);
//         System.out.println(ch[1]);
//         System.out.println(s[1]);
//     }
// }

// class Solution {
//     public static void main(String[] args) {
//         // code here
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] numerator=new int[n];int[] denominator=new int[n];
//         for(int i=0; i<n ; i++){
//             numerator[i] = sc.nextInt();
//             denominator[i] = sc.nextInt();
//         }
//         sc.close();
//         int sum=0,k=0;
//         for(int i=0;i<n;i+=2)
//         {sum=0;
//             if(n>(i+1))
//             {
//                 for(int j=i;j<(i+2);j++)
//                 sum=sum+(numerator[i]/denominator[i]);
//             }
//             if(sum==1)
//             k++;
//         }
//         System.out.println(k);
//     }
// }
import java.util.*;

public class solution {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int p=scanner.nextInt();
    int f=1;
        for(int i=1;i<=n;i++){
        f=f*i;
        }
        System.out.println(f%p);
}
}