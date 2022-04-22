package generic;

@SuppressWarnings("unchecked")
public class ArrayList<T> implements List<T> {
    
    private T[] arr;
    //free element
    private int size = 0;
    private int capacity;

    private final int DEFAULT_ARRAYLIST_SIZE = 1000;

    public ArrayList() {
        this.arr = (T[]) new Object[DEFAULT_ARRAYLIST_SIZE];
        this.capacity = DEFAULT_ARRAYLIST_SIZE;
    }

    public ArrayList(int n) {
        if (n <= DEFAULT_ARRAYLIST_SIZE) {
            n = DEFAULT_ARRAYLIST_SIZE;
        } else {
            n = (n / DEFAULT_ARRAYLIST_SIZE + 1) * DEFAULT_ARRAYLIST_SIZE;
        }
        this.capacity = n;
        this.arr = (T[]) new Object[n];
    }

    @Override
    public void add(T element) {
        if (this.size < this.capacity) {
            this.arr[size] = element;
            ++this.size;
            return;
        }
        T[] temp = (T[]) new Object[this.capacity * 2];
        for (int i = 0; i < this.size; ++i) {
            temp[i] = this.arr[i];
        }
        this.arr = temp;
        this.arr[size] = element;
        ++this.size;
        this.capacity *= 2;
    }

    //in position, position = 1, n
    @Override
	public void put(T element, int position) {
        if (position - 1 >= this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (this.size >= this.capacity) {
            this.capacity *= 2;
        }
        T[] temp = (T[]) new Object[this.capacity];
        for (int i = 0; i < position - 1; ++i) {
            temp[i] = this.arr[i];
        }
        temp[position - 1] = element;
        for (int i = position; i <= this.size; ++i) {
            temp[i] = this.arr[i - 1];
        }
        this.arr = temp;
        ++this.size;
    }

    //position = 1, n
    @Override
	public void remove(int position) {
        if (position - 1 >= this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T[] temp = (T[]) new Object[this.capacity];
        for (int i = 0; i < position - 1; ++i) {
            temp[i] = this.arr[i];
        }
        for (int i = position; i < this.size; ++i) {
            temp[i - 1] = this.arr[i];
        }
        this.arr = temp;
        --this.size;
    }

    @Override
	public int find(T element) {
        for (int i = 0; i < this.size; ++i) {
            if (arr[i] == element) {
                return i + 1;
            }
        }
        return Integer.MIN_VALUE;
    }
    
    //index = 1, n
    @Override
	public T get(int index) {
        if (index - 1 >= this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.arr[index - 1];
    }
}
