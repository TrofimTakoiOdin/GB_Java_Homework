package HW4;

import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        LinkedList<Integer> list = fillReversList(fillLinkedList(array));
        for (int el: list)
            System.out.printf("%d ", el);

    }
    static LinkedList fillLinkedList(int[] array){
        LinkedList<Integer> list = new LinkedList<>();
        for (int element:array) list.add(element);
        return list;
    }
    static LinkedList fillReversList(LinkedList<Integer> list){
        for (int i = 0; i < list.size()/2; i++) {
            int el = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-i-1, el);
        }
        return list;
    }
}
