package vn.edu.likelion.Asignment2.services;

import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * InterfaceBaseService -
 *
 * @param
 * @return
 * @throws
 */
public interface InterfaceBaseService <T,ID>{
    T create(T t);
    T update(T t);
    void delete(T t);
    void deleteAll(List<T> ts);
    T getById(ID id);
    List<T> getAll();
}
