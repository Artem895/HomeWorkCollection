package collection;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        long start=System.nanoTime();
        MyLinkedList<String> myLinkedList=new MyLinkedList<>();
        myLinkedList.add("Hello");
        myLinkedList.add("Hello1");
        myLinkedList.add("Hello2");
        myLinkedList.add("Hello3");
        myLinkedList.add("Hello4");
        myLinkedList.add("Hello5");
        long finish = System.nanoTime();
        long timeElapsed = finish-start;
        System.out.println(timeElapsed+"-Время добавления последнего MyLinkedList");
        start=System.nanoTime();
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("Hello1");
        linkedList.add("Hello2");
        linkedList.add("Hello3");
        linkedList.add("Hello4");
        linkedList.add("Hello5");
        finish=System.nanoTime();
        long timeElapsed1 = finish-start;
        System.out.println(timeElapsed1+"-Время добавления последнего LinkedList");
        start=System.nanoTime();
        System.out.println(myLinkedList.get(4));
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время поиска 4 элемента MyLinkedList");
        start=System.nanoTime();
        System.out.println(linkedList.get(4));
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время поиска 4 элемента LinkedList");
        start=System.nanoTime();
        myLinkedList.remove(4);
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время удаления 4 элемента MyLinkedList");
        start=System.nanoTime();
        linkedList.remove(4);
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время удаления 4 элемента LinkedList");

    }
}
