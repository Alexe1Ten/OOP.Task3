import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList implements Iterable<String>{
    private LinkedList<String> linkedList = new LinkedList<>();

    public void addFirst(String element) {
        this.linkedList.addFirst(element);
    }

    public void addLast(String element) {
        this.linkedList.addLast(element);
    }

    public void removeFirst() {
        linkedList.removeFirst();
    }

    public void removeLast() {
        linkedList.removeLast();
    }

    public String getFirst() {
        return linkedList.getFirst();
    }

    public String getLast() {
        return linkedList.getLast();
    }

    public LinkedList<String> getLinkedList() {
        return linkedList;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements Iterator<String> {
        private int currentIndex = 0;
        
        @Override
        public boolean hasNext() {
            return currentIndex < linkedList.size();
        }
        
        @Override
        public String next() {
            return linkedList.get(currentIndex++);
        }
    }

    @Override
    public String toString() {
        return getFirst();
    }
}
