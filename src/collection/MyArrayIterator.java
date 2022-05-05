package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class MyArrayIterator <E> implements Iterator<E> {
    private int index=0;
    E[] values;

    public MyArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index<values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
/*
Node<E> node(int index) {
    // assert isElementIndex(index);

    if (index < (size >> 1)) {
        Node<E> x = first;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
    } else {
       Node<E> x = last;
        for (int i = size - 1; i > index; i--)
            x = x.prev;
        return x;
    }
}*/
