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
@Table(name = "sales")
@SequenceGenerator(name = "salesIdGenerator", sequenceName = "sales_id_seq", allocationSize = 1)
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "salesIdGenerator")
    private Integer id;
    @Column(name = "product_id")
    private String productId;
    @Column(name = "sell_price")
    private Double sellPrice;
    @Column(name = "sell_date")
    private LocalDateTime sellDate;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "receipt_id")
    private Integer receiptId;

}
