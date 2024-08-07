package vn.edu.likelion.Asignment2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serial;
import java.util.List;

/**
 * WarehouseEntity -
 *
 * @param
 * @return
 * @throws
 */

@Table(name = "tbl1_warehouse")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WarehouseEntity  extends BaseEntity{
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(unique = true,nullable = false)
    @NonNull
    private String name;
    @Column
    private String address;

    @OneToOne
    @JoinColumn(referencedColumnName = "id", name = "user_id")
    private UserEntity user_id;

    @ManyToMany
    @JoinTable(name = "tbl_warehouse_product_",
            joinColumns = @JoinColumn(name = "warehouse_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")

    )

    private List<ProductEntity> productEntities;
}
