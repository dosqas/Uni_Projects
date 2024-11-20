package cz.cuni.mff.java.hw.hashtable;

import java.util.Iterator;

/**
 * DynamicArray is a resizable array of SinglyLinkedLists. Used for the internal representation of the HashTable.
 */
public class DynamicArray implements IDynamicArray {
    private SinglyLinkedList[] array;
    private int capacity;
    private int size;

    /**
     * Constructs a new DynamicArray with a starting capacity of 10.
     */
    public DynamicArray() {
        capacity = 10;
        array = new SinglyLinkedList[capacity];
        size = 0;
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        array = new SinglyLinkedList[capacity];
        size = 0;
    }

    /**
     * Adds a SinglyLinkedList to the DynamicArray.
     *
     * @param value the SinglyLinkedList to add
     */
    public void add(SinglyLinkedList value) {
        array[size++] = value;
    }

    /**
     * Returns the SinglyLinkedList at the specified index.
     *
     * @param i the index of the SinglyLinkedList to return
     * @return the SinglyLinkedList at the specified index
     */
    public SinglyLinkedList get(int i) {
        if (i >= size) {
            return null;
        }
        return array[i];
    }

    /**
     * Returns the number of SinglyLinkedLists in the DynamicArray.
     *
     * @return the number of SinglyLinkedLists in the DynamicArray
     */
    public int size() {
        return size;
    }

    /**
     * Returns the capacity of the DynamicArray.
     *
     * @return the capacity of the DynamicArray
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Returns an iterator over the SinglyLinkedLists in the DynamicArray.
     *
     * @return an iterator over the SinglyLinkedLists in the DynamicArray
     */
    @Override
    public Iterator<SinglyLinkedList> iterator() {
        return new Iterator<>() {
            private int index = 0;

            /**
             * Returns true if there are more SinglyLinkedLists to iterate over.
             *
             * @return true if there are more SinglyLinkedLists to iterate over
             */
            @Override
            public boolean hasNext() {
                return index < size;
            }

            /**
             * Returns the next SinglyLinkedList in the iteration.
             *
             * @return the next SinglyLinkedList in the iteration
             */
            @Override
            public SinglyLinkedList next() {
                return array[index++];
            }
        };
    }
}