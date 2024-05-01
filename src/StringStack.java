class StringStack {
    int index;
    String[] array;

    public StringStack(int size) {
        array = new String[size];
        index = 0;
    }

    public void push(String elem) {
        array[index++] = elem;
    }

    public String pop() {
        return array[--index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public String peek() {
        return array[index - 1];
    }
}