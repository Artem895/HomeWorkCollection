package collection;

import java.util.LinkedList;

public class Testing {
    public static void main(String[] args) {
        int kolvom=200;
        int n= 1000000;
        long start;
        long finish;
        long timeElapsed;
        start=System.nanoTime();
        MyLinkedList<Employ> myLinkedList= new MyLinkedList<Employ>();
        for (int i=0;i<kolvom;i++){
            String name="My"+i;
            int eage=i*5+1;
            Employ e=new Employ(name,eage,i);
            myLinkedList.add(e);
        }

        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время добавления в наносекундах   " +kolvom+" элементов в MyLinkedList");
        start=System.nanoTime();
       LinkedList<Employ> linkedList=new LinkedList<>();
        for (int i=0;i<kolvom;i++){
            String name="My"+i;
            int eage=i*5+1;
            Employ e=new Employ(name,eage,i);
            linkedList.add(e);
        }
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время добавления в наносекундах  " +kolvom+" элементов в LinkedList");
        System.out.println(myLinkedList);
        System.out.println(linkedList);
        int removenumber=199;
        start=System.nanoTime();
        myLinkedList.remove(removenumber);
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время удаления элемента номер " +removenumber+"  в MyLinkedList");
        start=System.nanoTime();
        linkedList.remove(removenumber);
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время удаления элемента номер " +removenumber+"  в LinkedList");
        MyLinkedList<String> myLinkedList2=new MyLinkedList<>();
        start=System.nanoTime();
        for (int i=0;i<kolvom;i++){
            myLinkedList2.add("Hello"+i);
        }
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время добавления в наносекундах   " +kolvom+" элементов в MyLinkedList");
        LinkedList<String> linkedList2=new LinkedList<>();
        start=System.nanoTime();
        for (int i=0;i<kolvom;i++){
            linkedList2.add("Hello"+i);
        }
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время добавления в наносекундах  " +kolvom+" элементов в LinkedList");
        int number=198;//element number
        start=System.nanoTime();
        myLinkedList2.get(number);
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(myLinkedList2.get(number));
        System.out.println(timeElapsed+"-Время поиска элемента номер " +number+"  в MyLinkedList");
        start=System.nanoTime();
        linkedList2.get(number);
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время поиска элемента номер " +number+"  в LinkedList");
        System.out.println(linkedList2.get(number));
        start=System.nanoTime();
        myLinkedList2.remove(removenumber);
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время удаления элемента номер " +removenumber+"  в MyLinkedList");
        start=System.nanoTime();
        linkedList2.remove(removenumber);
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время удаления элемента номер " +removenumber+"  в LinkedList");
    }
}
