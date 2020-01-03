public class Singleton {

    private static final  Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("Objekt gebildet");
    }

    public static Singleton getSingleton() {
        return singleton;
    }

    // Singleton s = Singleton.getInstance(); will give you the only Object of the Singleton class
}
