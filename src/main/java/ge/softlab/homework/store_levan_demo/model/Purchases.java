package ge.softlab.homework.store_levan_demo.model;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "purchases")
@SequenceGenerator(name = "purchasesIdGenerator", sequenceName = "purchases_id_seq", allocationSize = 1)
public class Purchases {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "purchasesIdGenerator")
    private Integer id;
    @Column(name = "product_id")
    private Integer product_id;
    @Column(name = "purchase_price")
    private Integer purchase_price;
    @Column(name = "purchase_date")
    private Timestamp purchase_date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(Integer purchase_price) {
        this.purchase_price = purchase_price;
    }

    public Timestamp getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Timestamp purchase_date) {
        this.purchase_date = purchase_date;
    }

    public Purchases(){


    }

}



