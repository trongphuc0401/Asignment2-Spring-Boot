package vn.edu.likelion.Asignment2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serial;

/**
 * UserEntity -
 *
 * @param
 * @return
 * @throws
 */
@Table(name = "tbl1_users")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class UserEntity extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(unique = true , nullable = false)
    private String username;

    @Column(nullable = false , length = 50)
    private String email;

    @Column
    private String password;


}
