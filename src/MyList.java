import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    private List<T> myList;

    public MyList() {
        myList = new ArrayList<>();
    }

    public MyList(List<T> myList) {
        this.myList = myList;
    }

    public List<T> getMyList() {
        return myList;
    }

    public void setMyList(List<T> myList) {
        this.myList = myList;
    }

    public void manageList(T e) {
        for (int i = 0; i < 10; i++) {
            myList.add(i, e);
        }
//        myList.remove(0);
//        myList.remove(0);
//        myList.remove(myList.size()-1);

        List<T> result = new ArrayList<>();
        for (int i = 2; i < myList.size()-1; i++) {
            result.add(myList.get(i));
        }
        myList = result;
        System.out.println(myList);
    }

    @Override
    public String toString() {
        return "MyList{" +
                "myList=" + myList +
                '}';
    }
}
