package ge.softlab.homework.store_levan_demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "categories")
@SequenceGenerator(name = "categoriesIdGenerator", sequenceName = "categories_id_seq", allocationSize = 1)
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoriesIdGenerator")
    private Integer id;
    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "category_name")
    private String categoryName;

}