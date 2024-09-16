/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {
    private Object[] elements;
    private int size;

    public MultiSet(int size) {
        elements = new Object[size];
        this.size = size;
    }

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    abstract void add(Integer item);

    // TODO finish adding abstract methods to fully describe what it means to be a MultiSet.
    abstract void remove(Integer item);
    abstract boolean contains(Integer item);
    abstract int size();
}
