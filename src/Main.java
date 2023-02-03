import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<String> ml1 = new MyList<>();
        ml1.manageList("Hello");

        MyList<Integer> ml2 = new MyList<>();
        ml2.manageList(100);
    }
}
