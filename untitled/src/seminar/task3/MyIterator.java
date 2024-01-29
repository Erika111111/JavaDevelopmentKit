package seminar.task3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class MyIterator<T> implements Iterator<T> {
    private List<T> list;
    private int index;

    public MyIterator(List<T> list) {
        this.list = list;
    }
    // метод из массива делает лист
    public MyIterator(T[]arr){
        list = Arrays.asList(arr);
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }
}
