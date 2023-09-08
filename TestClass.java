import java.util.*;
    class TestClass {
        public static void main(String args[] ) throws Exception {
            //BufferedReader
            Scanner sc = new Scanner (System.in);
            int N = sc.nextInt();
    
            if(N>=1 && N<=10){
                int A[] = new int [N];
                long sum = 0;
                for(int i = 0 ; i < N ; i++){
                    A[i] = sc.nextInt();
                    sum = sum + A[i];
                }
                System.out.println(sum);
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
