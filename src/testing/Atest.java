package testing;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Atest {
    public static  void main(String[] args) throws IOException {
        int valdata=30;
        String res,content;
        int memory;
        int kolvoofremovedata=5;
        int removeindex=23;
        int steporremovindex=10;
        int insertindex=10;
        int insertindexstep=10;
        int kolvoinsert=4;
        int kolvo=100;
        long start;
        long finish;
        long timestemp1,timestemp2;
        ArrayList<String> arrayList=new ArrayList<>();
        LinkedList<String> linkedList=new LinkedList<>();
        PrintWriter writer = new PrintWriter(new File("src/testing/data/a.csv"));
        writer.write("ArrayList,LinkedList\n");
        for(int j=0;j<valdata;j++){
            start=System.nanoTime();
            for(int i=0;i<kolvo;i++){
                arrayList.add("Object number " + i);
            }
            finish=System.nanoTime();
            timestemp1=finish-start;
            start=System.nanoTime();
            for(int i=0;i<kolvo;i++){
                linkedList.add("Object number " + i);
            }
            finish=System.nanoTime();
            timestemp2=finish-start;
            res=timestemp1+","+timestemp2+"\n";
            writer.write(res);
        }
        writer.close();
        PrintWriter writer1 = new PrintWriter(new File("src/testing/data/ainsert.csv"));
        writer1.write("ArrayList,LinkedList\n");
        for(int j=0;j<valdata;j++){
            memory=insertindex;
            start=System.nanoTime();
            for(int i=0;i<kolvoinsert;i++){
                content="Object number " + i;
                arrayList.add(insertindex,content);
                insertindex+=insertindexstep;
            }
            finish=System.nanoTime();
            insertindex=memory;
            timestemp1=finish-start;
            start=System.nanoTime();
            for(int i=0;i<kolvoinsert;i++){
                content="Object number " + i;
                linkedList.add(insertindex,content);
                insertindex+=insertindexstep;
            }
            finish=System.nanoTime();
            timestemp2=finish-start;
            res=timestemp1+","+timestemp2+"\n";
            writer1.write(res);
        }
        writer1.close();
        PrintWriter writer2 = new PrintWriter(new File("src/testing/data/aremove.csv"));
        writer2.write("ArrayList,LinkedList\n");
        for(int j=0;j<valdata;j++){
            memory=removeindex;
            start=System.nanoTime();
            for(int i=0;i<kolvoofremovedata;i++){
                arrayList.remove(removeindex);
                removeindex+=steporremovindex;
            }
            finish=System.nanoTime();
            timestemp1=finish-start;
            removeindex=memory;
            start=System.nanoTime();
            for(int i=0;i<kolvoofremovedata;i++){
                linkedList.remove(removeindex);
                removeindex+=steporremovindex;
            }
            finish=System.nanoTime();
            timestemp2=finish-start;
            res=timestemp1+","+timestemp2+"\n";
            writer2.write(res);
        }
        writer2.close();
        System.out.println("All well done");


    }
}
