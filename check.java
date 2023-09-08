public class check {
    public static void main(String[] args) {
        String s = "Umbrella";
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='e')
            l = 1;
            else
            l = 0;
        }
        if(l == 1)
        System.out.println("e is present in String "+s);
        else
        System.out.println("e is not present in String "+s);
    }
}
