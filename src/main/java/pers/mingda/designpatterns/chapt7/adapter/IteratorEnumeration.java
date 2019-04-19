package pers.mingda.designpatterns.chapt7.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class IteratorEnumeration implements Enumeration {

    Iterator iterator;

    public IteratorEnumeration(Iterator it) {
        this.iterator = it;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next();
    }
    
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        IteratorEnumeration ie = new IteratorEnumeration(ls.iterator());
        System.out.println(ie.hasMoreElements());
        ls.add("haha");
        System.out.println(ie.hasMoreElements());
    }

}