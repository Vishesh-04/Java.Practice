import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    //     Scanner sc = new Scanner(System.in);
    //     String a= sc.nextLine();
    //     String b= sc.nextLine();
    //     sc.close();
    //     a=a.replace(" ","");
    //     b=b.replace(" ","");
    //     a=a.toLowerCase();
    //     b=b.toLowerCase();
    //     char ch1[]=a.toCharArray();
    //     char ch2[]=b.toCharArray();
    //     for(int i = 0; i < ch1.length; i++ ) {
    //      for(int j = i+1; j < ch1.length; j++) {
    //         if(ch1[i]>ch1[j]) {
    //            char temp = ch1[i];
    //            ch1[i] = ch1[j];
    //            ch1[j] = temp;
    //         }
    //      }
    //   }
    //   for(int i = 0; i < ch2.length; i++ ) {
    //      for(int j = i+1; j < ch2.length; j++) {
    //         if(ch2[i]>ch2[j]) {
    //            char temp = ch2[i];
    //            ch2[i] = ch2[j];
    //            ch2[j] = temp;
    //         }
    //      }
    //   }
    //     if(Arrays.equals(ch1,ch2)){
    //         System.out.println("Anagrams");
    //     }
    //     else{
    //         System.out.println("Not Anagrams");
    //     }
    
String s = "SACHIN TENDULKAR";

int len= s.trim().length(); 

System.out.println(len);
    }
}
