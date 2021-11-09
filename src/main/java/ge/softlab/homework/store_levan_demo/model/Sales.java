package ge.softlab.homework.store_levan_demo.model;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "sales")
@SequenceGenerator(name = "salesIdGenerator", sequenceName = "sales_id_seq", allocationSize = 1)
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "salesIdGenerator")
    private Integer id;
    @Column(name = "product_id")
    private Integer product_id;
    @Column(name = "sell_price")
    private Integer sell_price;
    @Column(name = "sell_date")
    private Timestamp sell_date;


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

    public Integer getSell_price() {
        return sell_price;
    }

    public void setSell_price(Integer sell_price) {
        this.sell_price = sell_price;
    }

    public Timestamp getSell_date() {
        return sell_date;
    }

    public void setSell_date(Timestamp sell_date) {
        this.sell_date = sell_date;
    }

    public Sales(){


    }

}