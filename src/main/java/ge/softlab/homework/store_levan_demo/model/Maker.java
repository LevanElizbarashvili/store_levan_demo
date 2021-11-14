package ge.softlab.homework.store_levan_demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "makers")
@SequenceGenerator(name = "makersIdGenerator", sequenceName = "makers_id_seq", allocationSize = 1)
public class Maker {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "makersIdGenerator")
    private Integer id;
    @Column(name = "maker_name")
    private String makerName;

}