package com.company;

import java.util.Arrays;

public class Array {

    private int[] items;
    private int count;


    public Array(int size){
        items = new int[size];
    }


    public void insert(int value){
        if (items.length == count){
            int[] newItems = new int[count*2];

            //Java provides built-in methods, such as System.arraycopy() or Arrays.copyOf(), which are faster, more concise, and less error-prone.
            for (int i=0; i<items.length; i++)
                newItems[i] = items[i];

            items = newItems;
        }

        items[count++] = value;

    }

    public void removeAt(int index){
        if (0 <= index && index < count){
            for (int i = index; i < count; i++){
                items[i] = items[i+1];
            }
            count--;
        }else throw new IllegalArgumentException();
    }

    public int indexOf(int value){
        for (int i = 0; i<count; i++){
            if (value == items[i])
                return i;
        }
        return -1;
    }


    public void print(){
        System.out.println("Entire Array "+Arrays.toString(items));
        for (int i=0; i<count; i++)
            System.out.println(items[i]);
    }

}
