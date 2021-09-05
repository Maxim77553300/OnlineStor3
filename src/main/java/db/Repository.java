package db;

import java.util.List;

public interface Repository<T> {

    void add(T entity);

    List<T> findAll();


}
