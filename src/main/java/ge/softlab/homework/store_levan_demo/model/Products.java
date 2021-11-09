package ge.softlab.homework.store_levan_demo.model;

import javax.persistence.*;


@Entity
@Table(name = "products")
public class Products {

    @Id
    private String ean_code;
    @Column(name = "product-name")
    private String product_name;
    @Column(name = "description")
    private String description;
    @Column(name = "maker-id")
    private Integer maker_id;
    @Column(name = "category_Id")
    private Integer category_id;
    @Column(name = "sell_price")
    private int sell_price;
    @Column(name = "Remaining")
    private int remaining;

    public String getEan_code() {
        return ean_code;
    }

    public void setEan_code(String ean_code) {
        this.ean_code = ean_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMaker_id() {
        return maker_id;
    }

    public void setMaker_id(Integer maker_id) {
        this.maker_id = maker_id;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public int getSell_price() {
        return sell_price;
    }

    public void setSell_price(int sell_price) {
        this.sell_price = sell_price;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }



    public Products(){


    }

}
