import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<String> ml1 = new MyList<>();
        ml1.addTenElements("Hello");
        System.out.println(ml1);
        ml1.removeTwoFirstAndOneLast();
        System.out.println(ml1);

        MyList<Integer> ml2 = new MyList<>();
        ml2.addTenElements(100);
        System.out.println(ml2);
        ml2.removeTwoFirstAndOneLast();
        System.out.println(ml2);
    }
}
