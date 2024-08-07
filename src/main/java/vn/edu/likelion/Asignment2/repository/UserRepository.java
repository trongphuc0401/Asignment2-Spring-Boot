package vn.edu.likelion.Asignment2.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.likelion.Asignment2.entities.UserEntity;
import java.util.Optional;

/**
 * UserRepository -
 *
 * @param
 * @return
 * @throws
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}
