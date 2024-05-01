public class Stack {

    private int[] array;

    private int index;

    public Stack(int size) {
        array = new int[size];
        index = 0;
    }

    public int pop(){
        if (index != 0)
            return array[--index];
        return 0;
    }

    public int peek(){
        if (index != 0)
            return array[index - 1];
        return 0;
    }

    public void push(int value){
        if (index != array.length)
            array[index++] = value;
    }

    public void clear(){
        index = 0;
    }

    public int size(){
        return index;
    }

    public String toString(){
        String line = "";
        for (int i = 0; i < index; i++) {
            line += array[i] + " ";
        }
        return line;
    }
}
