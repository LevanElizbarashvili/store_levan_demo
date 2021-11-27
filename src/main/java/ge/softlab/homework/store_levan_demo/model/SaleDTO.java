package ge.softlab.homework.store_levan_demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SaleDTO {

    private String id;
    private Integer quantity;
    private Double price;

}
