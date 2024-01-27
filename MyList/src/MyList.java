import java.util.Arrays;
public class MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private int capacity;
    private Object[] elements;

    public MyList() {
        this(DEFAULT_CAPACITY);
    }

    public MyList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }
        this.capacity = capacity;
        this.size = 0;
        this.elements = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (size == capacity) {
            increaseCapacity();
        }
        elements[size++] = data;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return (T) elements[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removed = get(index);
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
        return removed;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }
        T oldData = get(index);
        elements[index] = data;
        return oldData;
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (elements[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public T[] toArray() {
        return (T[]) Arrays.copyOf(elements, size);
    }

    public void clear() {
        Arrays.fill(elements, 0, size, null);
        size = 0;
    }

    public MyList<T> sublist(int start, int finish) {
        if (start < 0 || start >= size || finish <= start || finish > size) {
            throw new IllegalArgumentException("Invalid start or finish indices");
        }
        MyList<T> subList = new MyList<>(finish - start);
        for (int i = start; i < finish; i++) {
            subList.add(get(i));
        }
        return subList;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    private void increaseCapacity() {
        int newCapacity = capacity * 2;
        elements = Arrays.copyOf(elements, newCapacity);
        capacity = newCapacity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

