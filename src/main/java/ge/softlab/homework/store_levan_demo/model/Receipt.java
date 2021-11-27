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
@Table(name = "receipts")
@SequenceGenerator(name = "receiptsIdGenerator", sequenceName = "receipts_id_seq", allocationSize = 1)
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "receiptsIdGenerator")
    private Integer id;
    @Column(name = "receipt_date")
    private LocalDateTime receiptDate;
    @Column(name = "sum_price")
    private Double sumPrice;

}