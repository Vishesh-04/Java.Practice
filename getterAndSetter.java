import java.util.*;
class Get{
    private int age;
    private String name;
    //Generate getter and setter function by right click -> source action -> generate getter and setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    
}
class getterAndSetter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        sc.close();
        Get obj=new Get();
        obj.setAge(age);
        obj.setName(name);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}