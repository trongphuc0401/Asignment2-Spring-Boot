package vn.edu.likelion.Asignment2.services.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.likelion.Asignment2.entities.UserEntity;
import vn.edu.likelion.Asignment2.repository.UserRepository;

import java.util.List;

/**
 * UserServiceImpl -
 *
 * @param
 * @return
 * @throws
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity create(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity update(UserEntity userEntity) {
        return null;
    }

    @Override
    public void delete(UserEntity userEntity) {

    }

    @Override
    public void deleteAll(List<UserEntity> userEntities) {

    }

    @Override
    public UserEntity getById(Integer integer) {
        return null;
    }

    @Override
    public List<UserEntity> getAll() {
        return List.of();
    }
}
