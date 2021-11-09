package ge.softlab.homework.store_levan_demo.model;

import javax.persistence.*;


@Entity
@Table(name = "categories")
@SequenceGenerator(name = "categoriesIdGenerator", sequenceName = "categories_id_seq", allocationSize = 1)
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoriesIdGenerator")
    private Integer id;
    @Column(name = "parent_id")
    private Integer parent_id;
    @Column(name = "category_name")
    private String category_name;

    public Categories(){


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
