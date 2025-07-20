package OOPS.Generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T element){
        if (isFull()) {
            resize();
        }
        data[size++] = element;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed = (T) data[--size];
        data[size] = null; // to avoid memory leak
        return removed;
    }

    public T get(int index){
        return (T) data[index];
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.set(1, 100);
        System.out.println(list);

        CustomGenArrayList<String> strList = new CustomGenArrayList<>();
        strList.add("Hello");
        strList.add("World");
        System.out.println(strList);
    }
}
