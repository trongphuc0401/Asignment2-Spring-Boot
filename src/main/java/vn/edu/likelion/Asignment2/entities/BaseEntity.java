package vn.edu.likelion.Asignment2.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * BaseEntity -
 *
 * @param
 * @return
 * @throws
 */

@MappedSuperclass
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true,updatable = false)
    private Date createTime;

    @Column(nullable = true , insertable = false)
    private Date updateTime;



}
