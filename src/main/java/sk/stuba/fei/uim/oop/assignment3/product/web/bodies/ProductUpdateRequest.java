package sk.stuba.fei.uim.oop.assignment3.product.web.bodies;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductUpdateRequest {
    private String name;
    private String description;
    private int amount;
    private String unit;
    private double price;
}
