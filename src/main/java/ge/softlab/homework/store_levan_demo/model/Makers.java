package ge.softlab.homework.store_levan_demo.model;

import javax.persistence.*;


@Entity
@Table(name = "makers")
@SequenceGenerator(name = "makersIdGenerator", sequenceName = "makers_id_seq", allocationSize = 1)
public class Makers {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "makersIdGenerator")
    private Integer id;
    @Column(name = "maker_name")
    private String maker_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaker_name() {
        return maker_name;
    }

    public void setMaker_name(String maker_name) {
        this.maker_name = maker_name;
    }

    public Makers(){


    }

}
