import java.util.*;
class output{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product of 2 Numbers is : " +productOf2Number(a,b) );
    }
    public static int productOf2Number(int a, int b) {
        return a*b;
    }
}