public class panagram {
    public static void main(String[] args) {
        String str= "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        String s=str.su
        str=str.replace(" ", "");
        char []ch = str.toCharArray();
        int ar []=new int [26];
        for (int i=0;i<ch.length;i++){
            ar[ch[i]-65]++;
        }
        int k=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                k++;
            }
        }
        if(k==0){
            System.out.println("The String is a Pangram");
        }
        else{
            System.out.println("The String is not a Pangram");
        }
        Array.sor

    }
}
