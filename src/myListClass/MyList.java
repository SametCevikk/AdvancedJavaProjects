package myListClass;

import java.util.Arrays;

public class MyList<T> {

    private int capacity = 10;

    private Object[] elements;
    int size;

    public MyList() {
        elements = new Object[capacity];
        size = 0;
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }


    //Used to add elements to the array of a class
    public void add(T element) {
        if (size == elements.length) {
            increaseCapacity();
            elements[size++] = element;
        } else {
            elements[size++] = element;
        }
    }

    //doubles the array size
    public void increaseCapacity() {
        elements = Arrays.copyOf(elements, elements.length * 2);
        capacity *= 2;
    }

    //Returns the number of elements in the array.
    public int size() {
        return size;
    }

    //Returns the capacity value of the array.
    public int getCapacity() {
        return capacity;
    }

    //Returns the value at the given index. If an invalid index is entered, it returns null.
    public T get(int index) {
        if (index >= 0 && index < size) {
            return (T) elements[index];
        } else {
            return null;
        }
    }

    //Deletes the data at the given index and shifts the data after the deleted index to the left.
    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size-1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    //Replaces the data in the given index with a new one.
    public void set(int index, T element) {
        if (index >= 0 && index < size) {
            elements[index] = element;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    //A method that lists the elements in the array of the class.
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");


        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    //Returns the index of the object given in the parameter in the list. If the object is not in the list, returns -1.
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    //Returns the last index of the specified item in the list. Returns -1 if the object is not in the list.
    public int lastIndexOf(T element) {
        for (int i = size - 1; i >= 0; i--) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    //Tells whether the list is empty.
    public boolean isEmpty() {
        if (elements[0] == null) {
            return true;
        } else {
            return false;
        }
    }

    //Combines the elements in the list into an array in the same order.
    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        for (int i = 0; i < size ; i++) {
            array[i] = (T) elements[i];
        }
        return array;
    }

    //Deletes all items in the list, making it an empty list.
    public void clear() {
        for (int i = 0; i < size; i++) {

            elements[i] = null;

        }
        size = 0;


    }

    //A list of index ranges given in the parameter is returned.
    public MyList<T> subList(int startIndex, int finishIndex) {
        if (startIndex < 0 || finishIndex > size || startIndex > finishIndex) {
            throw new IndexOutOfBoundsException();
        }
        MyList<T> list = new MyList<>();

        for (int i = startIndex; i < finishIndex; i++) {
            list.add((T) elements[i]);

        }
        return list;
    }

    //Tells whether the value given in the parameter is in the array.
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

}
