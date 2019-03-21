package Singleton;

public class Test {

    public static void main(String[] args) {

        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        log1.setName("Joey");
        System.out.println(log2.getName());
    }
}

