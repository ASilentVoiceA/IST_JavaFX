package gateway;

import java.util.List;

public interface Gateway<T> {
    List<T> all();
    T find(int index);
    void insert(T object);
    void update(T object);
    void delete(int index);
}
