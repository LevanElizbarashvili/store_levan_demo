package ge.softlab.homework.store_levan_demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "purchases")
@SequenceGenerator(name = "purchasesIdGenerator", sequenceName = "purchases_id_seq", allocationSize = 1)
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "purchasesIdGenerator")
    private Integer id;
    @Column(name = "product_id")
    private String productId;
    @Column(name = "purchase_price")
    private Integer purchasePrice;
    @Column(name = "purchase_date")
    private LocalDateTime purchaseDate;

}
