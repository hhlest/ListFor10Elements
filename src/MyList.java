import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList<T> implements Iterable {
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

        List<T> result = new ArrayList<>();
        for (int i = 2; i < myList.size()-1; i++) {
            result.add(myList.get(i));
        }
        myList = result;

        Iterator<T> it = myList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return myList.iterator();
    }

    @Override
    public String toString() {
        return "MyList{" +
                "myList=" + myList +
                '}';
    }
}
