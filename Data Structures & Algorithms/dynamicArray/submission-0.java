class DynamicArray {
    private int[] array;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (this.size == this.capacity) {
            resize();
        }

        this.array[size] = n;
        this.size++;
    }

    public int popback() {
        int lastElement = this.array[size - 1];
        this.size--;
        return lastElement;
    }

    private void resize() {
        this.capacity *= 2;

        int[] newArr = new int[capacity];

        for (int i = 0; i < size; i++) {
            newArr[i] = this.array[i];
        }

        this.array = newArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
