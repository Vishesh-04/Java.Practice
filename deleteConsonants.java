public class deleteConsonants {
    public static void main(String[] args) {
        String s = "Hello, have a good day";
        s=s.toLowerCase();
        String s1 = new String();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt();
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                s1=s1+ch;
            }
        }  
        System.out.println(s1);
    }
}
