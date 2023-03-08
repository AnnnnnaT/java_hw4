import java.util.LinkedList;

public class Queue {
    // enqueue() - помещает элемент в конец очереди, 
    // dequeue() - возвращает первый элемент из очереди и удаляет его, 
    // first() - возвращает первый элемент из очереди, не удаляя.

    LinkedList<Integer> list = new LinkedList<>();
    
    void enqueue(int elem){

        if(list.size()==0){
            list.addFirst(elem);
        }
        list.addLast(elem);
    }

    Integer dequeue(){
        if(list.size()!=0){
            return list.pollFirst();
        }
        return null;
    }

    Integer first(){
        if(list.size()!=0){
            return list.getFirst();
        }
        return null;
    }
}
