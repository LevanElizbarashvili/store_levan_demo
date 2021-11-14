package ge.softlab.homework.store_levan_demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String eanCode;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "description")
    private String description;
    @Column(name = "maker_id")
    private Integer makerId;
    @Column(name = "category_Id")
    private Integer categoryId;
    @Column(name = "sell_price")
    private Integer sellPrice;
    @Column(name = "remaining")
    private Integer remaining;

}