import java.util.concurrent.LinkedBlockingDeque;

public class Cache<T> {
    private int n;
    private LinkedBlockingDeque<T> items;

    public Cache(int n) {       //Конструктор
        this.n = n;
        this.items = new LinkedBlockingDeque<T>(n+1);
    }

    public void add(T item) {       //Добавление нового элемента
        
        if (items.size() == n) {
            items.removeFirst();        //Удаление последнего, если очередь забита
        }

        items.addLast(item);
    }

    public boolean remove(T item) {
        return items.remove(item);
    }

    public boolean exist(T item) {
        return items.contains(item);
    }

    public T getFirst() {
        return items.getFirst();
    }

    public T getLast() {
        return items.getLast();
    }
    public T getItemByIndex(int id) {
        int currentIndex = 0;
        for (T t : items) {
            if (currentIndex == id) {
                return t;
            }
            currentIndex++;
        }
        return null;
    }



    @Override
    public String toString() {
        return items.toString();
    }


    


}