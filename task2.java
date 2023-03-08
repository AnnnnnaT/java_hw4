// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

public class task2 {
    public static void main(String[] args){

        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(90);
        queue.enqueue(6327);
        queue.enqueue(4);
        
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
    }
}
