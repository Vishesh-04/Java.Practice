interface Computer
{
    void compileCode();
    default void config()
    {

    }
}

class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("you got 5 errors");
    }
}

class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("you got 5 errors, faster");
    }
}

class Developer
{
    public void buildApp(Computer obj)
    {
        System.out.println("Building App");
        obj.compileCode();
    }  
}

public class Interface {
    public static void main(String[] args) {

        Computer obj = new Desktop();
        Computer obj1 = new Laptop();
        Developer dev = new Developer();
        dev.buildApp(obj);
        dev.buildApp(obj1);
    }
}