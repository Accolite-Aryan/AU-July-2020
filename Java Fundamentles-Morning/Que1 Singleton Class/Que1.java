<<<<<<< HEAD
class Singleton {
    private volatile static Singleton single_instance;
    public String s;
    private Singleton() {
        // preventing Singleton object instantiation from outside
        s="Hello I am a string part of Singleton class";
    }
    //double locking
    public static Singleton getInstance() { if (single_instance == null) {
        synchronized (Singleton.class) {
            if (single_instance == null) {
                single_instance = new Singleton(); }
        }
    }
        return single_instance;
    }
}

public class Que1 {
    public static void main(String args[])
    {

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}
=======
class Singleton {
    private volatile static Singleton single_instance;
    public String s;
    private Singleton() {
        // preventing Singleton object instantiation from outside
        s="Hello I am a string part of Singleton class";
    }
    //double locking
    public static Singleton getInstance() { if (single_instance == null) {
        synchronized (Singleton.class) {
            if (single_instance == null) {
                single_instance = new Singleton(); }
        }
    }
        return single_instance;
    }
}

public class Que1 {
    public static void main(String args[])
    {

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}
>>>>>>> b5515d0... Adv Java
