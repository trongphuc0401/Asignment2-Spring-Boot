package vn.edu.likelion.Asignment2.services;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * BaseService -
 *
 * @param
 * @return
 * @throws
 */
public abstract class BaseService <T,ID> implements InterfaceBaseService<T,ID> {

    protected JpaRepository<T, ID> genericRepository;

    public BaseService(JpaRepository<T, ID> genericRepository) {
        this.genericRepository = genericRepository;
    }

    public T save(T t) {
        return this.genericRepository.save(t);
    }

    public List<T> saveAll(List<T> ts) {
        return this.genericRepository.saveAll(ts);
    }

    public void delete(T t) {
        this.genericRepository.delete(t);
    }

    public void deleteAll(List<T> ts) {
        this.genericRepository.deleteAll(ts);
    }

    public T getById(ID id) {
        return this.genericRepository.findById(id).orElse(null);
    }

    public List<T> getAll() {
        return this.genericRepository.findAll();
    }

    public List<T> getAll(Sort sort) {
        return this.genericRepository.findAll(sort);
    }

}
