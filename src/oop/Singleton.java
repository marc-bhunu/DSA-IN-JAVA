package oop;

public class Singleton {

    static int id;
    static String name;
    static int age;

    private static Singleton instatce;

    private Singleton(int id, String name, int age) {
        Singleton.id = id;
        Singleton.name = name;
        Singleton.age = age;

    }

    public static Singleton getInstance() {
        if (instatce == null) {
            instatce = new Singleton(12, "Kimberly", 34);
        }
        return instatce;
    }
}
