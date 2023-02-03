import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyList<String> ml1 = new MyList<>();
        ml1.manageList("Hello");

        System.out.println();

        MyList<Integer> ml2 = new MyList<>();
        ml2.manageList(100);
    }
}
