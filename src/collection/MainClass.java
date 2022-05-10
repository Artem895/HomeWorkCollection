package collection;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList=new MyLinkedList<>();
        myLinkedList.add("Hello");
        myLinkedList.add("Hello1");
        myLinkedList.add("Hello2");
        myLinkedList.add("Hello3");
        myLinkedList.add("Hello4");
        myLinkedList.add("Hello5");
        System.out.println(myLinkedList.get(4));
        System.out.println(myLinkedList);
        myLinkedList.remove(4);
        System.out.println(myLinkedList);
        myLinkedList.add(3,"InsertHello");
        myLinkedList.add(1,"InsertHello");
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.indexOf("InsertHello"));
        myLinkedList.set(3,"SetHello");
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());
        Object[] res=myLinkedList.toArray();
        for(Object s:res){
            System.out.println(s);
        }
        String[] nextres=myLinkedList.toArray( new String[1]);
        for (String s:nextres){
            System.out.println(s);
        }
        myLinkedList.clear();
        System.out.println(myLinkedList);

    }
}
