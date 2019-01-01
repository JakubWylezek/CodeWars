package double_sort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class DoubleSort {
    public static Object[] dbSort(Object[] a){
       List<Integer> digits = new LinkedList<>();
       List<String> leathers = new LinkedList<>();

       for(Object o : a) {
           if(o.getClass() != String.class)
               digits.add((Integer) o);
           else
               leathers.add((String) o);
       }
       List<Object> objects = new LinkedList<>();
       Collections.sort(digits);
       Collections.sort(leathers);
       objects.addAll(digits);
       objects.addAll(leathers);

       return objects.toArray();

    }
}

public class Main {

    public static void main(String[] args) {
        Object[] array = DoubleSort.dbSort(new Object[]{"Banana", "Orange", "Apple", "Mango", 0, 2, 2});
        for(Object o : array) {
            System.out.println(o);
        }
    }
}
