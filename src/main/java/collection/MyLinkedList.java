package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<E> implements ILinkedList<E>{
    private E[] values;
    private int size=0;
    private Node<E> first;
    private Node<E> midle;
    private Node<E> last;
    public MyLinkedList() {
    }
    private static class Node<E> {
        E element;
        Node<E> nextNode;

        Node(E element, Node<E> nextNode) {
            this.element= element;
            this.nextNode = nextNode;

        }

    }
    @Override
    public void add(E element) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(element, null);
        last = newNode;
        if (l==null){
            first=newNode;
        }
        else {
            l.nextNode = newNode;
        }
        findmidle();
        size++;
    }

    @Override
    public void add(int index, E element) {
        if(index==size){
            add(element);
        }
        else{
          linkBefore(element,index);
        }
    }

    @Override
    public void clear() {
        for(int i=0;i<size-1;i++){
            Node<E> x=first;
            Node<E> xnext=x.nextNode;
            x.nextNode=null;
            x.element=null;
            x=xnext;
        }
        first=last=null;
        size=0;
    }

    @Override
    public E get(int index) {
        checkElementIndex(index);
        return node(index).element;
    }

    @Override
    public int indexOf(E element) {
        int index=0;
        if(element==null){
            for (Node<E> x = first; x != null; x = x.nextNode) {
                if (x.element == null)
                    return index;
                index++;
            }
        }
        else {
            for (Node<E> x = first; x != null; x = x.nextNode) {
                if (element.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        checkElementIndex(index);
        Node<E> el=node(index);
        Node<E> next=el.nextNode;
        if (index==0) {
            first = next;
        }else if (index==size) {
            last = node(index - 1);
        } else {
            Node<E> pred=node(index-1);
            pred.nextNode = next;
        }
        el.element=null;
        el.nextNode=null;
        size--;
        findmidle();
        return el.element;
    }

    @Override
    public E set(int index, E element) {
        checkElementIndex(index);
        Node<E> el=node(index);
        E oldelem=el.element;
        el.element=element;
        return oldelem;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] res=new Object[size];
        int i=0;
        for(Node<E> x=first;x!=null;x=x.nextNode){
            res[i]=x.element;
            i++;
        }
        return res;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if(a.length<size){
            a=(T[])java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        }
        int i=0;
        Object[] res = a;
        for(Node<E> x=first;x!=null;x=x.nextNode){
            res[i]=x.element;
            i++;
        }
        if(a.length>size){
            a[size]=null;
        }
        return a;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayIterator<E>(values);
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("MyLinkedList: ");
        for(Node<E> i=first;i!=null;i=i.nextNode){
            builder.append(i.element+" ");
        }
        return builder.toString();
    }
    Node<E> node(int index) {
        if(index < (size /2)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.nextNode;
            return x;
        } else if(index==((size-1)/2)){
            return midle;
        } else {
            Node<E> x = midle;
            for (int i = ((size-1)/2); i <index; i++)
                x = x.nextNode;
            return x;
        }
    }
    void linkBefore(E e, int index) {
        if(index==0){
            Node<E> elem=new Node<>(e,first);
            first=elem;
        }else{
        Node<E> changel=node(index);
        Node<E> predel=node((index-1));
        predel.nextNode= new Node<>(e,changel);
        }
        size++;
        findmidle();
    }
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }
    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }
    private void findmidle(){
        if(this.size==1){
            this.midle=this.first;
        } else {
            Node<E> x=this.first;
            for(int i=0;i<=((this.size-1)/2);i++){
                this.midle=x;
                x=x.nextNode;
            }
        }
    }
}
