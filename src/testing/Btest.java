package testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Btest {
    public static void main(String[] args) throws FileNotFoundException {
        int valdata=30;
        String res;
        int removeindex=23;
        int kolvo=100;
        String[] valuewhithindex={"Object number 2","Object number 15","Object number 45","Object number 66","Object number 80"};
        long finish,start,timestemp1,timestemp2,timestemp3;
        HashSet<String> hashSet=new HashSet<>();
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        TreeSet<String> treeSet=new TreeSet<>();
        PrintWriter writer = new PrintWriter(new File("src/testing/data/badd.csv"));
        writer.write("HashSet,LinkedHashSet,TreeSet\n");
        for(int j=0;j<valdata;j++){
            start=System.nanoTime();
            for(int i=0;i<kolvo;i++){
                hashSet.add("Object number " + i);
            }
            finish=System.nanoTime();
            timestemp1=finish-start;
            start=System.nanoTime();
            for(int i=0;i<kolvo;i++){
                linkedHashSet.add("Object number " + i);
            }
            finish=System.nanoTime();
            timestemp2=finish-start;
            start=System.nanoTime();
            for(int i=0;i<kolvo;i++){
                treeSet.add("Object number " + i);
            }
            finish=System.nanoTime();
            timestemp3=finish-start;
            res=timestemp1+","+timestemp2+","+timestemp3+"\n";
            writer.write(res);
        }
        writer.close();
        ///нет вставки по индексу
        PrintWriter writer2 = new PrintWriter(new File("src/testing/data/bremove.csv"));
        writer2.write("HashSet,LinkedHashSet,TreeSet\n");
        for(int j=0;j<valuewhithindex.length;j++){
            start=System.nanoTime();
            for(int i=0;i<valuewhithindex.length;i++){
                hashSet.remove(valuewhithindex[i]);
            }
            finish=System.nanoTime();
            timestemp1=finish-start;
            start=System.nanoTime();
            for(int i=0;i<valuewhithindex.length;i++){
                linkedHashSet.remove(valuewhithindex[i]);
            }
            finish=System.nanoTime();
            timestemp2=finish-start;
            start=System.nanoTime();
            for(int i=0;i<valuewhithindex.length;i++){
                treeSet.remove(valuewhithindex[i]);
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
