package iterator;

public interface List<T> {
    void add(T element);
	void put(T element, int position);
	void remove(int position);
	int find(T element);
	T get(int index);
}
