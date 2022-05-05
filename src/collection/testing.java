package collection;

import java.util.LinkedList;

public class testing {
    public static void main(String[] args) {
        int kolvom=200;
        int n= 1000000;
        long start;
        long finish;
        long timeElapsed;
        start=System.nanoTime();
        MyLinkedList<Employ> myLinkedList=new MyLinkedList<>();
        for (int i=0;i<kolvom;i++){
            String name="My"+i;
            int eage=i*5+1;
            Employ e=new Employ(name,eage,i);
            myLinkedList.add(e);
        }
        /*MyLinkedList<String> myLinkedList=new MyLinkedList<>();
        for (int i=0;i<kolvom;i++){
            myLinkedList.add("Hello"+i);
        }*/
        finish=System.nanoTime();
        timeElapsed=finish-start;
        //System.out.println(timeElapsed+"-Время добавления в наносекундах   " +kolvom+" элементов в MyLinkedList");
        start=System.nanoTime();
       LinkedList<Employ> linkedList=new LinkedList<>();
        for (int i=0;i<kolvom;i++){
            String name="My"+i;
            int eage=i*5+1;
            Employ e=new Employ(name,eage,i);
            linkedList.add(e);
        }
        /*LinkedList<String> linkedList=new LinkedList<>();
        for (int i=0;i<kolvom;i++){
            linkedList.add("Hello"+i);
        }*/
        finish=System.nanoTime();
        timeElapsed=finish-start;
        //System.out.println(timeElapsed+"-Время добавления в наносекундах  " +kolvom+" элементов в LinkedList");
        System.out.println(myLinkedList);
        System.out.println(linkedList);
        /*int number=198;//element number
        start=System.nanoTime();
        myLinkedList.get(number);
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(myLinkedList.get(number));
        System.out.println(timeElapsed+"-Время поиска элемента номер " +number+"  в MyLinkedList");
        start=System.nanoTime();
        linkedList.get(number);
        finish=System.nanoTime();
        timeElapsed=finish-start;
        System.out.println(timeElapsed+"-Время поиска элемента номер " +number+"  в LinkedList");
        System.out.println(linkedList.get(number));*/
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
    }
}
