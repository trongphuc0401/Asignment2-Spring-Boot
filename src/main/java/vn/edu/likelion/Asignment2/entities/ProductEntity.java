package vn.edu.likelion.Asignment2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.util.List;

/**
 * ProductEntity -
 *
 * @param
 * @return
 * @throws
 */

@Table(name = "tbl1_products")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductEntity extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column (nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "tbl_product_attribute",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id")

    )

    private List<AttributeEntity> attributes;
}
