import java.util.*;
class array{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int A[] = new int [50];
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Enter Element No. "+(i+1));
            A[i] = sc.nextInt();
        }
        int size = 10;
        int c = 10;
        for(int i = 0 ; i < 10 ; i++){
            for(int j = i+1 ; j < 9 ; j++){
                if(A[i] == A[j]){
                    for(int k = j ; k < size+1 ; k++){
                        A[k] = A[k+1];
                    }
                    c--;
                    j--;
                }
            }
        }
        System.out.println("The Array without Repetition is : ");
        for(int i = 0 ; i < c ; i++){
            System.out.println(A[i] );
        }
    }
}