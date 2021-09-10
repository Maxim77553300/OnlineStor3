package db;

import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {

    void add(T entity) throws SQLException;

    List<T> findAll() throws SQLException;

    void delete(T entity);


}
