package testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Ctest {
    public static void main(String[] args) throws FileNotFoundException {
        //HashMap, LinkedHashMap, TreeMap
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
        long finish,start,timestemp1,timestemp2,timestemp3;
        HashMap<Integer,String> hashMap=new HashMap<>();
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        PrintWriter writer = new PrintWriter(new File("src/testing/data/cadd.csv"));
        writer.write("HashMap, LinkedHashMap, TreeMap\n");
        for(int j=0;j<valdata;j++){
            start=System.nanoTime();
            for(int i=0;i<kolvo;i++){
                hashMap.put(i,"Object number " + i);
            }
            finish=System.nanoTime();
            timestemp1=finish-start;
            start=System.nanoTime();
            for(int i=0;i<kolvo;i++){
                linkedHashMap.put(i,"Object number " + i);
            }
            finish=System.nanoTime();
            timestemp2=finish-start;
            start=System.nanoTime();
            for(int i=0;i<kolvo;i++){
                treeMap.put(i,"Object number " + i);
            }
            finish=System.nanoTime();
            timestemp3=finish-start;
            res=timestemp1+","+timestemp2+","+timestemp3+"\n";
            writer.write(res);
        }
        writer.close();
        PrintWriter writer1 = new PrintWriter(new File("src/testing/data/cinsert.csv"));
        writer1.write("HashMap, LinkedHashMap, TreeMap\n");
        for(int j=0;j<valdata;j++){
            memory=insertindex;
            start=System.nanoTime();
            for(int i=0;i<kolvoinsert;i++){
                hashMap.put(insertindex,"hello");
                insertindex+=insertindexstep;
            }
            finish=System.nanoTime();
            insertindex=memory;
            timestemp1=finish-start;
            start=System.nanoTime();
            for(int i=0;i<kolvoinsert;i++){
                linkedHashMap.put(insertindex,"hello");
                insertindex+=insertindexstep;
            }
            finish=System.nanoTime();
            timestemp2=finish-start;
            insertindex=memory;
            start=System.nanoTime();
            for(int i=0;i<kolvoinsert;i++){
                treeMap.put(insertindex,"hello");
                insertindex+=insertindexstep;
            }
            finish=System.nanoTime();
            timestemp3=finish-start;
            res=timestemp1+","+timestemp2+","+timestemp3+"\n";
            writer1.write(res);
        }
        writer1.close();
        PrintWriter writer2 = new PrintWriter(new File("src/testing/data/cremove.csv"));
        writer2.write("HashMap, LinkedHashMap, TreeMap\n");
        for(int j=0;j<valdata;j++){
            memory=removeindex;
            start=System.nanoTime();
            for(int i=0;i<kolvoofremovedata;i++){
                hashMap.remove(removeindex);
                removeindex+=steporremovindex;
            }
            finish=System.nanoTime();
            timestemp1=finish-start;
            removeindex=memory;
            start=System.nanoTime();
            for(int i=0;i<kolvoofremovedata;i++){
                linkedHashMap.remove(removeindex);
                removeindex+=steporremovindex;

            }
            finish=System.nanoTime();
            timestemp2=finish-start;
            removeindex=memory;
            start=System.nanoTime();
            for(int i=0;i<kolvoofremovedata;i++){
                treeMap.remove(removeindex);
                removeindex+=steporremovindex;
            }
            finish=System.nanoTime();
            timestemp3=finish-start;
            res=timestemp1+","+timestemp2+","+timestemp3+"\n";
            writer2.write(res);
        }
        writer2.close();
        System.out.println("All well done");
    }
}
