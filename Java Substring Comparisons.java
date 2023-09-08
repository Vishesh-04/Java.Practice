import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int a = sc.nextInt();
        sc.close();
        int l = n.length();
        System.out.println(n.substring((l-a),(l-1)));
        System.out.println(n.substring(0,a));
        
    }
}
