package singleton_pattern;

public class Client {
    public static void main(String[] args) {
//        Thanks to the empty constructor we can't execute following command:
//        Singleton singleton = new Singleton();
//        Instead what we have to do is to call the static method getInstance

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println("Is it the same instance? (singleton == singleton1) : " + (singleton == singleton1));
    }
}
