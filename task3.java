import java.util.*;

// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

public class task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,5,7,3,5};
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        Iterator<Integer> iter = list.iterator();
        int count = 0;
        while(iter.hasNext()){
            count+=iter.next();
        }
        System.out.println(count);
        }
}
