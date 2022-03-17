package Mosh;

import java.util.Objects;

public class GenericList<T extends Number & Cloneable> {
    private T[] items = (T[]) new Object[10];
    private int count;
    public void add(T item){
        items[count++]= item;
    }
    public T get(int index){
        return items[index];
    }
}
//compiler replace T with objects if there is no constraints
//<T extends Number>  add constraints, now T is Number class