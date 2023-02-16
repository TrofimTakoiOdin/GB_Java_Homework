package HW4;

import java.util.Arrays;
import java.util.LinkedList;

public class QueueLinkedLIst {
    public static void main(String[] args) {
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        enqueue(6);
        System.out.println(Arrays.toString(lst.toArray()));
        System.out.println(First());
        System.out.printf("Первый удаленный элемент из очереди %d\n", dequeue());
        System.out.println(Arrays.toString(lst.toArray()));

    }
    private static LinkedList<Integer> lst = new LinkedList<>();
    private static void enqueue(int elem) {
        lst.addLast(elem);
    }
    private static int dequeue() {
        if (lst.isEmpty()) throw new IllegalStateException("Стэк пуст, милорд!");
        return lst.removeFirst();
    }
    private static int First() {
        if (lst.isEmpty()) throw new IllegalStateException("Стэк пуст, милорд!");
        return lst.peekFirst();
    }
}
