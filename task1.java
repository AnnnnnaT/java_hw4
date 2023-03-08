// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 
// Постараться не обращаться к листу по индексам.

import java.util.*;

public class task1{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,4,5,7,3,5};
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        System.out.println(list);
        list =  reverseList(list);
        System.out.println();
        System.out.println(list);
        
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list){
            LinkedList<Integer> newList = new LinkedList<>();
            while (list.size() > 0 ) {
                newList.add(list.pollLast());
            }
            return newList;
        }
}
