import java.util.Scanner;

public class Queue {
    private int end = 0;
    private int start = 0;
    private int size;
    private int[] array;

    public Queue(int size) {
        this.size = size;
        array = new int[size];
    }
    public void push(int number){
        if (end != size){
            array[end++] = number;
        }
    }

    public int pop(){
        if (start != end){
            return array[start++];
        }
        return 0;
    }
    public int front(){
        if (start != 0){
            return array[start];
        }
        return 0;
    }
    public String toString (){
        StringBuilder str = new StringBuilder();
        for (int i = start; i < end; i++) {
            str.append(array[i]).append(" ");
        }
        return String.valueOf(str);
    }

    public int size (){
        return end - start;
    }

    public boolean isEmpty (){
        return end == start;
    }


    public void clear(){
        end = 0;
        start = 0;
    }
}